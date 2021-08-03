package restapi;

import static org.junit.Assert.*;

import org.junit.Test;





import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;


import com.fss.cms.api.common.authorizationgrp.loginapi.model.LoginRequest;
import com.fss.cms.api.common.authorizationgrp.loginapi.model.LoginResponseData;
import com.fss.cms.api.common.request.form.RequestDataForm;
import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Instituition {
	
	@Test
	
		public void check() {
		
			RequestSpecification request=RestAssured.given();
			request.header("Ocp-Apim-Subscription-Key","5443145f231345d4a864af88655e0cb9");
			request.header("X-API-VERSION","1");
			request.header("USERNAME","apiuser");
			request.header("PASSWORD","Y&@31rH$");
			request.header("Content-Type","application/json");
			
			
			String req="{\"channelIdentifier\":\"IB\",\"requestType\":\"LA\",\"branchCode\":\"10001\",\"userCategory\":1,\"userId\":\"4100141\",\"serviceKey\":\"NA\",\"requestDate\":\"29/07/2021\",\"requestTime\":\"16:30:22.328\",\"requestReferenceNo\":\"LA290721163022328338\"}";
			RequestDataForm LoginrequestData=new RequestDataForm();
			//LoginrequestData.setInstitutionId();
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
			login.setRequestResultantValue("DD025EAC58179E7B1170B9C38CB41FF88E35990D16BA563029F60BCEC0E1F4D3");
			LoginRequest logincheck=new LoginRequest();
			logincheck.setRequestData(LoginrequestData);
			logincheck.setRequestResultantValue("2A50D19B08906DF21061D4B94CF2BA6C013C01D9F081AF95EACF50A5564885E5");
			
			
			
			System.out.println(logincheck);
			
			request.body(logincheck);
			Response response=request.post("https://products.fss.co.in/CMSAPI/login");
			System.out.println(response.asString());
			int code = response.getStatusCode();
			Assert.assertEquals(code,200);
	}	
	@Test
	public void check1() {
		
			RequestSpecification request=RestAssured.given();
			request.header("Ocp-Apim-Subscription-Key","5443145f231345d4a864af88655e0cb9");
			request.header("X-API-VERSION","1");
			request.header("USERNAME","apiuser");
			request.header("PASSWORD","Y&@31rH$");
			request.header("Content-Type","application/json");
			
			
	
		String req="{\"channelIdentifier\":\"IB\",\"requestType\":\"LA\",\"branchCode\":\"10001\",\"userCategory\":1,\"userId\":\"4100141\",\"serviceKey\":\"NA\",\"requestDate\":\"29/07/2021\",\"requestTime\":\"16:30:22.328\",\"requestReferenceNo\":\"LA290721163022328338\"}";
		RequestDataForm LoginrequestData=new RequestDataForm();
		LoginrequestData.setInstitutionId(12345);
		LoginrequestData.setChannelIdentifier("IB");
		LoginrequestData.setRequestType("LA");
		LoginrequestData.setUserCategory(1);
		LoginrequestData.setBranchCode("10001");
		LoginrequestData.setUserId("4100141");
	
		LoginrequestData.setServiceKey("NA");
		LoginrequestData.setRequestDate("29/07/2021");
		LoginrequestData.setRequestTime("16:30:22.328");
		LoginrequestData.setRequestReferenceNo("LA290721163022328338");
		
		
		LoginRequest logincheck1=new LoginRequest();
		logincheck1.setRequestData(LoginrequestData);
		logincheck1.setRequestResultantValue("C895662C60D7232877FED2E64D65BB4E19060F13F052BD825C4EB8367B5DB835");
System.out.println(logincheck1);
		
		request.body(logincheck1);
		Response response=request.post("https://products.fss.co.in/CMSAPI/login");
		System.out.println(response.asString());
		int code = response.getStatusCode();
		Assert.assertEquals(code,200);
}	
	@Test
	public void check2() {
		
		
			RequestSpecification request=RestAssured.given();
			request.header("Ocp-Apim-Subscription-Key","5443145f231345d4a864af88655e0cb9");
			request.header("X-API-VERSION","1");
			request.header("USERNAME","apiuser");
			request.header("PASSWORD","Y&@31rH$");
			request.header("Content-Type","application/json");
			
			
		String req="{\"channelIdentifier\":\"IB\",\"requestType\":\"LA\",\"branchCode\":\"10001\",\"userCategory\":1,\"userId\":\"4100141\",\"serviceKey\":\"NA\",\"requestDate\":\"29/07/2021\",\"requestTime\":\"16:30:22.328\",\"requestReferenceNo\":\"LA290721163022328338\"}";
		RequestDataForm LoginrequestData=new RequestDataForm();
		LoginrequestData.setInstitutionId(1111);
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
		login.setRequestResultantValue("65F2B1AAD6389B3AFFDFAEB07323A50845586F320499D341F4D8F30D11FA8493");
		LoginRequest logincheck2=new LoginRequest();
		logincheck2.setRequestData(LoginrequestData);
		logincheck2.setRequestResultantValue("C895662C60D7232877FED2E64D65BB4E19060F13F052BD825C4EB8367B5DB835");
System.out.println(logincheck2);
		
		request.body(logincheck2);
		Response response=request.post("https://products.fss.co.in/CMSAPI/login");
		System.out.println(response.asString());
		int code = response.getStatusCode();
		Assert.assertEquals(code,200);
	}

	
	
	public void test1()
	{
		RequestSpecification request=RestAssured.given();
		request.header("Ocp-Apim-Subscription-Key","5443145f231345d4a864af88655e0cb9");
		request.header("X-API-VERSION","1");
		request.header("USERNAME","apiuser");
		request.header("PASSWORD","Y&@31rH$");
		request.header("Content-Type","application/json");
		
		
		/*
		 * JSONObject requestData=new JSONObject();
		 * 
		 * 
		 * requestData.put("instituitionId","1001");
		 * requestData.put("channelIdentifier","IB");
		 * requestData.put("requestType","LA"); requestData.put("branchCode","10001");
		 * requestData.put("userCategory","1"); requestData.put("userId","4100141");
		 * requestData.put("serviceKey","NA");
		 * requestData.put("requestDate","23/07/2021");
		 * requestData.put("requestTime","23:03:49.036");
		 * requestData.put("requestReferenceNo","LA230721230349036467");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * JSONObject json=new JSONObject();
		 * 
		 * 
		 * 
		 * 
		 * json.put("requestData",requestData); json.put("requestResultantValue",
		 * "F9F12E6D4D1CA89393A3C94CF0D216B2B244D5DADF44E33A547041C67C8C3F93");
		 */
	    
		//String replace=null;
		//replace=json.toJSONString().replace("a","");
		
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
		

		Gson gson=new Gson();
		LoginResponseData loginResponse =gson.fromJson(response.asString(),LoginResponseData.class);
		System.out.println(loginResponse);

		
		
		Boolean responseReferenceNoValidation=false;
		responseReferenceNoValidation=validateresponseReferenceNo(loginResponse.getResponseData().getResponseReferenceNo());
		
				
		Assert.assertNotNull(loginResponse.getResponseData());
		Assert.assertNotNull(loginResponse.getError());
		Assert.assertNull(loginResponse.getResponseResultantValue());
		Assert.assertNotNull(loginResponse.getrequestReferenceNo());
		Assert.assertNotNull(loginResponse.getresponseReferenceNo());
		Assert.assertEquals(loginResponse.getResponseData().getStatus(),200);
		Assert.assertNull(loginResponse.getauthValue());
		Assert.assertEquals(loginResponse.getrequestReferenceNo(),login.getRequestData().getRequestReferenceNo());
	Assert.assertTrue(responseReferenceNoValidation);
		
		
		
}

	private Boolean validateresponseReferenceNo(String getresponseReferenceNo) {
		Boolean prefixvalidation=false;
		Boolean validation=false;
		String prefix="LA";
		Boolean datevalidation=false;
		Boolean dvalidation=false;
		String dateformat="ddmmyy";
		String sdate="null";
		Boolean timevalidation=false;
		Boolean tvalidation=false;
		String timeformat="HHMMssSSS";
		String stime="null";
		Boolean suffixvalidation=false;
		Boolean svalidation=false;
		String suffix="000";
		String actualprefix=getresponseReferenceNo.substring(0, 2);
		if(prefix.equals(actualprefix))
		{
		prefixvalidation=true;
		}
		
		
		String actualdate=getresponseReferenceNo.substring(2,8);
		
		try {
			Date sdate1=new SimpleDateFormat("ddmmyy").parse(sdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(sdate!=null)
		{
		
			datevalidation=true;
		}
		
		
		String actualtime=getresponseReferenceNo.substring(8,17);
		
		try {
			Time stime1=(Time) new SimpleDateFormat("HHMMssSSS").parse(stime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(stime!=null)
		{
			timevalidation=true;
		}
		
		String actualsuffix=getresponseReferenceNo.substring(16,19);
		int i=Integer.parseInt(actualsuffix);
		if(i>=0)
		{
		
			svalidation=true;
		}
		
		
		if(prefixvalidation&&datevalidation&&timevalidation&&suffixvalidation)
			validation=true;
		
		
		return validation;
	}
}
