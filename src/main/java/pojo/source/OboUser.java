package pojo.source;

public class OboUser {
	 private String loginId;
	 private String userId;
	 private String userName;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
