package lab.recommend.main;

import com.google.common.annotations.VisibleForTesting;
import lab.recommend.algorithms.RecommendKit;
import org.apache.log4j.Logger;
import org.python.jline.internal.TestAccessible;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 310Lab
 * @email 983233165@qq.com
 * @github https://github.com/jiancongjin
 * @date 2019年4月20日
 * 推荐系统入口类，在此启动推荐系统。
 */
public class Main
{
	
	public static final Logger logger = Logger.getLogger(Main.class);
    
	/**
	 * 推荐系统运行入口
	 * @param args
	 */
	public static void main(String[] args)
	{
		//在测试数据上运行
		//new TestDataRunner().runTestData();
		
		
		//选择要在推荐系统中运行的推荐算法
		boolean enableCF=true,enableCB=true,enableHR=true;
		
		List<Long> userList=new ArrayList<Long>();
		//userList.add(1l);
		//userList.add(2l);
		//userList.add(3l);
		userList.add(1l);


		//为指定用户执行一次推荐
		new JobSetter(enableCF,enableCB,enableHR).executeInstantJobForCertainUsers(userList,0);

		//new JobSetter(true,false,false).executeInstantJobForCertainUsers(userList);
		//为活跃用户执行定时推荐
//		new JobSetter(enableCF,enableCB,enableHR).executeQuartzJobForActiveUsers();
	}


	
	
}

