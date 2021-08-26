package pojo.source;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items {
	@JsonProperty("itemId")
	private String itemId;
	@JsonProperty("partNumber")
    private String partNumber;
	@JsonProperty("productId")
    private String productId;
	@JsonProperty("lastUpdatedDate")
    private String lastUpdatedDate;
	@JsonProperty("shortDescription")
    private String shortDescription;
	@JsonProperty("resourceId")
    private String resourceId;
	@JsonProperty("change")
    private String change;
	@JsonProperty("status")
	private String status;
   
	private List<OrderItemExtendedAttribute> orderItemAttribute = new ArrayList<OrderItemExtendedAttribute>();
    
  
	public Items(String itemId, String partNumber, String productId, String lastUpdatedDate, String shortDescription,
			String resourceId, String change, String status, List<OrderItemExtendedAttribute> orderItemAttribute) {
		super();
		this.itemId = itemId;
		this.partNumber = partNumber;
		this.productId = productId;
		this.lastUpdatedDate = lastUpdatedDate;
		this.shortDescription = shortDescription;
		this.resourceId = resourceId;
		this.change = change;
		this.orderItemAttribute = orderItemAttribute;
		this.status=status;
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public List<OrderItemExtendedAttribute> getOrderItemAttribute() {
		return orderItemAttribute;
	}
	public void setOrderItemAttribute(List<OrderItemExtendedAttribute> orderItemAttribute) {
		this.orderItemAttribute = orderItemAttribute;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
