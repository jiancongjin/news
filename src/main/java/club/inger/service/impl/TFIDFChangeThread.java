package club.inger.service.impl;

import club.inger.model.News;
import com.jfinal.plugin.activerecord.Db;
import lab.recommend.algorithms.RecommendKit;
import lab.recommend.algorithms.TFIDFKit;
import lab.recommend.contentbasedrecommend.CustomizedHashMap;
import lab.recommend.contentbasedrecommend.TFIDF;
import org.ansj.app.keyword.Keyword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by inger on 2019/4/17.
 */
public class TFIDFChangeThread implements Runnable{

    public int flag;
    public long userId;
    public long newsId;
    public TFIDFChangeThread(int flag, long userId, long  newsId) { //flag 1:点赞或者收藏等好的动作 -1:取消赞 拉黑等不喜欢地操作
        this.flag = flag;
        this.userId = userId;
        this.newsId = newsId;
    }

    public TFIDFChangeThread() {
    }

    @Override
    public void run() {
        if (flag == 1){
            TFIDFKit.TfidfUp(userId, newsId);
        }
        if (flag == -1){
            TFIDFKit.TfidfDown(userId,newsId);
        }
    }

}
