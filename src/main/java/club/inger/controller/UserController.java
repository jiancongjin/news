package club.inger.controller;

import club.inger.dto.ResponseData;
import club.inger.dto.ResultObject;

import club.inger.entity.Collect;
import club.inger.entity.NewsLogs;
import club.inger.entity.Users;
import club.inger.entity.Zan;
import club.inger.service.AcclaimService;
import club.inger.service.UserService;
import club.inger.service.impl.AcclaimServiceImpl;
import club.inger.service.impl.UserServiceImpl;
import club.inger.util.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by inger on 2019/4/3.
 */
@Controller
public class UserController {

    /* @Autowired
      private UserService userService;
      public ResponseData register(){
           return null;
      }
      @RequestMapping("/news/history")
      @ResponseBody
      public ResultObject saveHistory(Hostory hostory,String url){
          ResponseData responseData = userService.saveHistory(hostory);
          Map<String,Object> result=new HashMap<String,Object>();

          List<Map> data=new ArrayList<>();
          Map<String,Object> dataMap = new HashMap<String,Object>();*//*
        dataMap.put("uniquekey","d299994a3f70848b0a1fe7186ede0dc3");
        dataMap.put("title", "推进“名校+”工程 西安市第一保育院让优质资源惠及更多孩子");
        dataMap.put("category","国内");
        dataMap.put( "author_name","西部网");
        dataMap.put( "url","http://mini.eastday.com/mobile/190409225309279.html");
        dataMap.put( "thumbnail_pic_s","http://00imgmini.eastday.com/mobile/20190409/20190409225309_35bce8aecc8eb44ff9691e00357288c0_1_mwpm_03200403.jpg");*//*
        dataMap.put("status",1);
        dataMap.put("info","成功");
        dataMap.put("object",null);
        data.add(dataMap);
        result.put("stat",1);
        result.put("data", data);
        return new ResultObject("成功返回",0,result);
    }*/
    private UserService userService = new UserServiceImpl();
    private  AcclaimService acclaimService = new AcclaimServiceImpl();

    @RequestMapping("/news/register")
    @ResponseBody
    public  ResultObject register(Users users) {
        System.out.println("------------------------------------register");
        System.out.println(users);
        ResultObject resultObject = userService.insertUser(users);
        return resultObject;
    }

    @RequestMapping("/news/history")
    @ResponseBody
    public ResultObject saveHistory(NewsLogs history, String url) {
        System.out.println("---------------------------------------hitory");
        System.out.println(history);
        ResultObject resultObject = userService.saveHistory(history);
        return resultObject;
    }
    @RequestMapping("/news/acclaim")
    @ResponseBody
    public ResultObject updateAcclaim(int acclaimType, Zan zan){
        System.out.println("----------------------------acclaim");
        System.out.println(zan);
        System.out.println("type：  "+acclaimType);
        if(zan.getValue()==-1){
            return acclaimService.cancelAcclaim(acclaimType, zan);
        }else{
            return acclaimService.updateAcclaim(acclaimType, zan);
        }
    }

    @RequestMapping("/news/collect")
    @ResponseBody
    public ResultObject updateCollect(Collect collect){
        System.out.println("---------------------------------collect");
        System.out.println(collect);
        return userService.updateCollect(collect);
    }

}
