package club.inger.service.impl;

import club.inger.dto.ResponseData;
import club.inger.dto.ResultObject;
import club.inger.model.News;
import club.inger.model.NewsLogs;
import club.inger.model.Recommendations;
import club.inger.model.Users;
import club.inger.service.NewsRecommendService;
import club.inger.util.NewsTypeConvert;
import club.inger.util.RandomUtil;
import club.inger.util.ReNewsThread;
import club.inger.util.ResponseDataUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.sun.prism.impl.Disposer;
import lab.recommend.algorithms.RecommendAlgorithm;
import lab.recommend.algorithms.RecommendKit;
import lab.recommend.contentbasedrecommend.CustomizedHashMap;
import lab.recommend.contentbasedrecommend.TFIDF;
import lab.recommend.main.JobSetter;
import org.ansj.app.keyword.Keyword;

import java.util.*;

/**
 * Created by inger on 2019/4/15.
 */
public class NewsRecommendServiceImpl implements NewsRecommendService {
    static int THRESHOLD = 100;
    public ResultObject getNews(String userId) {
        //RecommendAlgorithm algorithm = new RecommendAlgorithm();
        Users users = new Users();
        Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+userId+"'");
        Long id = usersdata.getId();
        Recommendations recommendations = new Recommendations();
        //查询推荐表
        List<Record> list = Db.find("SELECT recommendations.id,unique_key AS uniquekey,title,news_time AS date,category,author_name,url,thumbnail_pic_s FROM recommendations,news WHERE " +
                "recommendations.news_id = news.id AND user_id = "+id+" AND is_valid = 1 ORDER BY news_time DESC LIMIT 0,25");
        //将推荐表中的is_valid置为0
        for(int i=0;i<list.size();i++){
                System.out.println(list.get(i).getLong("id"));
                Db.update("UPDATE recommendations set is_valid =0 WHERE id =" +list.get(i).getLong("id"));
            }
        //检查是否需要执行推荐算法
        Long countRemain = new Recommendations().findFirst("select count(*) AS countRemain from recommendations WHERE user_id = "+id+" AND is_valid = 1").getLong("countRemain");
//        if(list==null||list.size()==0){
//            List<Long> userList=new ArrayList<Long>();
//            //新开一个
//            userList.add(id);
//            new JobSetter(true,true,true).executeInstantJobForCertainUsers(userList,0);
//        }
//        list = Db.find("SELECT recommendations.id,user_id,news_id,content,module_id,author_name,url FROM recommendations,news WHERE " +
//                "recommendations.news_id = news.id AND user_id = "+id+" AND is_valid = 1 ORDER BY news_time DESC LIMIT 0,25");
//        int supplement = 30;
//        if(list!=null){
//            //二次获取推荐表新闻可推荐数
//            supplement = 30-list.size();
//            for(int i=0;i<list.size();i++){
//                System.out.println(list.get(i).getLong("id"));
//                Db.update("UPDATE recommendations set is_valid =0 WHERE id =" +list.get(i).getLong("id"));
//            }
//        }
        int supplement = 30;
        if (list!=null&&list.size()>0){
            supplement = 30-list.size();
        }
        //查询最新新闻 补充推荐表不足

        List<Record> data = new ArrayList<>();
        //List<Integer> news_recommend_rate = RandomUtil.getRandomList(9,supplement);
        List<Record> news_type =  Db.find("SELECT  news.unique_key AS uniquekey,title,news_time AS date,author_name,url,thumbnail_pic_s,category FROM news WHERE news.id NOT IN (SELECT recommendations.news_id FROM recommendations WHERE recommendations.user_id = "+id+" UNION " +
                "SELECT news_logs.news_id FROM news_logs WHERE news_logs.user_id= "+id+")"  +
                " ORDER BY news.news_time DESC LIMIT 0,"+supplement);
        data.addAll(news_type);
       /* for(int i= 0;i< 9;i++){
            news_type = Db.find("SELECT  news.unique_key AS uniquekey,title,news_time AS date,author_name,url,thumbnail_pic_s,category FROM news WHERE news.id NOT IN (SELECT recommendations.news_id FROM recommendations WHERE recommendations.user_id = "+id+" UNION " +
                    "SELECT news_logs.news_id FROM news_logs WHERE news_logs.user_id= "+id+")" + " AND module_id = "+(i+1) +
                    " ORDER BY news.news_time DESC LIMIT 0,"+news_recommend_rate.get(i));
           // data.addAll(news_type);
        }*/
        News news = new News();

