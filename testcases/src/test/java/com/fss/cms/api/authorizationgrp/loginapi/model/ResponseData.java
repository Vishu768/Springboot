package com.fss.cms.api.authorizationgrp.loginapi.model;

public class ResponseData {
	
	String requestReferenceNo;
	
	String responseReferenceNo;
	
	public String getRequestReferenceNo() {
		return requestReferenceNo;
	}

	public void setRequestReferenceNo(String requestReferenceNo) {
		this.requestReferenceNo = requestReferenceNo;
	}

	public String getResponseReferenceNo() {
		return responseReferenceNo;
	}

	public void setResponseReferenceNo(String responseReferenceNo) {
		this.responseReferenceNo = responseReferenceNo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAuthValue() {
		return authValue;
	}

	public void setAuthValue(String authValue) {
		this.authValue = authValue;
	}

	int status;
	String authValue;
	
	@Override
	public String toString() {
		return "ResponseData [requestRefNo=" + requestReferenceNo
				+ ", responseRefNo=" + responseReferenceNo + ", status=" + status
				+ ", authValue=" + authValue + "]";
	}
}
