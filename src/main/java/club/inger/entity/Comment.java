package club.inger.entity;

public class Comment {
    private Long id;

    private String composeType;

    private String content;

    private Long commentCount;

    private String newsUniqueKey;

    private String commentUniqueKey;

    private String userUniqueKey;

    private String commentTime;

    private Integer acclaimCount;

    public Comment(){

    }
    public Comment(String content,String newsUniqueKey,String userUniqueKey){
        this.content = content;
        this.newsUniqueKey = newsUniqueKey;
        this.userUniqueKey = userUniqueKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComposeType() {
        return composeType;
    }

    public void setComposeType(String composeType) {
        this.composeType = composeType == null ? null : composeType.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public String getNewsUniqueKey() {
        return newsUniqueKey;
    }

    public void setNewsUniqueKey(String newsUniqueKey) {
        this.newsUniqueKey = newsUniqueKey == null ? null : newsUniqueKey.trim();
    }

    public String getCommentUniqueKey() {
        return commentUniqueKey;
    }

    public void setCommentUniqueKey(String commentUniqueKey) {
        this.commentUniqueKey = commentUniqueKey == null ? null : commentUniqueKey.trim();
    }

    public String getUserUniqueKey() {
        return userUniqueKey;
    }

    public void setUserUniqueKey(String userUniqueKey) {
        this.userUniqueKey = userUniqueKey == null ? null : userUniqueKey.trim();
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime == null ? null : commentTime.trim();
    }

    public Integer getAcclaimCount() {
        return acclaimCount;
    }

    public void setAcclaimCount(Integer acclaimCount) {
        this.acclaimCount = acclaimCount;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", composeType='" + composeType + '\'' +
                ", content='" + content + '\'' +
                ", commentCount=" + commentCount +
                ", newsUniqueKey='" + newsUniqueKey + '\'' +
                ", commentUniqueKey='" + commentUniqueKey + '\'' +
                ", userUniqueKey='" + userUniqueKey + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", acclaimCount=" + acclaimCount +
                '}';
    }
}