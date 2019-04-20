package lab.recommend.algorithms;

import club.inger.model.News;
import com.jfinal.plugin.activerecord.Db;
import lab.recommend.contentbasedrecommend.CustomizedHashMap;
import lab.recommend.contentbasedrecommend.TFIDF;
import org.ansj.app.keyword.Keyword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by inger on 2019/4/17.
 */
public class TFIDFKit {
    public static void TfidfUp(long userId, long  newsId){
        //函数需要传入List
        ArrayList<Long> userList = new ArrayList<Long>();
        // long userId = 1L;
        userList.add(userId);
        // int newsId = 2;
        String sql = "select * from news where id = "+newsId;
        News news = News.dao.findFirst(sql);
        //新闻关键字
        List<Keyword> keywordList= TFIDF.getTFIDE(news.getTitle(), news.getContent(), 10);
        //用户偏好表
        HashMap<Long, CustomizedHashMap<Integer, CustomizedHashMap<String, Double>>> userPrefListMap = RecommendKit.getUserPrefListMap(userList);

        //获得对应模块的（关键词：喜好）map
        Integer moduleId = news.getModuleId();
        CustomizedHashMap<String,Double> rateMap=userPrefListMap.get(userId).get(moduleId);
        Iterator<Keyword> keywordIte=keywordList.iterator();
        while(keywordIte.hasNext()){
            Keyword keyword=keywordIte.next();
            String name=keyword.getName();
            if(rateMap.containsKey(name)){
                rateMap.put(name, rateMap.get(name)+keyword.getScore());
            }
            else{
                rateMap.put(name,keyword.getScore());
            }
        }
        //写库
        try
        {
            Db.update("update users set pref_list='"+userPrefListMap.get(userId)+"' where id=?",userId);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
    public static void TfidfDown(long userId,long newsId){
        //函数需要传入List
        ArrayList<Long> userList = new ArrayList<Long>();
        // long userId = 1L;
        userList.add(userId);
        // int newsId = 2;
        String sql = "select * from news where id = "+newsId;
        News news = News.dao.findFirst(sql);
        //新闻关键字
        List<Keyword> keywordList= TFIDF.getTFIDE(news.getTitle(), news.getContent(), 10);
        //用户偏好表
        HashMap<Long, CustomizedHashMap<Integer, CustomizedHashMap<String, Double>>> userPrefListMap = RecommendKit.getUserPrefListMap(userList);

        //获得对应模块的（关键词：喜好）map
        Integer moduleId = news.getModuleId();
        CustomizedHashMap<String,Double> rateMap=userPrefListMap.get(userId).get(moduleId);
        Iterator<Keyword> keywordIte=keywordList.iterator();
        while(keywordIte.hasNext()){
            Keyword keyword=keywordIte.next();
            String name=keyword.getName();
            if(rateMap.containsKey(name)){
                rateMap.put(name, rateMap.get(name)-keyword.getScore());
            }
            else{
                rateMap.put(name,keyword.getScore()*-1);
            }
        }
        //写库
        try
        {
            Db.update("update users set pref_list='"+userPrefListMap.get(userId)+"' where id=?",userId);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
