package club.inger.service;

import club.inger.entity.News;

import java.util.List;

/**
 * Created by inger on 2019/4/11.
 */
public interface NewsService {
    List<News> findNewsByIds(String newsids);

}
