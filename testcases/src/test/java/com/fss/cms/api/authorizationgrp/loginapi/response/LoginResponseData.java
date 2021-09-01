package com.fss.cms.api.authorizationgrp.loginapi.response;

import com.fss.cms.api.authorizationgrp.loginapi.response.ResponseData;
import com.fss.cms.api.common.response.form.Error;

public class LoginResponseData {

	ResponseData responseData;
	Error error;

	String responseResultantValue;
	public ResponseData getResponseData() {
		return responseData;
	}
	public void setResponseData(ResponseData responseData) {
		this.responseData = responseData;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
	public String getResponseResultantValue() {
		return responseResultantValue;
	}
	public void setResponseResultantValue(String responseResultantValue) {
		this.responseResultantValue = responseResultantValue;
	}
	@Override
	public String toString() {
		return "LoginResponseData [responseData=" + responseData + ", error="
				+ error + ", responseResultantValue=" + responseResultantValue
				+ "]";
	}
	public int getStatusCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Object getauthValue() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getrequestReferenceNo() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getresponseReferenceNo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
