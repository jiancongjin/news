package club.inger.entity;

import java.util.Date;

public class Users {
    private Long id;

    private Date latestLogTime;

    private String userName;

    private Integer imageType;

    private String uniqueKey;

    private String whereFrom;

    private String prefList;

    private double latitude;

    private double longitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {

        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLatestLogTime() {
        return latestLogTime;
    }

    public void setLatestLogTime(Date latestLogTime) {
        this.latestLogTime = latestLogTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getImageType() {
        return imageType;
    }

    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey == null ? null : uniqueKey.trim();
    }

    public String getWhereFrom() {
        return whereFrom;
    }

    public void setWhereFrom(String whereFrom) {
        this.whereFrom = whereFrom == null ? null : whereFrom.trim();
    }

    public String getPrefList() {
        return prefList;
    }

    public void setPrefList(String prefList) {
        this.prefList = prefList == null ? null : prefList.trim();
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", latestLogTime=" + latestLogTime +
                ", userName='" + userName + '\'' +
                ", imageType=" + imageType +
                ", uniqueKey='" + uniqueKey + '\'' +
                ", whereFrom='" + whereFrom + '\'' +
                ", prefList='" + prefList + '\'' +
                '}';
    }
}