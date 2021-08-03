package com.fss.cms.api.common.response.form;

import java.util.List;

import com.fss.cms.api.common.response.form.ErrorDetails;



public class Error {
	
	String errorDescription;
	
	List<ErrorDetails> errorDetails;

	@Override
	public String toString() {
		return "Error [errorDescription=" + errorDescription + ", errorDetails=" + errorDetails + "]";
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public List<ErrorDetails> getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(List<ErrorDetails> errorDetails) {
		this.errorDetails = errorDetails;
	}
}
