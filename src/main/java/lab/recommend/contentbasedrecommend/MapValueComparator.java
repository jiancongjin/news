/**
 * 
 */
package lab.recommend.contentbasedrecommend;

import java.util.Comparator;
import java.util.Map.Entry;

/**
 * @author 310Lab
 * @email 983233165@qq.com
 * @github https://github.com/jiancongjin
 * @date 2019年12月2日
 */
class MapValueComparator implements Comparator<Entry<Long, Double>> {

	@Override
	public int compare(Entry<Long, Double> me1, Entry<Long, Double> me2) {

		return me1.getValue().compareTo(me2.getValue());
	}
}