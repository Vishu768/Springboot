package com.fss.cms.api.authorizationgrp.loginapi.tests;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fss.cms.api.common.authorizationgrp.loginapi.request.LoginRequest;
import com.fss.cms.api.common.authorizationgrp.loginapi.request.RequestDataForm;
import com.fss.cms.hashutil.HashUtil;

public class RequestGenerator {
	static SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
	static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");

	public static void main(String[] args) {
		getLoginAPIRequest();
	}

	static String getLoginAPIRequest() {
		LoginRequest loginReq = new LoginRequest();

		loginReq.setRequestData(getRequestData("LA"));

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
		return dataToHash1;
	}

	static RequestDataForm getRequestData(String reqType) {
		RequestDataForm reqData = new RequestDataForm();
		reqData.setBranchCode("10001");
		reqData.setRequestType(reqType);
		reqData.setRequestDate(getDate());
		reqData.setRequestTime(getTime());
		reqData.setRequestReferenceNo(getRefNo(reqType, reqData.getRequestDate(), reqData.getRequestTime()));//
		reqData.setInstitutionId(1001);
		// reqData.setChannelIdentifier("IB");
		reqData.setUserCategory(1);
		reqData.setUserId("4100141");
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

}
