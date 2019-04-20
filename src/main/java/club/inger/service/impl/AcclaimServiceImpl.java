package club.inger.service.impl;

import club.inger.dto.ResponseData;
import club.inger.dto.ResultObject;
import club.inger.entity.Comment;
import club.inger.entity.Zan;
import club.inger.model.News;
import club.inger.model.Users;
import club.inger.service.AcclaimService;
import club.inger.util.ResponseDataUtil;
import club.inger.util.jedis.JedisClient;
import club.inger.util.jedis.JedisClientCluster;
import com.jfinal.plugin.activerecord.Db;
import lab.recommend.algorithms.RecommendKit;
import lab.recommend.contentbasedrecommend.CustomizedHashMap;
import lab.recommend.contentbasedrecommend.TFIDF;
import org.ansj.app.keyword.Keyword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by inger on 2019/4/14.
 */
public class AcclaimServiceImpl implements AcclaimService {
    @Override
    public ResultObject updateAcclaim(int type, Zan zan) {
        //新闻
        /*if(type==0){
            club.inger.model.Comment commentDao = new club.inger.model.Comment();
            club.inger.model.Comment co = commentDao.findFirst("SELECT * FROM COMMENT WHERE news_unique_key = "+comment.getNewsUniqueKey());
            String sql = "UPDATE news SET news_count = "+co.getAcclaimCount()+1 +"WHERE unique_key ="+comment.getNewsUniqueKey();
            Db.update(sql);

        }else{

        }*/

        try{
            club.inger.model.Zan zanDao = new club.inger.model.Zan();
            String uerKey = zan.getUserUniqueKey();

            String typeId = zan.getTypeId();
            club.inger.model.Zan zandata = zanDao.findFirst("SELECT * FROM zan WHERE user_unique_key = "+"'"+uerKey+"'"+"AND type_id = "+"'"+zan.getTypeId()+"'");
            System.out.println("SELECT * FROM zan WHERE user_unique_key = "+"'"+uerKey+"'"+" AND type_id = "+"'"+zan.getTypeId()+"'");
            if(zandata == null){
                /*zanDao.setAcclaimStatus(1);
                zanDao.setCommentUniqueKey(zan.getCommentUniqueKey());
                zanDao.setNewsUniqueKey(zan.getNewsUniqueKey());
                zanDao.setUserUniqueKey(zan.getUserUniqueKey());
                zanDao.setTypeId(zan.getTypeId());
                zanDao.setAcclaimType(zan.getAcclaimType());
                zanDao.setAcclaimCount(1L);
                zanDao.dao();*/
                String sql = "INSERT INTO zan(type_id,acclaim_type,acclaim_status,acclaim_count,user_unique_key) VALUES("+"'"+zan.getTypeId()+"'"+","+zan.getAcclaimType()+",1"+",1"+","+"'"+zan.getUserUniqueKey()+"'"+")";
                Db.update(sql);
                Db.update("UPDATE comment SET acclaim_count = 1"+" WHERE  comment_unique_key = "+"'"+zan.getTypeId()+"'");

            }else {
              //  Db.update("UPDATE zan SET acclaim_count ="+(zandata.getAcclaimCount()+1)+" WHERE user_unique_key = "+"'"+zan.getUserUniqueKey()+"'"+"AND type_id = "+"'"+zan.getTypeId()+"'");
               // Db.update("UPDATE comment SET acclaim_count ="+(zandata.getAcclaimCount()+1)+" WHERE  comment_unique_key = "+"'"+zan.getTypeId()+"'");

              //  System.out.println("UPDATE zan SET acclaim_count ="+(zandata.getAcclaimCount()+1)+" WHERE user_unique_key = "+"'"+zan.getUserUniqueKey()+"'"+"AND comment_unique_key = "+"'"+zan.getTypeId()+"'");
            }

        }catch (Exception e){
            System.out.println(e.getStackTrace());
            return ResponseDataUtil.result("成功的返回",0,"-1",new ResponseData(-1,"出现异常",null));
        }
        Users users = new Users();
        Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+zan.getUserUniqueKey()+"'");
        Long userId = usersdata.getId();
        News news = new News();

        if(type==1){
            long newsid = news.findFirst("SELECT * FROM news WHERE unique_key="+"'"+zan.getTypeId()+"'").getId();
            new Thread(new TFIDFChangeThread(1,userId,newsid)).start();
        }



        return ResponseDataUtil.result("成功的返回",0,"1",new ResponseData(1,"更新成功",null));
    }

    @Override
    public ResultObject cancelAcclaim(int type,  Zan zan) {
        try{
            club.inger.model.Zan zanDao = new club.inger.model.Zan();
            club.inger.model.Zan zandata = zanDao.findFirst("SELECT * FROM zan WHERE user_unique_key = "+"'"+zan.getUserUniqueKey()+"'"+"AND type_id = "+"'"+zan.getTypeId()+"'");
            System.out.println("SELECT * FROM zan WHERE user_unique_key = "+"'"+zan.getUserUniqueKey()+"'"+"AND type_id = "+"'"+zan.getTypeId()+"'");
            Db.update("DELETE FROM zan WHERE "+"  user_unique_key = "+"'"+zan.getUserUniqueKey()+"'"+" AND type_id = "+"'"+zan.getTypeId()+"'");

          // Db.update("UPDATE comment SET acclaim_count ="+(zandata.getAcclaimCount()-1)+" WHERE  comment_unique_key = "+"'"+zan.getTypeId()+"'");
          //  System.out.println("UPDATE zan SET acclaim_count ="+(zandata.getAcclaimCount()-1)+" ,acclaim_status = 0"+" WHERE user_unique_key = "+"'"+zan.getUserUniqueKey()+"'"+"AND type_id = "+"'"+zan.getTypeId()+"'");

        }catch (Exception e){
            System.out.println(e.getStackTrace());
            return ResponseDataUtil.result("成功的返回",0,"-1",new ResponseData(-1,"出现异常",null));
        }
        Users users = new Users();
        Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+zan.getUserUniqueKey()+"'");
        Long userId = usersdata.getId();
        News news = new News();
        if(type==1){
            long newsid = news.findFirst("SELECT * FROM news WHERE unique_key="+"'"+zan.getTypeId()+"'").getId();
            new Thread(new TFIDFChangeThread(-1,userId,newsid)).start();
        }

        return ResponseDataUtil.result("成功的返回",0,"1",new ResponseData(1,"更新成功",null));
    }
    }

