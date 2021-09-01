package com.fss.cms.api.common.authorizationgrp.loginapi.request;

import com.fss.cms.api.common.authorizationgrp.loginapi.request.RequestDataForm;






public class LoginRequest{
	
	

	public RequestDataForm getRequestData() {
		return requestData;
	}

	public void setRequestData(RequestDataForm requestData) {
		this.requestData = requestData;
	}

	public String getRequestResultantValue() {
		return requestResultantValue;
	}

	public void setRequestResultantValue(String requestResultantValue) {
		this.requestResultantValue = requestResultantValue;
	}

	RequestDataForm requestData;

	String requestResultantValue;

	@Override
	public String toString() {
		return "LoginRequest [requestData=" + requestData
				+ ", requestResultantValue=" + requestResultantValue + "]";
	}
}
