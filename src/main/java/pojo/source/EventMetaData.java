package pojo.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventMetaData {
	@JsonProperty("eventInitiator")
	private String eventInitiator;
	@JsonProperty("sourse")
    private String source;
	@JsonProperty("timestamp")
    private String timestamp;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
}
