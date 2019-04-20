/**
 * 
 */
package lab.recommend.contentbasedrecommend;

import java.util.Comparator;
import java.util.Map;

/**
 * @author 310Lab
 * @email 983233165@qq.com
 * @github https://github.com/jiancongjin
 * @date 2019年4月30日
 */
public class CustomizedComparator implements Comparator<String>
{
	Map<String, Double> base;  
    public CustomizedComparator(Map<String, Double> base) {  
        this.base = base;  
    }

    
	@Override
	public int compare(String a, String b)
	{
		 if (base.get(a) >= base.get(b)) {  
	            return 1;  
	     } 
	     else {  
	            return -1;  
	     } 
	}  
      	
}

