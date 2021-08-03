package com.fss.cms.api.common.request.form;

public class RequestDataForm {
	
	public Integer getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(Integer institutionId) {
		this.institutionId = institutionId;
	}

	public String getChannelIdentifier() {
		return channelIdentifier;
	}

	public void setChannelIdentifier(String channelIdentifier) {
		this.channelIdentifier = channelIdentifier;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Integer getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(Integer userCategory) {
		this.userCategory = userCategory;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getServiceKey() {
		return serviceKey;
	}

	public void setServiceKey(String serviceKey) {
		this.serviceKey = serviceKey;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getRequestReferenceNo() {
		return requestReferenceNo;
	}

	public void setRequestReferenceNo(String requestReferenceNo) {
		this.requestReferenceNo = requestReferenceNo;
	}

	Integer institutionId;
	
	String channelIdentifier;
	
	String requestType;
	
	String branchCode;
	
	Integer userCategory;
	
	String userId;
	
	String serviceKey;
	
	String requestDate;
	
	String requestTime;
	
	String requestReferenceNo;

	public String toString() {
		return "RequestDataForm [instituitionID=" + institutionId + ", channelIdentifier=" + channelIdentifier + ", requestType="
				+ requestType + ", branchCode=" + branchCode + ", userCategory=" + userCategory
				+ ", userId=" + userId + ", serviceKey=" + serviceKey + ", requestDate="
				+ requestDate + ", requestTime=" + requestTime + ", requestReferenceNo=" + requestReferenceNo + "]";
	}

}
