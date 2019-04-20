package test;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by inger on 2019/4/9.
 */
public class JsonTest {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<String,Object>();
        List<Map> data=new ArrayList<>();

        //json.put(String.valueOf(tt.getT_id()), tt);
        Map<String,Object> result=new HashMap<String,Object>();

        Map<String,Object> dataMap = new HashMap<String,Object>();
        dataMap.put("uniquekey","d299994a3f70848b0a1fe7186ede0dc3");
        dataMap.put("title", "推进“名校+”工程 西安市第一保育院让优质资源惠及更多孩子");
        dataMap.put("category","国内");
        dataMap.put( "author_name","西部网");
        dataMap.put( "url","http://mini.eastday.com/mobile/190409225309279.html");
        dataMap.put( "thumbnail_pic_s","http://00imgmini.eastday.com/mobile/20190409/20190409225309_35bce8aecc8eb44ff9691e00357288c0_1_mwpm_03200403.jpg");

        data.add(dataMap);
        result.put("stat",1);
        result.put("data", data);

        //System.out.println(tt.getSubject()+" ");

        //tts.clear();


        map.put("reason","成功地返回");
        map.put("result",result);
        map.put("error_code", 0);
        System.out.println("集合中Map创建json对象:" + new JSONObject(map));
        try {
           // ResponseUtil.write(response, new JSONObject(map));
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
