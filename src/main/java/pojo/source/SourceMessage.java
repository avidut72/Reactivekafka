package pojo.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMessage {
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
	@JsonProperty("bPID")
    private String bPID;
    private OboUser oboUser;
    private Quote quote;
    private EventMetaData eventMetaData;
    private Order order;
   
	public SourceMessage(String loginId, String userId, String name, String email, String account, String bPID,
			OboUser oboUser, Quote quote, Order order,EventMetaData eventMetaData) {
		super();
		this.loginId = loginId;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.account = account;
		this.bPID = bPID;
		this.oboUser = oboUser;
		this.quote = quote;
		this.eventMetaData = eventMetaData;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getbPID() {
		return bPID;
	}
	public void setbPID(String bPID) {
		this.bPID = bPID;
	}
	public OboUser getOboUser() {
		return oboUser;
	}
	public void setOboUser(OboUser oboUser) {
		this.oboUser = oboUser;
	}
	public Quote getQuote() {
		return quote;
	}
	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	public EventMetaData getEventMetaData() {
		return eventMetaData;
	}
	public void setEventMetaData(EventMetaData eventMetaData) {
		this.eventMetaData = eventMetaData;
	}
	 
    public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