        //将最新新闻部分插入推荐表 算法标志位3
        for(int i=0;i<news_type.size();i++){

           // System.out.println(list.get(i).getLong("id"));
           // System.out.println(data.get(i).getStr("uniquekey"));
            long newsid = news.findFirst("SELECT * FROM news WHERE unique_key="+"'"+news_type.get(i).getStr("uniquekey")+"'").getId();

           // System.out.println("INSERT recommendations(user_id,news_id,derive_algorithm,is_valid) VALUES "+id+","+newsid+","+3+","+0");
          //  System.out.println("INSERT recommendations(user_id,news_id,derive_algorithm,is_valid) VALUES "+id+","+newsid+","+3+","+0);
            Db.update("INSERT recommendations(user_id,news_id,derive_algorithm,is_valid) VALUES "+"("+id+","+newsid+","+3+","+0+")");
        }


        if (list!=null&&list.size()>0){
            data.addAll(list);
        }
        //如果推荐表不为空 合并推荐结果和最新新闻 需在将最新新闻插入推荐库后进行，避免和此次的最新新闻重复
        if (countRemain < THRESHOLD){
            //------------------------------------------------------------------------新开一个线程执行推荐算法---------------------------------------------------------------------------------------------
            new Thread(new ReNewsThread(id,true,true,true)).start();

        }
        System.out.println("getNews--------------------------------------------");

        return ResponseDataUtil.newsResult("成功的返回",0,"1",data);
    }

    @Override
    public ResultObject getNews(String userId, String type) {
        //Map<String ,String> typeMap  =new HashMap<>();
        //typeMap.put();

        Users users = new Users();
        Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+userId+"'");
        Long id = usersdata.getId();

        List<Record> data = Db.find("SELECT  news.id,news.unique_key AS uniquekey,category,title,news_time AS date,author_name,url,thumbnail_pic_s FROM news,news_modules " +
                "WHERE news.module_id = news_modules.id AND news_modules.modules_name = '"+ new NewsTypeConvert().getType(type)+"' AND news.id NOT IN " +
                "(SELECT recommendations.news_id FROM recommendations " +
                "WHERE recommendations.user_id = "+id+" UNION " +
                "SELECT news_logs.news_id FROM news_logs WHERE news_logs.user_id= "+id+")" +
                "ORDER BY news.news_time DESC LIMIT 0,30");
        for (int i=0;i<data.size();i++){
            long newsid = data.get(i).getLong("id");
            Db.update("INSERT recommendations(user_id,news_id,derive_algorithm,is_valid) VALUES "+"("+id+","+newsid+","+3+","+0+")");
        }
        if (data.size() > 0){
            return ResponseDataUtil.newsResult("成功的返回",0,"1",data);
        }
        return ResponseDataUtil.newsResult("成功的返回",0,"0",data);
    }

    @Override
    public ResultObject  disLike(long userId, long  newsId,String feedbackContent) {


            Db.update("UPDATE news_logs SET prefer_degree = -1,feedbackContent = '"+feedbackContent+"' WHERE user_id = "+userId+" AND news_id = "+newsId );
            //todo TFIDFdpwn
            new Thread(new TFIDFChangeThread(1,userId,newsId)).start();
            return ResponseDataUtil.result("成功地返回",0,"1",new ResponseData(1,"",null));
        }

    }

