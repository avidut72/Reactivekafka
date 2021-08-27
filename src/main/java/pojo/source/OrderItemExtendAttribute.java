package pojo.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderItemExtendAttribute {
	@JsonProperty("attributeValue")
	private String attributeValue;
	@JsonProperty("attributeName")
	private String attributeName;

	/**
	* No args constructor for use in serialization
	*
	*/
	public OrderItemExtendAttribute() {
	}

	/**
	*
	* @param attributeValue
	* @param attributeName
	*/
	public OrderItemExtendAttribute(String attributeValue, String attributeName) {
	super();
	this.attributeValue = attributeValue;
	this.attributeName = attributeName;
	}

	public String getAttributeValue() {
	return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
	this.attributeValue = attributeValue;
	}

	public OrderItemExtendAttribute withAttributevalue(String attributeValue) {
	this.attributeValue = attributeValue;
	return this;
	}

	public String getAttributeName() {
	return attributeName;
	}

	public void setAttributeName(String attributeName) {
	this.attributeName = attributeName;
	}

	public OrderItemExtendAttribute withAttributeName(String attributeName) {
	this.attributeName = attributeName;
	return this;
	}
}
