package pojo.source;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String id;
    private String name;
    private String productTotal;
    private String orderNumber;
    private String status;
    private String productId;
    private List<Items> items = new ArrayList<Items>();
    private List<OrderItemExtendedAttribute> orderItemAttribute = new ArrayList<OrderItemExtendedAttribute>();
    private List<OrderExtendAttribute> orderExtendAttribute = new ArrayList<OrderExtendAttribute>();
    
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
	public List<OrderItemExtendedAttribute> getOrderItemAttribute() {
		return orderItemAttribute;
	}
	public void setOrderItemAttribute(List<OrderItemExtendedAttribute> orderItemAttribute) {
		this.orderItemAttribute = orderItemAttribute;
	}
	public List<OrderExtendAttribute> getOrderExtendAttribute() {
		return orderExtendAttribute;
	}
	public void setOrderExtendAttribute(List<OrderExtendAttribute> orderExtendAttribute) {
		this.orderExtendAttribute = orderExtendAttribute;
	}
	

}
