package club.inger.util;

import club.inger.dto.ResponseData;
import club.inger.dto.ResultComment;
import club.inger.dto.ResultObject;
import com.alibaba.fastjson.JSON;
import com.jfinal.plugin.activerecord.Record;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by coquettish on 2018/5/21.
 */
public class ResponseDataUtil {
    public static synchronized ResponseData build(Integer status, String message, Object result){
        ResponseData responseData = new ResponseData();
        responseData.setStatus(status);
        responseData.setInfo(message);
        responseData.setObject(result);
        return responseData;
    }
    public static ResultObject result(String reason,int error_code,String stat ,ResponseData responseData){
        Map<String,Object> result= resultMap(stat, responseData);
        return new ResultObject(reason,error_code,result);
    }
    public static ResultObject result(String reason,int error_code,String stat ,List<Record> list){
        Map<String,Object> result= resultMap(stat, list);
        return new ResultObject(reason,error_code,result);
    }
    public static ResultObject Commentresult(String reason,int error_code,String stat ,List<Record> list){
        Map<String,Object> result= resultMap(stat, list);
        return new ResultObject(reason,error_code,result);
    }
    public static ResultObject newsResult(String reason,int error_code,String stat ,List<Record> list){
        Map<String,Object> result= newsMap(stat, list);
        return new ResultObject(reason,error_code,result);
    }
    public static Map<String,Object> resultMap(String stat ,ResponseData responseData){
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("stat",stat);
        List<Map> data=new ArrayList<>();
        Map<String,Object> dataMap = new HashMap<String,Object>();
        dataMap.put("status",responseData.getStatus());
        dataMap.put("info",responseData.getInfo());
        dataMap.put("object",responseData.getObject());
        data.add(dataMap);
        result.put("data",data);
        return result;
    }
 /*   public static Map<String,Object> resultMap(String stat ,List<ResponseData> list){
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("stat",stat);
        List<Map> data=new ArrayList<>();
        Map<String,Object> dataMap = new HashMap<String,Object>();
        for(ResponseData responseData:list){

            dataMap.put("status",responseData.getStatus());
            dataMap.put("info",responseData.getInfo());
          *//*  ResultComment resultComment = (ResultComment) responseData.getObject();
            Map<String,Object> objectMap = new HashMap<>();
            objectMap.put("name",resultComment.getUserName());
            objectMap.put("commentTime",resultComment.getCommentTime());
            objectMap.put("imageType",resultComment.getImageType());
            objectMap.put("commentCount",resultComment.getCommentCount());
            objectMap.put("content",resultComment.getContent());
            objectMap.put("acclaimCount",resultComment.getAcclaimCount());
            objectMap.put("status",resultComment.getAcclaimStatus());
            dataMap.put("object",objectMap);*//*
            dataMap.put("object",responseData.getObject());
            data.add(dataMap);
        }
        result.put("data",data);
        return result;
    }*/
    public static Map<String,Object> resultMap(String stat ,List<Record> list){
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("stat",stat);
        List<Map> data=new ArrayList<>();

       // Map<String,Object> dataMap = new HashMap<String,Object>();
        for(int i = 0; i<list.size();i++){
            Map<String,Object> dataMap = new HashMap<String,Object>();
           // if(list.get(i).get(""))
            dataMap.put("status",1);
            dataMap.put("info","评论内容");
            Map<String,Object> objectMap = new HashMap<>();
          //  System.out.println(list.get(i).toJson());
            Map mapTypes = JSON.parseObject(list.get(i).toJson());
            System.out.println(list.get(i).toJson());
            if(list.get(i).toJson()!=null){
                dataMap.put("object",mapTypes);
            }

            data.add(dataMap);
        }
        result.put("data",data);
        return result;
    }
    public static Map<String,Object> newsMap(String stat ,List<Record> list){
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("stat",stat);
        List<Map> data=new ArrayList<>();

        // Map<String,Object> dataMap = new HashMap<String,Object>();
        for(int i = 0; i<list.size();i++){
            Map<String,Object> dataMap = new HashMap<String,Object>();

            Map<String,Object> objectMap = new HashMap<>();
            //  System.out.println(list.get(i).toJson());
            Map mapTypes = JSON.parseObject(list.get(i).toJson());

            //dataMap.put("data",mapTypes);
            data.add(mapTypes);
        }
        result.put("data",data);
        return result;
    }
  /*  public static Map<String,Object> objectMap(Object object){
        Map<String,Object> result=new HashMap<String,Object>();
        ResultComment comment = (ResultComment)object;
        result.put("");
        result.put("");
        result.put("");
        result.put("");
        result.put("");
        result.put("")

        return result;
    }*/
}
