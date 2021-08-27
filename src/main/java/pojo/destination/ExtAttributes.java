package pojo.destination;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtAttributes {
	@JsonProperty("key")
	private String key;
	@JsonProperty("value")
	private String value;

	/**
	* No args constructor for use in serialization
	*
	*/
	public ExtAttributes() {
	}

	/**
	*
	* @param value
	* @param key
	*/
	public ExtAttributes(String key, String value) {
	super();
	this.key = key;
	this.value = value;
	}

	public String getKey() {
	return key;
	}

	public void setKey(String key) {
	this.key = key;
	}

	public ExtAttributes withKey(String key) {
	this.key = key;
	return this;
	}

	public String getValue() {
	return value;
	}

	public void setValue(String value) {
	this.value = value;
	}

	public ExtAttributes withValue(String value) {
	this.value = value;
	return this;
	}
}
