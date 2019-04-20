package club.inger.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by inger on 2019/4/17.
 */
public class NewsTypeConvert {
   /* public static String top = "头条";
    public static String shehui  = "社会";
    public static String guonei = "国内";
    public static String yule  = "娱乐";
    public static String tiyu  = "体育";
    public static String junshi  = "军事";
    public static String keji  = "科技";
    public static String caijing  = "财经";
    public static String shishang = "时尚";*/
   private static Map<String,String> typeMap = new HashMap<>();
    public NewsTypeConvert(){
        typeMap.put("top","头条");
        typeMap.put("shehui","社会");
        typeMap.put("guonei","国内");
        typeMap.put("yule","娱乐");
        typeMap.put("tiyu","体育");
        typeMap.put("junshi","军事");
        typeMap.put("keji","科技");
        typeMap.put("caijing","财经");
        typeMap.put("shishang","时尚");
    }


    public static String getType(String type){
        return typeMap.get(type);
    }

}
