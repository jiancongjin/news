package lab.recommend.main;

import com.jfinal.plugin.activerecord.Db;
import lab.recommend.algorithms.RecommendKit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tom Qian
 * @email tomqianmaple@outlook.com
 * @github https://github.com/jiancongjin
 * @date 2017年12月13日
 */
public class TestDataRunner
{
	public void runTestData() {
		System.out.println("开始测试数据的运行！");
		
		//选择要在推荐系统中运行的推荐算法
		//协同过滤Collaborative Filtering，基于内容相似度的推荐Content-based,基于热点新闻推荐HotNewsRecommendation
		boolean enableCF=true,enableCB=true,enableHR=true;
		
		JobSetter jobSetter=new JobSetter(enableCF,enableCB,enableHR);
		
		//更新测试数据的时间
		databaseReady();
		
		List<Long> userList=new ArrayList<Long>();
		userList.add(1l);

		
		//为指定用户执行一次推荐
		jobSetter.executeInstantJobForCertainUsers(userList,0);
		
		System.out.println("测试数据运行结束！");
	}
	
	//对测试数据的相关日期数据进行更新，以保证能够在测试运行中获得理想的推荐结果。
	public void databaseReady() {
		Db.update("update news set news_time=?",new Date());
		for(int id=1;id<8;id++) {
			Db.update("update users set latest_log_time=? where id=?",RecommendKit.getInRecTimestamp(25+id),id);
		}
		Db.update("update news_logs set view_time=?",new Date());
		
		
	}
}

