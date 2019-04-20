package club.inger.service.impl;

import club.inger.dto.ResponseData;
import club.inger.dto.ResultComment;
import club.inger.dto.ResultObject;
import club.inger.entity.Comment;

import club.inger.model.News;
import club.inger.model.Users;
import club.inger.model.Zan;
import club.inger.service.CommentService;
import club.inger.util.EncodeUtil;
import club.inger.util.ResponseDataUtil;
import club.inger.util.SensitiveWord;
import club.inger.util.jedis.JedisClient;
import club.inger.util.jedis.JedisClientCluster;
import com.alibaba.fastjson.JSON;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by inger on 2019/4/14.
 */
public class CommentServiceImpl implements CommentService {
    @Override
    public ResultObject updateComent(Comment comment) {
        try{
           /* String inserSql = "INSERT INTO COMMENT(news_unique_key,comment_unique_key,user_unique_key,content,comment_time,compose_type) VALUES"+"("+comment.getNewsUniqueKey()+","+comment.getCommentUniqueKey()+","+comment.getUserUniqueKey()+","+comment.getContent()+","+comment.getCommentTime()+","+comment.getComposeType()+")";
            String updateSql = "UPDATE COMMENT SET comment_count="+comment.getCommentCount()+1+" WHERE  news_unique_key="+ comment.getNewsUniqueKey()+" AND comment_unique_key =" +comment.getNewsUniqueKey()+"AND user_unique_key ="+comment.getUserUniqueKey();
            Db.update(inserSql);
            Db.update(updateSql);*/
            SensitiveWord sw = new SensitiveWord("CensorWords.txt");
            sw.InitializationWork();
            club.inger.model.Comment co = new club.inger.model.Comment();
            co.setCommentTime(comment.getCommentTime());
            co.setCommentUniqueKey(comment.getCommentUniqueKey());
            co.setComposeType(comment.getComposeType());
            co.setNewsUniqueKey(comment.getNewsUniqueKey());
            co.setUserUniqueKey(comment.getUserUniqueKey());
           //  String str= new String(comment.getContent().getBytes("ISO-8859-1"),"UTF-8");
            //System.out.println(sw.filterInfo(str));
            String str = comment.getContent();
          //  System.out.println(str);
          //  System.out.println(EncodeUtil.getEncoding(str));
            co.setContent(sw.filterInfo(str));

            //co.setCommentTime(comment.getCommentTime());
            co.save();
            if("1".equals(comment.getComposeType())){
                Users users = new Users();
                Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+comment.getUserUniqueKey()+"'");
                Long userId = usersdata.getId();
                News news = new News();
                long newsid = news.findFirst("SELECT * FROM news WHERE unique_key="+"'"+comment.getNewsUniqueKey()+"'").getId();
                new Thread(new TFIDFChangeThread(1,userId,newsid)).start();
            }

            //club.inger.model.Comment commentdata = co.findFirst("SELECT *FROM COMMENT WHERE  user_unique_key = "+"'"+comment.getUserUniqueKey()+"'"+" AND comment_unique_key = "+"'"+comment.getCommentUniqueKey()+"'");
         //   News news  = new News();
          //  News data = news.findFirst("SELECT *FROM news WHERE  unique_key = "+"'"+comment.getCommentUniqueKey()+"'");
//
         //   Db.update("UPDATE comment SET comment_count="+(commentdata.getCommentCount()+1)+" WHERE  news_unique_key="+ "'"+comment.getNewsUniqueKey()+"'");
          //  if(data!=null){
           // Db.update("UPDATE comment SET news_count="+(data.getNewsCount()+1)+" WHERE  unique_key="+ "'"+comment.getNewsUniqueKey()+"'");}
           // System.out.println("UPDATE comment SET comment_count="+(commentdata.getCommentCount()+1)+" WHERE  news_unique_key="+ "'"+comment.getNewsUniqueKey()+"'");

        }catch (Exception e){
            System.out.println(e.getStackTrace());
            return ResponseDataUtil.result("成功的返回",0,"-1",new ResponseData(-1,"出现异常",null));
        }

