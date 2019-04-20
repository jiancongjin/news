/**
 * 
 */
package lab.recommend.contentbasedrecommend;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @author 310Lab
 * @email 983233165@qq.com
 * @github https://github.com/jiancongjin
 * @date 2019年4月23日
 */
public class CustomizedHashMap<K, V> extends HashMap<K,V>
{
	private static final long serialVersionUID = 1L;

	@Override
	public String toString(){
		String toString="{";
		Iterator<K> keyIte=this.keySet().iterator();
		while(keyIte.hasNext()){
			K key=keyIte.next();
			toString+="\""+key+"\":"+this.get(key)+",";
		}
		if(toString.equals("{")){
			toString="{}";
		}
		else{
			toString=toString.substring(0, toString.length()-1)+"}";
		}
		return toString;
		
	}
	
	public CustomizedHashMap<K,V> copyFromLinkedHashMap(LinkedHashMap<K,V> linkedHashMap){
//		Iterator<K> ite = linkedHashMap.keySet().iterator();
//		while(ite.hasNext()){
//			K key=ite.next();
//			this.put(key,linkedHashMap.get(key));
//		}
		this.putAll(linkedHashMap);
		return this;
	}
}
