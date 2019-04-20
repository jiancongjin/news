package club.inger.dto;

/**
 * Created by inger on 2019/4/14.
 */
public class ResultComment {

    private String userName;
    private String commentTime;
    private int imageType;
    private String commentCount;
    private String content;
    private int acclaimCount;
    private int acclaimStatus;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getAcclaimStatus() {
        return acclaimStatus;
    }

    public void setAcclaimStatus(int acclaimStatus) {
        this.acclaimStatus = acclaimStatus;
    }

    public ResultComment() {

    }
    public ResultComment(String name,String commentTime,int imageType,String commentCount,String content,int acclaimCount) {
        this.acclaimCount = acclaimCount;
        this.commentTime = commentTime;
        this.userName = name;
        this.imageType = imageType;
        this.content = content;
        this.commentCount = commentCount;
    }

    public int getAcclaimCount() {
        return acclaimCount;
    }

    public void setAcclaimCount(int acclaimCount) {
        this.acclaimCount = acclaimCount;
    }



    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public int getImageType() {
        return imageType;
    }

    public void setImageType(int imageType) {
        this.imageType = imageType;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
