package pojo.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventMetaData {
	@JsonProperty("eventInitiator")
	private String eventInitiator;
	@JsonProperty("source")
	private String source;
	@JsonProperty("timestamp")
	private String timestamp;

	/**
	* No args constructor for use in serialization
	*
	*/
	public EventMetaData() {
	}

	/**
	*
	* @param eventInitiator
	* @param source
	* @param timestamp
	*/
	public EventMetaData(String eventInitiator, String source, String timestamp) {
	super();
	this.eventInitiator = eventInitiator;
	this.source = source;
	this.timestamp = timestamp;
	}

	public String getEventInitiator() {
	return eventInitiator;
	}

	public void setEventInitiator(String eventInitiator) {
	this.eventInitiator = eventInitiator;
	}

	public EventMetaData withEventInitiator(String eventInitiator) {
	this.eventInitiator = eventInitiator;
	return this;
	}

	public String getSource() {
	return source;
	}

	public void setSource(String source) {
	this.source = source;
	}

	public EventMetaData withSource(String source) {
	this.source = source;
	return this;
	}

	public String getTimestamp() {
	return timestamp;
	}

	public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
	}

	public EventMetaData withTimestamp(String timestamp) {
	this.timestamp = timestamp;
	return this;
	}
}
