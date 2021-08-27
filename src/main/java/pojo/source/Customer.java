package pojo.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	@JsonProperty("loginId")
	private String loginId;
	@JsonProperty("userId")
	private String userId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("email")
	private String email;
	@JsonProperty("account")
	private String account;
	@JsonProperty("BPID")
	private String bpid;

	/**
	* No args constructor for use in serialization
	*
	*/
	public Customer() {
	}

	/**
	*
	* @param loginId
	* @param bpid
	* @param name
	* @param userId
	* @param email
	* @param account
	*/
	public Customer(String loginId, String userId, String name, String email, String account, String bpid) {
	super();
	this.loginId = loginId;
	this.userId = userId;
	this.name = name;
	this.email = email;
	this.account = account;
	this.bpid = bpid;
	}

	public String getLoginId() {
	return loginId;
	}

	public void setLoginId(String loginId) {
	this.loginId = loginId;
	}

	public Customer withLoginId(String loginId) {
	this.loginId = loginId;
	return this;
	}

	public String getUserId() {
	return userId;
	}

	public void setUserId(String userId) {
	this.userId = userId;
	}

	public Customer withUserId(String userId) {
	this.userId = userId;
	return this;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public Customer withName(String name) {
	this.name = name;
	return this;
	}

	public String getEmail() {
	return email;
	}

	public void setEmail(String email) {
	this.email = email;
	}

	public Customer withEmail(String email) {
	this.email = email;
	return this;
	}

	public String getAccount() {
	return account;
	}

	public void setAccount(String account) {
	this.account = account;
	}

	public Customer withAccount(String account) {
	this.account = account;
	return this;
	}

	public String getBpid() {
	return bpid;
	}

	public void setBpid(String bpid) {
	this.bpid = bpid;
	}

	public Customer withBpid(String bpid) {
	this.bpid = bpid;
	return this;
	}


}
