package pojo.destination;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationMessage {
	@JsonProperty("partNumber")
	private String partNumber;
	@JsonProperty("shortDescription")
	private String shortDescription;
	@JsonProperty("extTaskId")
	private String extTaskId;
	@JsonProperty("extTaskName")
	private String extTaskName;
	@JsonProperty("extUserId")
	private String extUserId;
	@JsonProperty("extUserName")
	private String extUserName;
	@JsonProperty("extLocationId")
	private String extLocationId;
	@JsonProperty("extLocationName")
	private String extLocationName;
	@JsonProperty("status")
	private String status;
	@JsonProperty("extAttributes")
	private List<ExtAttributes> extAttributes = null;

	/**
	* No args constructor for use in serialization
	*
	*/
	public DestinationMessage() {
	}

	/**
	*
	* @param extLocationId
	* @param extTaskId
	* @param extUserId
	* @param extUserName
	* @param partNumber
	* @param shortDescription
	* @param extLocationNmae
	* @param extTaskName
	* @param status
	* @param extAttributes
	*/
	public DestinationMessage(String partNumber, String shortDescription, String extTaskId, String extTaskName, String extUserId, String extUserName, String extLocationId, String extLocationName, String status, List<ExtAttributes> extAttributes) {
	super();
	this.partNumber = partNumber;
	this.shortDescription = shortDescription;
	this.extTaskId = extTaskId;
	this.extTaskName = extTaskName;
	this.extUserId = extUserId;
	this.extUserName = extUserName;
	this.extLocationId = extLocationId;
	this.extLocationName = extLocationName;
	this.status = status;
	this.extAttributes = extAttributes;
	}

	public String getPartNumber() {
	return partNumber;
	}

	public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
	}

	public DestinationMessage withPartNumber(String partNumber) {
	this.partNumber = partNumber;
	return this;
	}

	public String getShortDescription() {
	return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
	this.shortDescription = shortDescription;
	}

	public DestinationMessage withShortDescription(String shortDescription) {
	this.shortDescription = shortDescription;
	return this;
	}

	public String getExtTaskId() {
	return extTaskId;
	}

	public void setExtTaskId(String extTaskId) {
	this.extTaskId = extTaskId;
	}

	public DestinationMessage withExtTaskId(String extTaskId) {
	this.extTaskId = extTaskId;
	return this;
	}

	public String getExtTaskName() {
	return extTaskName;
	}

	public void setExtTaskName(String extTaskName) {
	this.extTaskName = extTaskName;
	}

	public DestinationMessage withExtTaskName(String extTaskName) {
	this.extTaskName = extTaskName;
	return this;
	}

	public String getExtUserId() {
	return extUserId;
	}

	public void setExtUserId(String extUserId) {
	this.extUserId = extUserId;
	}

	public DestinationMessage withExtUserId(String extUserId) {
	this.extUserId = extUserId;
	return this;
	}

	public String getExtUserName() {
	return extUserName;
	}

	public void setExtUserName(String extUserName) {
	this.extUserName = extUserName;
	}

	public DestinationMessage withExtUserName(String extUserName) {
	this.extUserName = extUserName;
	return this;
	}

	public String getExtLocationId() {
	return extLocationId;
	}

	public void setExtLocationId(String extLocationId) {
	this.extLocationId = extLocationId;
	}

	public DestinationMessage withExtLocationId(String extLocationId) {
	this.extLocationId = extLocationId;
	return this;
	}

	public String getExtLocationName() {
	return extLocationName;
	}

	public void setExtLocationName(String extLocationName) {
	this.extLocationName = extLocationName;
	}

	public DestinationMessage withExtLocationName(String extLocationName) {
	this.extLocationName = extLocationName;
	return this;
	}

	public String getStatus() {
	return status;
	}

	public void setStatus(String status) {
	this.status = status;
	}

	public DestinationMessage withStatus(String status) {
	this.status = status;
	return this;
	}

	public List<ExtAttributes> getExtAttributes() {
	return extAttributes;
	}

	public void setExtAttributes(List<ExtAttributes> extAttributes) {
	this.extAttributes = extAttributes;
	}

	public DestinationMessage withExtAttributes(List<ExtAttributes> extAttributes) {
	this.extAttributes = extAttributes;
	return this;
	}
}
