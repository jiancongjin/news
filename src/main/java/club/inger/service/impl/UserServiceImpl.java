package club.inger.service.impl;


import club.inger.dto.ResponseData;
import org.apache.log4j.Logger;
import club.inger.dto.ResultObject;
import club.inger.entity.Collect;
import club.inger.entity.NewsLogs;
import club.inger.model.News;
import club.inger.model.Users;
import club.inger.service.UserService;
import club.inger.util.ResponseDataUtil;
import com.jfinal.plugin.activerecord.Db;
import lab.recommend.algorithms.PropGetKit;
import lab.recommend.dbconnection.DBKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
;


public class UserServiceImpl implements UserService {
   public static final Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Override
    public ResultObject insertUser(club.inger.entity.Users user) {
        Users userDao = new Users();
        userDao.setImageType(user.getImageType());
        userDao.setUserName(user.getUserName());
        userDao.setUniqueKey(user.getUniqueKey());
        if(user.getLatitude()==0&&user.getLongitude()==0){

            userDao.setLatitude(29.5700382003);
            userDao.setLongitude(106.5569543991);
        }else{
            userDao.setLatitude(user.getLatitude());
            userDao.setLongitude(user.getLongitude());
        }

        userDao.setPrefList("{\"1\":{},\"2\":{},\"3\":{},\"4\":{},\"5\":{},\"6\":{},\"7\":{},\"8\":{},\"9\":{},\"10\":{},\"11\":{},\"12\":{},\"13\":{},\"14\":{},\"15\":{},\"16\":{},\"17\":{}}");
        userDao.save();
      /*  try{

            Users userDao = new Users();
            userDao.setImageType(user.getImageType());
            userDao.setUserName(user.getUserName());
            userDao.setUniqueKey(user.getUniqueKey());
            if(user.getLatitude()==0&&user.getLongitude()==0){

                userDao.setLatitude(29.5700382003);
               userDao.setLongitude(106.5569543991);
            }else{
               userDao.setLatitude(user.getLatitude());
               userDao.setLongitude(user.getLongitude());
            }

            userDao.setPrefList("{\"1\":{},\"2\":{},\"3\":{},\"4\":{},\"5\":{},\"6\":{},\"7\":{},\"8\":{},\"9\":{},\"10\":{},\"11\":{},\"12\":{},\"13\":{},\"14\":{},\"15\":{},\"16\":{},\"17\":{}}");
            userDao.save();
        }catch (Exception e){
            logger.trace("注册失败",e);
            System.out.println(e.getStackTrace());
            return ResponseDataUtil.result("成功返回",0,"1",new ResponseData(-1,"注册失败",null));
        }*/

        return ResponseDataUtil.result("成功返回",0,"1",new ResponseData(0,"注册成功",null));
    }

    @Override
    public ResultObject saveHistory(NewsLogs hostory) {
       /* try{
            Users users = new Users();
            Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+hostory.getUserUniqueKey()+"'");
            News news = new News();
            News newsdata = news.findFirst("SELECT * FROM news WHERE unique_key = "+"'"+hostory.getNewsUniqueKey()+"'");
            club.inger.model.NewsLogs newsLogsDao = new club.inger.model.NewsLogs();
            newsLogsDao.setNewsUniqueKey(hostory.getNewsUniqueKey());
            newsLogsDao.setUserUniqueKey(hostory.getUserUniqueKey());
            newsLogsDao.setNewsTitle(hostory.getNewsTitle());
            newsLogsDao.setNewsType(hostory.getNewsType());
            newsLogsDao.setNewsUrl(hostory.getNewsUrl());
            //newsLogsDao.setNewsId(usersdata.getId());
            newsLogsDao.setNewsId(newsdata.getId());
            newsLogsDao.setUserId(usersdata.getId());
           // newsLogsDao.setViewTime(new Date());

            newsLogsDao.save();
        }catch (Exception e){
            return ResponseDataUtil.result("成功返回",0,"1",new ResponseData(-1,"历史记录保存失败",null));
        }*/
        Users users = new Users();
        Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+hostory.getUserUniqueKey()+"'");
        News news = new News();
        News newsdata = news.findFirst("SELECT * FROM news WHERE unique_key = "+"'"+hostory.getNewsUniqueKey()+"'");
        club.inger.model.NewsLogs newsLogsDao = new club.inger.model.NewsLogs();
        newsLogsDao.setNewsUniqueKey(hostory.getNewsUniqueKey());
        newsLogsDao.setUserUniqueKey(hostory.getUserUniqueKey());
        newsLogsDao.setNewsTitle(hostory.getNewsTitle());
        newsLogsDao.setNewsType(hostory.getNewsType());
        newsLogsDao.setNewsUrl(hostory.getNewsUrl());
        //newsLogsDao.setNewsId(usersdata.getId());
        newsLogsDao.setNewsId(newsdata.getId());
        newsLogsDao.setUserId(usersdata.getId());
        // newsLogsDao.setViewTime(new Date());

        newsLogsDao.save();
        return ResponseDataUtil.result("成功返回",0,"1",new ResponseData(0,"历史记录保存成功",null));
    }

    @Override
    public ResultObject updateCollect(Collect collect) {
        if(collect.getValue()==1){
            try{
                club.inger.model.Collect collectDao = new club.inger.model.Collect();
                collectDao.setCollectTime(new Date());
                collectDao.setNewsUniqueKey(collect.getNewsUniqueKey());
                collectDao.setUserUniqueKey(collect.getUserUniqueKey());
                collectDao.save();
                Users users = new Users();
                Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+collect.getUserUniqueKey()+"'");
                Long userId = usersdata.getId();
                News news = new News();
                long newsid = news.findFirst("SELECT * FROM news WHERE unique_key="+"'"+collect.getNewsUniqueKey()+"'").getId();
                new Thread(new TFIDFChangeThread(1,userId,newsid)).start();
                return ResponseDataUtil.result("成功返回",0,"1",new ResponseData(0,"收藏成功",null));
            }catch (Exception e){
                System.out.println(e.getStackTrace());
                return ResponseDataUtil.result("成功返回",0,"1",new ResponseData(0,"收藏失败",null));
            }

        }else {
            try{
               /* club.inger.model.Collect collectDao = new club.inger.model.Collect();
                collectDao.setNewsUniqueKey(collect.getNewsUniqueKey());
                collectDao.setUserUniqueKey(collect.getUserUniqueKey());
                collectDao.delete();*/
               Db.update("DELETE FROM collect WHERE user_unique_key ="+"'"+collect.getUserUniqueKey()+"'"+"AND news_unique_key ="+"'"+collect.getNewsUniqueKey()+"'");
                System.out.println("DELETE FROM collect WHERE user_unique_key ="+"'"+collect.getUserUniqueKey()+"'"+"AND news_unique_key ="+"'"+collect.getNewsUniqueKey()+"'");
                Users users = new Users();
                Users usersdata = users.findFirst("SELECT * FROM users WHERE unique_key = "+"'"+collect.getUserUniqueKey()+"'");
                Long userId = usersdata.getId();
                News news = new News();
                long newsid = news.findFirst("SELECT * FROM news WHERE unique_key="+"'"+collect.getNewsUniqueKey()+"'").getId();
                new Thread(new TFIDFChangeThread(1,userId,newsid)).start();
                return ResponseDataUtil.result("成功返回",0,"1",new ResponseData(0,"取消收藏成功",null));
            }catch (Exception e){
                System.out.println(e.getStackTrace());
                return ResponseDataUtil.result("成功返回",0,"1",new ResponseData(0,"取消收藏失败",null));
            }

        }

    }


}
