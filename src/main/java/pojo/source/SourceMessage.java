package pojo.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMessage {
	
	@JsonProperty("customer")
	private Customer customer;
	@JsonProperty("oboUser")
	private OboUser oboUser;
	@JsonProperty("quote")
	private Quote quote;
	@JsonProperty("eventMetaData")
	private EventMetaData eventMetaData;

	public SourceMessage() {
	}

	/**
	*
	* @param eventMetaData
	* @param quote
	* @param oboUser
	* @param customer
	*/
	public SourceMessage(Customer customer, OboUser oboUser, Quote quote, EventMetaData eventMetaData) {
	super();
	this.customer = customer;
	this.oboUser = oboUser;
	this.quote = quote;
	this.eventMetaData = eventMetaData;
	}

	public Customer getCustomer() {
	return customer;
	}

	public void setCustomer(Customer customer) {
	this.customer = customer;
	}

	public SourceMessage withCustomer(Customer customer) {
	this.customer = customer;
	return this;
	}

	public OboUser getOboUser() {
	return oboUser;
	}

	public void setOboUser(OboUser oboUser) {
	this.oboUser = oboUser;
	}

	public SourceMessage withOboUser(OboUser oboUser) {
	this.oboUser = oboUser;
	return this;
	}

	public Quote getQuote() {
	return quote;
	}

	public void setQuote(Quote quote) {
	this.quote = quote;
	}

	public SourceMessage withQuote(Quote quote) {
	this.quote = quote;
	return this;
	}

	public EventMetaData getEventMetaData() {
	return eventMetaData;
	}

	public void setEventMetaData(EventMetaData eventMetaData) {
	this.eventMetaData = eventMetaData;
	}

	public SourceMessage withEventMetaData(EventMetaData eventMetaData) {
	this.eventMetaData = eventMetaData;
	return this;
	}

	}
