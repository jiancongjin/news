package club.inger.entity;

import java.util.Date;

public class Recommendations {
    private Long id;

    private Long userId;

    private Long newsId;

    private Date deriveTime;

    private Boolean feedback;

    private Integer deriveAlgorithm;

    private String userUniqueKey;

    private String newsUniqueKey;

    private int isValid;

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }

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

    public Date getDeriveTime() {
        return deriveTime;
    }

    public void setDeriveTime(Date deriveTime) {
        this.deriveTime = deriveTime;
    }

    public Boolean getFeedback() {
        return feedback;
    }

    public void setFeedback(Boolean feedback) {
        this.feedback = feedback;
    }

    public Integer getDeriveAlgorithm() {
        return deriveAlgorithm;
    }

    public void setDeriveAlgorithm(Integer deriveAlgorithm) {
        this.deriveAlgorithm = deriveAlgorithm;
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
        return "Recommendations{" +
                "id=" + id +
                ", userId=" + userId +
                ", newsId=" + newsId +
                ", deriveTime=" + deriveTime +
                ", feedback=" + feedback +
                ", deriveAlgorithm=" + deriveAlgorithm +
                ", userUniqueKey='" + userUniqueKey + '\'' +
                ", newsUniqueKey='" + newsUniqueKey + '\'' +
                '}';
    }
}