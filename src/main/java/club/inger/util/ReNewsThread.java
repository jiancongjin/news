package club.inger.util;

import lab.recommend.main.JobSetter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by inger on 2019/4/17.
 */
public class ReNewsThread implements Runnable {
    private long userId;
    private boolean enableCF;
    private boolean enableCB;
    private boolean enableHR;
    public ReNewsThread(){

    }
    public ReNewsThread(long userId,boolean enableCF,boolean enableCB,boolean enableHR){
        this.enableCB = enableCB;
        this.enableCF =enableCF;
        this.enableHR  =enableHR;
        this.userId = userId;
    }
    @Override
    public void run() {
        List<Long> goalUsers = new ArrayList<>();
        goalUsers.add(userId);
        System.out.println("run-----------------------------------JobSetter1");
        new JobSetter(enableCF,enableCB,enableHR).executeInstantJobForCertainUsers(goalUsers,1);
        System.out.println("run----------------------------------JobSetter2");
    }
}
