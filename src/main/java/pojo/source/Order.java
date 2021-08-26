package pojo.source;

import java.util.ArrayList;
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
	@JsonProperty("productId")
    private String productId;
    private List<Items> items = new ArrayList<Items>();
    //private List<OrderItemExtendedAttribute> orderItemAttribute = new ArrayList<OrderItemExtendedAttribute>();
    private List<OrderExtendAttribute> orderExtendAttribute = new ArrayList<OrderExtendAttribute>();
    
    public Order(String id, String name, String productTotal, String orderNumber, String status, String productId,
			List<Items> items, List<OrderExtendAttribute> orderExtendAttribute) {
		super();
		this.id = id;
		this.name = name;
		this.productTotal = productTotal;
		this.orderNumber = orderNumber;
		this.status = status;
		this.productId = productId;
		this.items = items;
		this.orderExtendAttribute = orderExtendAttribute;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductTotal() {
		return productTotal;
	}
	public void setProductTotal(String productTotal) {
		this.productTotal = productTotal;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
//	public List<OrderItemExtendedAttribute> getOrderItemAttribute() {
//		return orderItemAttribute;
//	}
//	public void setOrderItemAttribute(List<OrderItemExtendedAttribute> orderItemAttribute) {
//		this.orderItemAttribute = orderItemAttribute;
//	}
	public List<OrderExtendAttribute> getOrderExtendAttribute() {
		return orderExtendAttribute;
	}
	public void setOrderExtendAttribute(List<OrderExtendAttribute> orderExtendAttribute) {
		this.orderExtendAttribute = orderExtendAttribute;
	}
	

}
