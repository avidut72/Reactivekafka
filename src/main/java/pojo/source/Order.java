package pojo.source;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("productTotal")
	private String productTotal;
	@JsonProperty("orderNumber")
	private String orderNumber;
	@JsonProperty("status")
	private String status;
	@JsonProperty("items")
	private List<Items> items = null;
	@JsonProperty("orderExtendAttribute")
	private List<OrderExtendAttribute> orderExtendAttribute = null;

	/**
	* No args constructor for use in serialization
	*
	*/
	public Order() {
	}

	/**
	*
	* @param orderNumber
	* @param name
	* @param id
	* @param orderExtendAttribute
	* @param items
	* @param productTotal
	* @param status
	*/
	public Order(String id, String name, String productTotal, String orderNumber, String status, List<Items> items, List<OrderExtendAttribute> orderExtendAttribute) {
	super();
	this.id = id;
	this.name = name;
	this.productTotal = productTotal;
	this.orderNumber = orderNumber;
	this.status = status;
	this.items = items;
	this.orderExtendAttribute = orderExtendAttribute;
	}

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public Order withId(String id) {
	this.id = id;
	return this;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public Order withName(String name) {
	this.name = name;
	return this;
	}

	public String getProductTotal() {
	return productTotal;
	}

	public void setProductTotal(String productTotal) {
	this.productTotal = productTotal;
	}

	public Order withProductTotal(String productTotal) {
	this.productTotal = productTotal;
	return this;
	}

	public String getOrderNumber() {
	return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
	this.orderNumber = orderNumber;
	}

	public Order withOrderNumber(String orderNumber) {
	this.orderNumber = orderNumber;
	return this;
	}

	public String getStatus() {
	return status;
	}

	public void setStatus(String status) {
	this.status = status;
	}

	public Order withStatus(String status) {
	this.status = status;
	return this;
	}

	public List<Items> getItems() {
	return items;
	}

	public void setItems(List<Items> items) {
	this.items = items;
	}

	public Order withItems(List<Items> items) {
	this.items = items;
	return this;
	}

	public List<OrderExtendAttribute> getOrderExtendAttribute() {
	return orderExtendAttribute;
	}

	public void setOrderExtendAttribute(List<OrderExtendAttribute> orderExtendAttribute) {
	this.orderExtendAttribute = orderExtendAttribute;
	}

	public Order withOrderExtendAttribute(List<OrderExtendAttribute> orderExtendAttribute) {
	this.orderExtendAttribute = orderExtendAttribute;
	return this;
	}
}
