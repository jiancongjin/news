/**
 * 
 */
package lab.recommend.algorithms;

import java.util.List;

/**
 * @author 310Lab
 * @email 983233165@qq.com
 * @github https://github.com/jiancongjin
 * @date 2019年4月20日
 */
public interface RecommendAlgorithm
{
	/**
	 * 推荐算法的int表示
	 */
	//协同过滤     
	public static final int CF=0;
	//基于内容的推荐
	public static final int CB=1;
	//基于热点新闻的推荐
	public static final int HR=2;
	/**
	 * 针对所有用户返回推荐结果
	 */
	public default void recommend(int isFirst){
		recommend(RecommendKit.getUserList(),isFirst);
	}
	
	/**
	 * 针对特定用户返回推荐结果
	 */
	public void recommend(List<Long> users,int isFirst);
}

