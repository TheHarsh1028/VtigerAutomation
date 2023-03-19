package com.vtiger.qa.Runner;

import com.vtiger.qa.TestCases.VerifyLoginPage;

public class Runner {

	public static void main(String[] args) {
		VerifyLoginPage verifyLoginPageObj = new VerifyLoginPage();
		verifyLoginPageObj.tcValidateLogIn();
	}
	
}