        return ResponseDataUtil.result("成功的返回",0,"1",new ResponseData(1,"更新成功",null));
    }

    @Override
    public ResultObject getComent(Comment comment) {

        List<Record> data = new ArrayList<>();

        News news = new News();
        News newsdata = news.findFirst("SELECT news_count FROM news WHERE unique_key = "+"'"+comment.getNewsUniqueKey()+"'");

        System.out.println("NEWSdata:---------------------"+newsdata);
        Zan zan = new Zan();
        Zan zanData = zan.findFirst("SELECT * FROM zan WHERE type_id =  "+"'"+comment.getNewsUniqueKey()+"'"+" AND user_unique_key = "+"'"+comment.getUserUniqueKey()+"'");
        Zan zan1 = zan.findFirst("SELECT SUM(acclaim_count)AS acclaimCount  FROM zan  WHERE type_id ="+"'"+comment.getNewsUniqueKey()+"'");

        System.out.println("zanDAta------------------------"+zanData);
       Record record = new Record();
       try{
           Long count = Db.queryLong("SELECT COUNT(comment_unique_key) FROM COMMENT WHERE news_unique_key = '"+comment.getNewsUniqueKey()+"'");
           record.set("commentCount",count);
           System.out.println("commentCount------------"+count);

       }catch (Exception e){
           record.set("commentCount",0);
       }
       try {

           Long accCount = Db.queryLong("SELECT COUNT(*) FROM zan WHERE type_id = '"+comment.getNewsUniqueKey()+"'");
           System.out.println("acclaimCount------------"+accCount);
           record.set("acclaimCount",accCount);
       }catch (Exception E){
           System.out.println();
           record.set("acclaimCount",0);
       }
      /* if(zan1==null||zan1.get("acclaimCount")==null){
           record.set("acclaimCount",0);
       }else {
           System.out.println(zan1.toString());
           System.out.println(zan1.toString().charAt(14));
           record.set("acclaimCount",Integer.parseInt(String.valueOf(zan1.toString().charAt(14))));
       }*/

       if(zanData==null||zanData.get("acclaim_status")==null){
           record.set("acclaimStatus",0);
       }else {
           record.set("acclaimStatus",zanData.getAcclaimStatus());
       }

        System.out.println("recod--------------------"+record);
       data.add(record);


        String listSql = "SELECT  comment_time AS commentTime,content ,comment_unique_key,news_unique_key FROM comment  WHERE  comment.news_unique_key = '"+comment.getNewsUniqueKey()+"'  GROUP BY comment_unique_key";
        System.out.println(listSql);
        List<Record> list =Db.find(listSql);
        System.out.println("-------------------------------------------------------------------------"+list.size());
        if (list==null||list.size()==0){
            //return ResponseDataUtil.result("成功的返回",0,"1",new ResponseData(1,"无评论",null));
           /* Record re = new Record();
            record.set("name",null);
            record.set("commentTime",null);
            record.set("content",null);
            record.set("imageType",0);
            data.add(re);*/
        }else {
            for (int i = 0; i < list.size(); i++){
                Record user_comment = list.get(i);
                String  comment_unique_key = user_comment.get("comment_unique_key");
                Record userData =Db.findFirst("SELECT user_name AS name ,image_type AS imageType FROM users,comment WHERE comment.user_unique_key= users.unique_key AND comment_unique_key ='"+comment_unique_key+"'");
                user_comment.set("name",userData.get("name"));
                user_comment.set("imageType",userData.get("imageType"));
                try{
                    System.out.println("acclaimStatus"+"SELECT acclaim_status FROM zan WHERE type_id ='"+comment_unique_key+"' AND user_unique_key = '"+comment.getUserUniqueKey()+"'");
                    int acclaim_status = Db.queryInt("SELECT acclaim_status FROM zan WHERE type_id ='"+comment_unique_key+"' AND user_unique_key = '"+comment.getUserUniqueKey()+"'");

                    user_comment.set("acclaimStatus",acclaim_status);
                }catch (Exception e){

                    user_comment.set("acclaimStatus",0);
                }

                try{
                    long acclaim_count = Db.queryLong("SELECT COUNT(acclaim_count) AS acclaim_count FROM zan  WHERE type_id= '"+comment_unique_key+"'");
                    user_comment.set("acclaimCount",acclaim_count);
                }catch (Exception E){
                    user_comment.set("acclaimCount",0);
                }

                data.add(user_comment);
            }
        }

        return ResponseDataUtil.Commentresult("成功的返回",0,"1",data);
    }
}
