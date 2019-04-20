package club.inger.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseZan<M extends BaseZan<M>> extends Model<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setTypeId(String typeId) {
		set("type_id", typeId);
	}

	public String getTypeId() {
		return get("type_id");
	}

	public void setAcclaimType(Integer acclaimType) {
		set("acclaim_type", acclaimType);
	}

	public Integer getAcclaimType() {
		return get("acclaim_type");
	}

	public void setUserId(Long userId) {
		set("user_id", userId);
	}

	public Long getUserId() {
		return get("user_id");
	}

	public void setAcclaimStatus(Integer acclaimStatus) {
		set("acclaim_status", acclaimStatus);
	}

	public Integer getAcclaimStatus() {
		return get("acclaim_status");
	}

	public void setAcclaimCount(Long acclaimCount) {
		set("acclaim_count", acclaimCount);
	}

	public Long getAcclaimCount() {
		return get("acclaim_count");
	}

	public void setUserUniqueKey(String userUniqueKey) {
		set("user_unique_key", userUniqueKey);
	}

	public String getUserUniqueKey() {
		return get("user_unique_key");
	}

	public void setNewsUniqueKey(String newsUniqueKey) {
		set("news_unique_key", newsUniqueKey);
	}

	public String getNewsUniqueKey() {
		return get("news_unique_key");
	}

	public void setCommentUniqueKey(String commentUniqueKey) {
		set("comment_unique_key", commentUniqueKey);
	}

	public String getCommentUniqueKey() {
		return get("comment_unique_key");
	}

}