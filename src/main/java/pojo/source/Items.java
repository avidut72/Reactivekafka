package pojo.source;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items {
	@JsonProperty("itemId")
	private String itemId;
	@JsonProperty("partNumber")
	private String partNumber;
	@JsonProperty("productId")
	private String productId;
	@JsonProperty("lastUpdateDate")
	private String lastUpdateDate;
	@JsonProperty("shortDescription")
	private String shortDescription;
	@JsonProperty("resourecId")
	private String resourecId;
	@JsonProperty("change")
	private String change;
	@JsonProperty("orderItemExtendAttribute")
	private List<OrderItemExtendAttribute> orderItemExtendAttribute = null;
	private String status;


	/**
	* No args constructor for use in serialization
	*
	*/
	public Items() {
	}

	/**
	*
	* @param itemId
	* @param lastUpdateDate
	* @param orderItemAtttribute
	* @param change
	* @param partNumber
	* @param shortDescription
	* @param resourecId
	*/

	public Items(String itemId, String partNumber, String productId, String lastUpdateDate, String shortDescription,
			String resourecId, String change, List<OrderItemExtendAttribute> orderItemExtendAttribute, String status) {
		super();
		this.itemId = itemId;
		this.partNumber = partNumber;
		this.productId = productId;
		this.lastUpdateDate = lastUpdateDate;
		this.shortDescription = shortDescription;
		this.resourecId = resourecId;
		this.change = change;
		this.orderItemExtendAttribute = orderItemExtendAttribute;
		this.status = status;
	}

	public String getItemId() {
	return itemId;
	}

	public void setItemId(String itemId) {
	this.itemId = itemId;
	}

	public Items withItemId(String itemId) {
	this.itemId = itemId;
	return this;
	}

	public String getPartNumber() {
	return partNumber;
	}

	public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
	}

	public Items withPartNumber(String partNumber) {
	this.partNumber = partNumber;
	return this;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public Items withProductId(String productId) {
		this.productId = productId;
		return this;
	}

	public String getLastUpdateDate() {
	return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
	this.lastUpdateDate = lastUpdateDate;
	}

	public Items withLastUpdateDate(String lastUpdateDate) {
	this.lastUpdateDate = lastUpdateDate;
	return this;
	}

	public String getShortDescription() {
	return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
	this.shortDescription = shortDescription;
	}

	public Items withShortDescription(String shortDescription) {
	this.shortDescription = shortDescription;
	return this;
	}

	public String getResourecId() {
	return resourecId;
	}

	public void setResourecId(String resourecId) {
	this.resourecId = resourecId;
	}

	public Items withResourecId(String resourecId) {
	this.resourecId = resourecId;
	return this;
	}

	public String getChange() {
	return change;
	}

	public void setChange(String change) {
	this.change = change;
	}

	public Items withChange(String change) {
	this.change = change;
	return this;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Items withStatus(String status) {
		this.status=status;
		return this;
	}

	public List<OrderItemExtendAttribute> getOrderItemExtendAttribute() {
	return orderItemExtendAttribute;
	}

	public void setOrderItemExtendAttribute(List<OrderItemExtendAttribute> orderItemExtendAttribute) {
	this.orderItemExtendAttribute = orderItemExtendAttribute;
	}

	public Items withOrderItemExtendAttribute(List<OrderItemExtendAttribute> orderItemExtendAttribute) {
	this.orderItemExtendAttribute = orderItemExtendAttribute;
	return this;
	}
	}
	

