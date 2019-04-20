package test;

import club.inger.model.NewsLogs;
import lab.recommend.main.JobSetter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inger on 2019/4/13.
 */
public class JobTest {
    public static void main(String[] args) {
        JobSetter jobSetter=new JobSetter(false,true,false);
       /* Db.update("update news set news_time=?",new Date());
        for(int id=1;id<8;id++) {
            Db.update("update users set latest_log_time=? where id=?", RecommendKit.getInRecTimestamp(25+id),id);
        }
        Db.update("update news_logs set view_time=?",new Date());*/
        List<Long> userList=new ArrayList<Long>();
        userList.add(1l);
        userList.add(2l);
        userList.add(3l);
        //NewsLogs hostory = NewsLogs.dao.findFirst("select * from news_logs where id =3");
       // System.out.println(hostory);
        NewsLogs newslogsList=NewsLogs.dao.findFirst("select * from news_logs where id = 1");
       // new UserPrefRefresher().refresh(userList);
    }
}
