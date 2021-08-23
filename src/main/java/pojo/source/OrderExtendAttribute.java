package pojo.source;

public class OrderExtendAttribute {
	private String attributeValue;
    private String attributeName;
    
	public OrderExtendAttribute(String attributeValue, String attributeName) {
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
