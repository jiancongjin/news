/**
 * 
 */
package lab.recommend.hotrecommend.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import lab.recommend.hotrecommend.HotRecommender;

/**
 * @author 310Lab
 * @email 983233165@qq.com
 * @github https://github.com/jiancongjin
 * @date 2019年4月23日
 * 每天定时生成热点新闻的列表
 */
public class HRJob implements Job
{
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException
	{
		HotRecommender.getTopHotNewsList().clear();
		HotRecommender.formTodayTopHotNewsList();
	}

}

