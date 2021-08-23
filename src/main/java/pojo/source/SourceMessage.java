package pojo.source;

public class SourceMessage {
	private String customer;
    private String userId;
    private String name;
    private String email;
    private String account;
    private String bPID;
    private OboUser oboUser;
    private Quote quote;
    private EventMetaData eventMetaData;
    
    public SourceMessage(String customer, String userId, String name, String email, String account, String bPID,
			OboUser oboUser, Quote quote, EventMetaData eventMetaData) {
		super();
		this.customer = customer;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.account = account;
		this.bPID = bPID;
		this.oboUser = oboUser;
		this.quote = quote;
		this.eventMetaData = eventMetaData;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
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
	
}
