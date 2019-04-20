/**
 * 
 */
package lab.recommend.UserBasedCollaborativeRecommender.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import lab.recommend.UserBasedCollaborativeRecommender.MahoutUserBasedCollaborativeRecommender;

import java.util.List;

/**
 * @author 310Lab
 * @email 983233165@qq.com
 * @github https://github.com/jiancongjin
 * @date 2019年4月23日
 * 每天定时根据用户当日的新闻浏览记录来更新用户的喜好关键词列表
 */
public class CFJob implements Job
{
	@SuppressWarnings("unchecked")
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException
	{
		List<Long> users=(List<Long>) arg0.getJobDetail().getJobDataMap().get("users");
		new MahoutUserBasedCollaborativeRecommender().recommend(users,0);
	}

}

