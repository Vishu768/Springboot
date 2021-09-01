package com.fss.cms.api.authorizationgrp.loginapi.tests;

import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fss.cms.api.authorizationgrp.loginapi.response.LoginResponseData;
import com.fss.cms.api.common.authorizationgrp.loginapi.request.LoginRequest;
import com.fss.cms.api.common.authorizationgrp.loginapi.request.RequestDataForm;
import com.fss.cms.hashutil.HashUtil;
import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TestLoginapi {
	static SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
	static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");


	@Test
	public void test() {
		RequestSpecification request = RestAssured.given();
		request.header("Ocp-Apim-Subscription-Key", "5443145f231345d4a864af88655e0cb9");
		request.header("X-API-VERSION", "1");
		request.header("USERNAME", "apiuser");
		request.header("PASSWORD", "Y&@31rH$");
		request.header("Content-Type", "application/json");
/*
		JSONObject requestData = new JSONObject();

		requestData.put("instituitionId", "1001");
		requestData.put("channelIdentifier", "IB");
		requestData.put("requestType", "LA");
		requestData.put("branchCode", "10001");
		requestData.put("userCategory", "1");
		requestData.put("userId", "4100141");
		requestData.put("serviceKey", "NA");
		requestData.put("requestDate", "29/07/2021");
		requestData.put("requestTime", "16:30:22.328");
		requestData.put("requestReferenceNo", "LA290721163022328338");

		JSONObject json = new JSONObject();

		json.put("requestData", requestData);
		json.put("requestResultantValue", "2A50D19B08906DF21061D4B94CF2BA6C013C01D9F081AF95EACF50A5564885E5");

		String replace = null;
		replace = json.toJSONString().replace("a", "");*/

		LoginRequest login = getLoginAPIReq_test();
	
		System.out.println(login);
		request.body(login);
		Response response = request.post("https://products.fss.co.in/CMSAPI/login");
		System.out.println(response.asString());
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);
		Gson gson = new Gson();
		LoginResponseData loginResponse = gson.fromJson(response.asString(), LoginResponseData.class);
		System.out.println(loginResponse);
		Assert.assertNotNull(loginResponse.getResponseData());
		Boolean responseReferenceNoValidation = false;
		responseReferenceNoValidation = validateresponseReferenceNo(
				loginResponse.getResponseData().getResponseReferenceNo());

	
		Assert.assertNotNull(loginResponse.getError());
		Assert.assertNotNull(loginResponse.getResponseResultantValue());
		Assert.assertNotNull(loginResponse.getResponseData().getRequestReferenceNo());
		Assert.assertNotNull(loginResponse.getResponseData().getResponseReferenceNo());
		Assert.assertEquals(loginResponse.getResponseData().getStatus(), 200);
		Assert.assertNotNull(loginResponse.getResponseData().getAuthValue());
		Assert.assertEquals(loginResponse.getResponseData().getRequestReferenceNo(), login.getRequestData().getRequestReferenceNo());
		Assert.assertTrue(responseReferenceNoValidation);

	}

	private Boolean validateresponseReferenceNo(String getresponseReferenceNo) {
		Boolean prefixvalidation = false;
		Boolean validation = false;
		String prefix = "LA";
		Boolean datevalidation = false;
		Boolean timevalidation = false;
		Boolean suffixvalidation = false;

		String actualprefix = getresponseReferenceNo.substring(0, 2);
		System.out.println("actualprefix" + actualprefix);
		if (prefix.equals(actualprefix)) {
			prefixvalidation = true;
		}

		String actualdate = getresponseReferenceNo.substring(2, 8);
		System.out.println("actualdate" + actualdate);
		Date sdate1 = null;
		try {
			sdate1 = new SimpleDateFormat("ddmmyy").parse(actualdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (sdate1 != null) {

			datevalidation = true;
			System.out.println("Datevalidation is success");
		}

		String actualtime = getresponseReferenceNo.substring(8, 17);
		System.out.println("actualtime" + actualtime);
		Date stime1 = null;
		try {
			stime1 = new SimpleDateFormat("HHMMssSSS").parse(actualtime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (stime1 != null) {
			timevalidation = true;
			System.out.println("Timevalidation is success");
		}

		String actualsuffix = getresponseReferenceNo.substring(16, 19);
		System.out.println("actualsuffix" + actualsuffix);
		int i = Integer.parseInt(actualsuffix);
		if (i >= 0) {

			suffixvalidation = true;
			System.out.println("Suffixvalidation is success");
		}

		if (prefixvalidation && datevalidation && timevalidation && suffixvalidation)
			validation = true;

		return validation;
	}

	static RequestDataForm getRequestData_test(String reqType) {
		RequestDataForm reqData = new RequestDataForm();
		reqData.setBranchCode("20002");
		reqData.setRequestType(reqType);
		reqData.setRequestDate(getDate());
		reqData.setRequestTime(getTime());
		reqData.setRequestReferenceNo(getRefNo(reqType, reqData.getRequestDate(), reqData.getRequestTime()));//
		reqData.setInstitutionId(1000);
		reqData.setChannelIdentifier("IB");
		reqData.setUserCategory(1);
		reqData.setUserId("41000182");
		reqData.setServiceKey("NA");
		return reqData;
	}

	private static String getDate() {
		return sf.format(new Date());
	}

	private static String getTime() {
		return sdf.format(new Date(System.currentTimeMillis()));// - (3600 * 2500)
	}

	public static String getRefNo(String sc, String date, String time) {
		date = date.replaceAll("/", "");
		date = date.substring(0, 4) + date.substring(6, 8);
		time = time.replaceAll(":", "");
		time = time.replace(".", "");
		String seq = String.valueOf(new SecureRandom().nextInt(1000));
		while (seq.length() != 3) {
			seq = String.valueOf(new SecureRandom().nextInt(1000));
		}
		return sc + date + time + seq;
	}

	static LoginRequest getLoginAPIReq_test() {
		LoginRequest loginReq = new LoginRequest();

		loginReq.setRequestData(getRequestData_test("LA"));

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.setSerializationInclusion(Include.NON_EMPTY);
		HashUtil hash = new HashUtil();

		String dataToHash1 = "";
		try {
			dataToHash1 = objectMapper.writeValueAsString(loginReq);
			System.out.println("DATA TO HASH OF SERVICE -> REQ DATA " + dataToHash1);

			loginReq.setRequestResultantValue(
					hash.a(dataToHash1, "1000ADFADF", "1000FSE$SE$", "100FF0&F0&", "100*D%0D%0"));
			dataToHash1 = objectMapper.writeValueAsString(loginReq);
			System.out.println("LA>>" + dataToHash1);
		} catch (Exception e1) {
			System.out.println("Exception occured during hash check  >>>>> ::" + e1);
		}
		return loginReq;
	}
	

	}

