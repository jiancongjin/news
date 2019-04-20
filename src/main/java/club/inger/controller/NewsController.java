package club.inger.controller;

import club.inger.dto.ResultObject;
import club.inger.model.News;
import club.inger.model.Users;
import club.inger.service.NewsRecommendService;
import club.inger.service.impl.NewsRecommendServiceImpl;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by inger on 2019/4/15.
 */
@Controller
public class NewsController {
    NewsRecommendService newsRecommendService = new NewsRecommendServiceImpl();
    @RequestMapping("/news/content/top")
    @ResponseBody
    public ResultObject getNews(String userUniqueKey){

        return newsRecommendService.getNews(userUniqueKey);
    }
    @RequestMapping("/news/content/other")
    @ResponseBody
    public ResultObject getOther(String userUniqueKey,String type){

        return newsRecommendService.getNews(userUniqueKey,type);
    }


    @RequestMapping("/news/distaste")
    @ResponseBody
    public ResultObject getNews(String userUniqueKey,String newsUniqueKey,String feedbackContent){
       Users users = new Users();
        News news = new News();
        long userId= users.findFirst("SELECT *FROM users WHERE unique_key = "+"'"+userUniqueKey+"'").getId();
        long newsId = news.findFirst("SELECT *FROM news WHERE unique_key = "+"'"+newsUniqueKey+"'").getId();

        return newsRecommendService.disLike(userId,newsId,feedbackContent);
    }

}
