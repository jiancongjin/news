package club.inger.service;

import club.inger.dto.ResultObject;

/**
 * Created by inger on 2019/4/15.
 */
public interface NewsRecommendService {
    public ResultObject getNews(String userId);
    public ResultObject getNews(String userId,String type);
    public ResultObject disLike(long userId,long  newsId,String feedbackContent);
}
