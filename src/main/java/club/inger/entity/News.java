package club.inger.entity;

import java.util.Date;

public class News {
    private Long id;

    private Date newsTime;

    private Integer moduleId;

    private String url;

    private String categroy;

    private String antuorName;

    private String uniqueKey;

    private Long newsCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCategroy() {
        return categroy;
    }

    public void setCategroy(String categroy) {
        this.categroy = categroy == null ? null : categroy.trim();
    }

    public String getAntuorName() {
        return antuorName;
    }

    public void setAntuorName(String antuorName) {
        this.antuorName = antuorName == null ? null : antuorName.trim();
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey == null ? null : uniqueKey.trim();
    }

    public Long getNewsCount() {
        return newsCount;
    }

    public void setNewsCount(Long newsCount) {
        this.newsCount = newsCount;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", newsTime=" + newsTime +
                ", moduleId=" + moduleId +
                ", url='" + url + '\'' +
                ", categroy='" + categroy + '\'' +
                ", antuorName='" + antuorName + '\'' +
                ", uniqueKey='" + uniqueKey + '\'' +
                ", newsCount=" + newsCount +
                '}';
    }
}