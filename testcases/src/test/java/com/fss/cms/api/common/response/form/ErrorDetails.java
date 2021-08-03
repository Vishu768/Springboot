package com.fss.cms.api.common.response.form;

public class ErrorDetails {
String errorCode;
	
	String errorDesc;
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String toString() {
		return "ErrorDetails [errorCode=" + errorCode + ", errorDesc="
				+ errorDesc + "]";
	}


}
