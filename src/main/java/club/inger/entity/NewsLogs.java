package club.inger.entity;

import java.util.Date;

public class NewsLogs {
    private Long id;

    private Long userId;

    private Long newsId;

    private Date viewTime;

    private Integer preferDegree;

    private String userUniqueKey;

    private String newsUniqueKey;

    private String newsTitle;

    private String newsType;

    private String newsUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public Date getViewTime() {
        return viewTime;
    }

    public void setViewTime(Date viewTime) {
        this.viewTime = viewTime;
    }

    public Integer getPreferDegree() {
        return preferDegree;
    }

    public void setPreferDegree(Integer preferDegree) {
        this.preferDegree = preferDegree;
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

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType == null ? null : newsType.trim();
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl == null ? null : newsUrl.trim();
    }

    @Override
    public String toString() {
        return "NewsLogs{" +
                "id=" + id +
                ", userId=" + userId +
                ", newsId=" + newsId +
                ", viewTime=" + viewTime +
                ", preferDegree=" + preferDegree +
                ", userUniqueKey='" + userUniqueKey + '\'' +
                ", newsUniqueKey='" + newsUniqueKey + '\'' +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsType='" + newsType + '\'' +
                ", newsUrl='" + newsUrl + '\'' +
                '}';
    }
}