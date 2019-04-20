package test;

import club.inger.entity.Comment;
import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * Created by inger on 2019/4/10.
 */
public class FastJsonTest {
    public static void main(String[] args) {
        //String result = JSON.toJSONString(new );
       // String json = {"comment_count":2,"acclaim_status":1,"comment_time":null,"acclaim_count":5,"user_name":"小红","content":null,"image_type":null}""
        Comment comment = new Comment("comment","news","user");
        String result = JSON.toJSONString(comment);
        //Map mapTypes = JSON.parseObject(comment.);
       // Map mapTypes = JSON.parseObject(result);
       // System.out.println(mapTypes);
        System.out.println(JSON.parseObject(result));
        System.out.println(result);
    }
}
