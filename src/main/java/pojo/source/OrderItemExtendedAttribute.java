package pojo.source;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderItemExtendedAttribute {
	@JsonProperty("sttributeValue")
	 private String attributeValue;
	@JsonProperty("attributeName")
	 private String attributeName;
	 
	public OrderItemExtendedAttribute(String attributeValue, String attributeName) {
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
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
}
