package restapi;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fss.cms.api.common.authorizationgrp.loginapi.model.LoginRequest;
import com.fss.cms.api.common.request.form.RequestDataForm;

public class RequestGenerator {

	public static void main(String[] args) {
		String req="{\"institutionId\":1001,\"channelIdentifier\":\"IB\",\"branchCode\":\"10001\",\"userCategory\":1,\"userId\":\"4100141\",\"serviceKey\":\"NA\",\"requestDate\":\"29/07/2021\",\"requestTime\":\"16:30:22.328\",\"requestReferenceNo\":\"LA290721163022328338\"}";
		RequestDataForm LoginrequestData=new RequestDataForm();
		LoginrequestData.setInstitutionId(1001);
		LoginrequestData.setChannelIdentifier("IB");
		LoginrequestData.setRequestType("SS");
		LoginrequestData.setUserCategory(1);
		LoginrequestData.setBranchCode("10001");
		LoginrequestData.setUserId("4100141");
	
		LoginrequestData.setServiceKey("NA");
		LoginrequestData.setRequestDate("29/07/2021");
		LoginrequestData.setRequestTime("16:30:22.328");
		LoginrequestData.setRequestReferenceNo("LA290721163022328338");
		
		
		LoginRequest login=new LoginRequest();
		login.setRequestData(LoginrequestData);
		login.setRequestResultantValue("E634BB96D3621FD1897DA12ABEB9A873705C62A1D2A0764493CC8C73EB964E72");

ObjectMapper objectMapper = new ObjectMapper();
objectMapper.setSerializationInclusion(Include.NON_NULL);
objectMapper.setSerializationInclusion(Include.NON_EMPTY);
 
String dataToHash = "";
try {
    dataToHash = objectMapper.writeValueAsString(login.getRequestData());
    System.out.println(dataToHash);
}
catch(Exception e){
 
}

		

	}

}
