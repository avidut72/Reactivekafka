package pojo.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OboUser {
	@JsonProperty("loginId")
	private String loginId;
	@JsonProperty("userId")
	private String userId;
	@JsonProperty("userName")
	private String userName;

	/**
	* No args constructor for use in serialization
	*
	*/
	public OboUser() {
	}

	/**
	*
	* @param loginId
	* @param userName
	* @param userId
	*/
	public OboUser(String loginId, String userId, String userName) {
	super();
	this.loginId = loginId;
	this.userId = userId;
	this.userName = userName;
	}

	public String getLoginId() {
	return loginId;
	}

	public void setLoginId(String loginId) {
	this.loginId = loginId;
	}

	public OboUser withLoginId(String loginId) {
	this.loginId = loginId;
	return this;
	}

	public String getUserId() {
	return userId;
	}

	public void setUserId(String userId) {
	this.userId = userId;
	}

	public OboUser withUserId(String userId) {
	this.userId = userId;
	return this;
	}

	public String getUserName() {
	return userName;
	}

	public void setUserName(String userName) {
	this.userName = userName;
	}

	public OboUser withUserName(String userName) {
	this.userName = userName;
	return this;
	}
}
