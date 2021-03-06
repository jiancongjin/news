package club.inger.model1.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUsers<M extends BaseUsers<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setPrefList(java.lang.String prefList) {
		set("pref_list", prefList);
	}

	public java.lang.String getPrefList() {
		return get("pref_list");
	}

	public void setLatestLogTime(java.util.Date latestLogTime) {
		set("latest_log_time", latestLogTime);
	}

	public java.util.Date getLatestLogTime() {
		return get("latest_log_time");
	}

	public void setUserName(java.lang.String userName) {
		set("user_name", userName);
	}

	public java.lang.String getUserName() {
		return get("user_name");
	}

	public void setImageType(java.lang.Integer imageType) {
		set("image_type", imageType);
	}

	public java.lang.Integer getImageType() {
		return get("image_type");
	}

	public void setUniqueKey(java.lang.String uniqueKey) {
		set("unique_key", uniqueKey);
	}

	public java.lang.String getUniqueKey() {
		return get("unique_key");
	}

	public void setWhereFrom(java.lang.String whereFrom) {
		set("where_from", whereFrom);
	}

	public java.lang.String getWhereFrom() {
		return get("where_from");
	}

	public void setLatitude(java.lang.Double latitude) {
		set("latitude", latitude);
	}

	public java.lang.Double getLatitude() {
		return get("latitude");
	}

	public void setLongitude(java.lang.Double longitude) {
		set("longitude", longitude);
	}

	public java.lang.Double getLongitude() {
		return get("longitude");
	}

}
