package club.inger.entity;

public class Reply {
    private Long id;

    private Long commentId;

    private Long replyId;

    private Integer replyType;

    private String content;

    private Long fromUid;

    private Long toUid;

    private String fromUKey;

    private String toUKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyType() {
        return replyType;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getFromUid() {
        return fromUid;
    }

    public void setFromUid(Long fromUid) {
        this.fromUid = fromUid;
    }

    public Long getToUid() {
        return toUid;
    }

    public void setToUid(Long toUid) {
        this.toUid = toUid;
    }

    public String getFromUKey() {
        return fromUKey;
    }

    public void setFromUKey(String fromUKey) {
        this.fromUKey = fromUKey == null ? null : fromUKey.trim();
    }

    public String getToUKey() {
        return toUKey;
    }

    public void setToUKey(String toUKey) {
        this.toUKey = toUKey == null ? null : toUKey.trim();
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", commentId=" + commentId +
                ", replyId=" + replyId +
                ", replyType=" + replyType +
                ", content='" + content + '\'' +
                ", fromUid=" + fromUid +
                ", toUid=" + toUid +
                ", fromUKey='" + fromUKey + '\'' +
                ", toUKey='" + toUKey + '\'' +
                '}';
    }
}