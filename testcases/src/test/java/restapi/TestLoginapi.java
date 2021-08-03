package restapi;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.Test;

import com.fss.cms.api.common.authorizationgrp.loginapi.model.LoginRequest;
import com.fss.cms.api.common.request.form.RequestDataForm;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TestLoginapi {

	@Test
	public void test() {
		RequestSpecification request=RestAssured.given();
		request.header("Ocp-Apim-Subscription-Key","5443145f231345d4a864af88655e0cb9");
		request.header("X-API-VERSION","1");
		request.header("USERNAME","apiuser");
		request.header("PASSWORD","Y&@31rH$");
		request.header("Content-Type","application/json");
		
		
		JSONObject requestData=new JSONObject();
		
		
		  requestData.put("instituitionId","1001");
		  requestData.put("channelIdentifier","IB");
		  requestData.put("requestType","LA"); requestData.put("branchCode","10001");
		  requestData.put("userCategory","1"); requestData.put("userId","4100141");
		  requestData.put("serviceKey","NA");
		  requestData.put("requestDate","29/07/2021");
		  requestData.put("requestTime","16:30:22.328");
		  requestData.put("requestReferenceNo","LA290721163022328338");
		 
		
		
		
	
		
		  JSONObject json=new JSONObject();
		  
		  
		  
		  
		  json.put("requestData",requestData); json.put("requestResultantValue",
		  "2A50D19B08906DF21061D4B94CF2BA6C013C01D9F081AF95EACF50A5564885E5");
		 
	    
		String replace=null;
		replace=json.toJSONString().replace("a","");
		
		RequestDataForm LoginrequestData=new RequestDataForm();
		LoginrequestData.setInstitutionId(1001);
		LoginrequestData.setChannelIdentifier("IB");
		LoginrequestData.setRequestType("LA");
		LoginrequestData.setUserCategory(1);
		LoginrequestData.setBranchCode("10001");
		LoginrequestData.setUserId("4100141");
	
		LoginrequestData.setServiceKey("NA");
		LoginrequestData.setRequestDate("29/07/2021");
		LoginrequestData.setRequestTime("16:30:22.328");
		LoginrequestData.setRequestReferenceNo("LA290721163022328338");
		
		
		LoginRequest login=new LoginRequest();
		login.setRequestData(LoginrequestData);
		login.setRequestResultantValue("2A50D19B08906DF21061D4B94CF2BA6C013C01D9F081AF95EACF50A5564885E5");
		
		
		
		
		
		
System.out.println(login);
		request.body(login);
		Response response=request.post("https://products.fss.co.in/CMSAPI/login");
		System.out.println(response.asString());
		int code = response.getStatusCode();
		Assert.assertEquals(code,200);
		
	}

}

