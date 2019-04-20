package club.inger.entity;

public class Zan {
    private Long id;

    private String typeId;

    private Integer acclaimType;

    private Long userId;

    private Integer acclaimStatus;

    private Long acclaimCount;

    private String userUniqueKey;

    private String newsUniqueKey;

    private String commentUniqueKey;

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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public Integer getAcclaimType() {
        return acclaimType;
    }

    public void setAcclaimType(Integer acclaimType) {
        this.acclaimType = acclaimType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAcclaimStatus() {
        return acclaimStatus;
    }

    public void setAcclaimStatus(Integer acclaimStatus) {
        this.acclaimStatus = acclaimStatus;
    }

    public Long getAcclaimCount() {
        return acclaimCount;
    }

    public void setAcclaimCount(Long acclaimCount) {
        this.acclaimCount = acclaimCount;
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

    public String getCommentUniqueKey() {
        return commentUniqueKey;
    }

    public void setCommentUniqueKey(String commentUniqueKey) {
        this.commentUniqueKey = commentUniqueKey == null ? null : commentUniqueKey.trim();
    }

    @Override
    public String toString() {
        return "Zan{" +
                "id=" + id +
                ", typeId='" + typeId + '\'' +
                ", acclaimType=" + acclaimType +
                ", userId=" + userId +
                ", acclaimStatus=" + acclaimStatus +
                ", acclaimCount=" + acclaimCount +
                ", userUniqueKey='" + userUniqueKey + '\'' +
                ", newsUniqueKey='" + newsUniqueKey + '\'' +
                ", commentUniqueKey='" + commentUniqueKey + '\'' +
                ", value=" + value +
                '}';
    }
}