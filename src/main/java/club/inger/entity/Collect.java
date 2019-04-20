package club.inger.entity;

import java.util.Date;

public class Collect {
    private Long id;

    private Date collectTime;

    private String newsUrl;

    private String newsType;

    private String userUniqueKey;

    private String newsUniqueKey;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl == null ? null : newsUrl.trim();
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType == null ? null : newsType.trim();
    }

    public String getUserUniqueKey() {
        return userUniqueKey;
    }

    public void setUserUniqueKey(String userUniqueKey) {
        this.userUniqueKey = userUniqueKey == null ? null : userUniqueKey.trim();
    }

    public String getNewsUniqueKey() {
        return newsUniqueKey;
    }

    public void setNewsUniqueKey(String newsUniqueKey) {
        this.newsUniqueKey = newsUniqueKey == null ? null : newsUniqueKey.trim();
    }

    @Override
    public String toString() {
        return "Collect{" +
                "id=" + id +
                ", collectTime=" + collectTime +
                ", newsUrl='" + newsUrl + '\'' +
                ", newsType='" + newsType + '\'' +
                ", userUniqueKey='" + userUniqueKey + '\'' +
                ", newsUniqueKey='" + newsUniqueKey + '\'' +
                ", value=" + value +
                '}';
    }
}