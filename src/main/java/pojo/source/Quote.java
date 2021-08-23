package pojo.source;

import java.util.ArrayList;
import java.util.List;

public class Quote {
	private String id;
    private String name;
    private String productTotal;
    private String quoteNumber;
    private List<Items> items = new ArrayList<Items>();
    private List<OrderItemExtendedAttribute> orderItemAttribute = new ArrayList<OrderItemExtendedAttribute>();
    private List<OrderExtendAttribute> orderExtendAttribute = new ArrayList<OrderExtendAttribute>();
    
    public Quote(String id, String name, String productTotal, String quoteNumber, List<Items> items,
			List<OrderItemExtendedAttribute> orderItemAttribute, List<OrderExtendAttribute> orderExtendAttribute) {
		super();
		this.id = id;
		this.name = name;
		this.productTotal = productTotal;
		this.quoteNumber = quoteNumber;
		this.items = items;
		this.orderItemAttribute = orderItemAttribute;
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
	public String getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public List<Items> getItem() {
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
