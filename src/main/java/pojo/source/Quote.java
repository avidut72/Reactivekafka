package pojo.source;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("productTotal")
	private String productTotal;
	@JsonProperty("quoteNumber")
	private String quoteNumber;
	@JsonProperty("items")
	private List<Items> items = null;
	@JsonProperty("orderExtendAttribute")
	private List<OrderExtendAttribute> orderExtendAttribute = null;

	/**
	* No args constructor for use in serialization
	*
	*/
	public Quote() {
	}

	/**
	*
	* @param name
	* @param id
	* @param orderExtendAttribute
	* @param items
	* @param productTotal
	* @param quoteNumber
	*/
	public Quote(String id, String name, String productTotal, String quoteNumber, List<Items> items, List<OrderExtendAttribute> orderExtendAttribute) {
	super();
	this.id = id;
	this.name = name;
	this.productTotal = productTotal;
	this.quoteNumber = quoteNumber;
	this.items = items;
	this.orderExtendAttribute = orderExtendAttribute;
	}

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public Quote withId(String id) {
	this.id = id;
	return this;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public Quote withName(String name) {
	this.name = name;
	return this;
	}

	public String getProductTotal() {
	return productTotal;
	}

	public void setProductTotal(String productTotal) {
	this.productTotal = productTotal;
	}

	public Quote withProductTotal(String productTotal) {
	this.productTotal = productTotal;
	return this;
	}

	public String getQuoteNumber() {
	return quoteNumber;
	}

	public void setQuoteNumber(String quoteNumber) {
	this.quoteNumber = quoteNumber;
	}

	public Quote withQuoteNumber(String quoteNumber) {
	this.quoteNumber = quoteNumber;
	return this;
	}

	public List<Items> getItems() {
	return items;
	}

	public void setItems(List<Items> items) {
	this.items = items;
	}

	public Quote withItems(List<Items> items) {
	this.items = items;
	return this;
	}

	public List<OrderExtendAttribute> getOrderExtendAttribute() {
	return orderExtendAttribute;
	}

	public void setOrderExtendAttribute(List<OrderExtendAttribute> orderExtendAttribute) {
	this.orderExtendAttribute = orderExtendAttribute;
	}

	public Quote withOrderExtendAttribute(List<OrderExtendAttribute> orderExtendAttribute) {
	this.orderExtendAttribute = orderExtendAttribute;
	return this;
	}
}
