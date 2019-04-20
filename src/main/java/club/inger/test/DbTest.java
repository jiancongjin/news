package club.inger.test;

import club.inger.dto.ResponseData;
import club.inger.dto.ResultComment;
import club.inger.entity.*;
import club.inger.model.*;
import club.inger.model.Users;
import club.inger.model.Zan;
import club.inger.util.ResponseDataUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import lab.recommend.algorithms.PropGetKit;
import lab.recommend.dbconnection.DBKit;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by inger on 2019/4/12.
 */
public class DbTest {
    public static void main(String[] args) {
        PropGetKit.loadProperties("paraConfig");
        DBKit.initalize();
      /*  NewsLogs hostory = NewsLogs.dao.findFirst("select * from news_logs where id =3");
        System.out.println(hostory);
      //  Db.update("INSERT INTO news_modules(id,NAME) VALUES(21,\"test\")");
       Zan collect = new Zan();
        collect.setId(1l);
        collect.setStatus(1);
        collect.save();*/
      /*  Comment comment = new Comment();
        String sql = "SELECT *FROM COMMENT WHERE news_unique_key = 1";
        List<Comment> list = comment.find(sql);
        System.out.println(Arrays.toString(new List[]{list}));*/
       /* List<Record> resultComment =Db.find("SELECT NAME,comment_time,image_type,comment_count,content,acclaim_count FROM COMMENT,users WHERE COMMENT.user_unique_key = users.unique_key AND news_unique_key = 1");
        System.out.println(resultComment);*/
        /*club.inger.model.Collect collectDao = new club.inger.model.Collect();
        collectDao.setNewsUniqueKey("1");
        collectDao.setUserUniqueKey("1");
        collectDao.setId(1l);
        collectDao.delete();*/
      /*  Collect collect = new Collect();
        collect.setUserUniqueKey("user1");
        collect.setNewsUniqueKey("news1");
        Db.update("delete from collect where id =2");*/
     /*   Users userDao = new Users();
        userDao.setImageType(1);
        userDao.setName("1");
        userDao.setUniqueKey("222");
        userDao.save();*/
    /* Zan zan = new Zan();
     Zan zandata =zan.findFirst("SELECT * FROM zan WHERE user_unique_key = 'user1' AND type_id ='111' ");
        System.out.println(zandata);*/
      /*  club.inger.entity.Zan zan = new club.inger.entity.Zan();
        zan.setTypeId("type1");
        zan.setUserUniqueKey("user1");
        zan.setAcclaimType(1);
        String sql = "INSERT INTO zan(type_id,acclaim_type,acclaim_status,acclaim_count,user_unique_key) VALUES("+"'"+zan.getTypeId()+"'"+","+zan.getAcclaimType()+",1"+",1"+","+"'"+zan.getUserUniqueKey()+"'"+")";
        Db.update(sql);*/
       /* Users users =new Users();
        List<Users> data = (List<Users>) users.find("select *from users");
        System.out.println(data);

        String listSql = "SELECT zan.acclaim_count,acclaim_status,comment_count, user_name,comment_time,image_type,content FROM comment,users,zan WHERE comment.user_unique_key = users.unique_key AND comment.comment_unique_key =zan.comment_unique_key AND comment.news_unique_key  = "+"'"+"news1"+"'";
        //System.out.println(listSql);
        List<Record> list =Db.find(listSql);
        System.out.println(list.get(0).toJson());*/
     /*  Zan zan = new Zan();
        Zan zan1 = zan.findFirst("SELECT SUM(acclaim_count)AS acclaimCount  FROM zan  WHERE news_unique_key ='news1' ");*/
      /*  Users users = new Users();
        Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+"50e2b5f8-7f9b-4e7e-83ef-a21c05629af7"+"'");

        System.out.println(usersdata.getId());*/
      /*  Zan zan = new Zan();
        Zan zan1 = zan.findFirst("SELECT SUM(acclaim_count)AS acclaimCount  FROM zan  WHERE type_id ="+"'"+"7c629e9fdb6569e482a6a0c9db3760dd"+"'");
        System.out.println(zan1.toString());
        System.out.println(zan1.toString().charAt(14));
       // Integer z = Db.queryInt("SELECT SUM(acclaim_count)AS acclaimCount  FROM zan  WHERE type_id ="+"'"+"type1"+"'");
        //System.out.println(z);
        int count = Db.queryInt("SELECT COUNT(comment_unique_key) FROM COMMENT WHERE news_unique_key = '"+""+"'");
        System.out.println(  Db.queryInt("SELECT acclaim_status FROM zan WHERE type_id ='type1' AND user_unique_key = 'user1'"));*/
       // BigDecimal acclaim_count = new BigDecimal(Db.queryLong("SELECT SUM(acclaim_count) AS acclaim_count FROM zan  WHERE type_id= '"+"a6d084ab942e61eb41d919a96140e9bc"+"'"));
       // System.out.println(acclaim_count);
        //System.out.println(Db.queryInt("SELECT COUNT(*) FROM zan WHERE type_id = 'a6d084ab942e61eb41d919a96140e9bc'"));


     // int acclaim_status = Db.queryInt("SELECT acclaim_status FROM zan WHERE type_id ='"+"type1"+"' AND user_unique_key = '"+"user1"+"'");
       // long acclaim_count = Db.queryLong("SELECT COUNT(acclaim_count) AS acclaim_count FROM zan  WHERE type_id= '"+"a6d084ab942e61eb41d919a96140e9bc"+"'");
       // System.out.println(acclaim_count);
       // System.out.println(acclaim_status);
        int acclaim_status = Db.queryInt("SELECT acclaim_status FROM zan WHERE type_id ='"+"a6d084ab942e61eb41d919a96140e9bc"+"' AND user_unique_key = '"+"338f62c6-adc6-4314-9586-74b49be5a2c7"+"'");
        System.out.println(acclaim_status);

}
}
