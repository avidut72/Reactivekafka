package com.kafka.controller.dto;

import pojo.destination.ExtAttributes;

public class DestinationMessageDto {
	
	String partNumber;
	String shortDescription;
	String extTaskId;
	String extTaskName;
	String extUserId;
	String extUserName;
	String extLocationId;
	String extLocationName;
	String status;
	String key;
	String value;
	ExtAttributes extAttributes;
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getExtTaskId() {
		return extTaskId;
	}
	public void setExtTaskId(String extTaskId) {
		this.extTaskId = extTaskId;
	}
	public String getExtTaskName() {
		return extTaskName;
	}
	public void setExtTaskName(String extTaskName) {
		this.extTaskName = extTaskName;
	}
	public String getExtUserId() {
		return extUserId;
	}
	public void setExtUserId(String extUserId) {
		this.extUserId = extUserId;
	}
	public String getExtUserName() {
		return extUserName;
	}
	public void setExtUserName(String extUserName) {
		this.extUserName = extUserName;
	}
	public String getExtLocationId() {
		return extLocationId;
	}
	public void setExtLocationId(String extLocationId) {
		this.extLocationId = extLocationId;
	}
	public String getExtLocationName() {
		return extLocationName;
	}
	public void setExtLocationName(String extLocationName) {
		this.extLocationName = extLocationName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public ExtAttributes getExtAttributes() {
		return extAttributes;
	}
	public void setExtAttributes(ExtAttributes extAttributes) {
		this.extAttributes = extAttributes;
	}

}
