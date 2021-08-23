package pojo.source;

public class Items {
	private String itemId;
    private String partNumber;
    private String lastUpdatedDate;
    private String shortDescription;
    private String resourceId;
    private String change;
    
    public String getItemId() {
		return itemId;
	}
	public Items(String itemId, String partNumber, String lastUpdatedDate, String shortDescription, String resourceId,
			String change) {
		super();
		this.itemId = itemId;
		this.partNumber = partNumber;
		this.lastUpdatedDate = lastUpdatedDate;
		this.shortDescription = shortDescription;
		this.resourceId = resourceId;
		this.change = change;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
	
}
