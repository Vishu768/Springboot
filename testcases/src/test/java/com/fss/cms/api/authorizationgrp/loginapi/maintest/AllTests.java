package com.fss.cms.api.authorizationgrp.loginapi.maintest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.fss.cms.api.authorizationgrp.loginapi.tests.BranchCode;
import com.fss.cms.api.authorizationgrp.loginapi.tests.Instituition;
import com.fss.cms.api.authorizationgrp.loginapi.tests.RequestDate;
import com.fss.cms.api.authorizationgrp.loginapi.tests.RequestTime;
import com.fss.cms.api.authorizationgrp.loginapi.tests.RequestType;
import com.fss.cms.api.authorizationgrp.loginapi.tests.TestLoginapi;
import com.fss.cms.api.authorizationgrp.loginapi.tests.UserCategory;
import com.fss.cms.api.authorizationgrp.loginapi.tests.UserId;
import com.fss.cms.api.authorizationgrp.loginapi.tests.channelid;
import com.fss.cms.api.authorizationgrp.loginapi.tests.requestReferenceNo;

@RunWith(Suite.class)
@SuiteClasses({ BranchCode.class, channelid.class, Instituition.class, RequestDate.class, requestReferenceNo.class,
		RequestTime.class, RequestType.class, TestLoginapi.class, UserCategory.class, UserId.class })
public class AllTests {

}
