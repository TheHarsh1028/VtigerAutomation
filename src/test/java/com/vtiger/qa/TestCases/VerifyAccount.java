package com.vtiger.qa.TestCases;

import org.testng.annotations.Test;

import com.vtiger.qa.Base.BaseCLass;
import com.vtiger.qa.Pages.AccountPage;
import com.vtiger.qa.Pages.LoginPage;

public class VerifyAccount extends BaseCLass{
	
	@Test
	public void tcValidateAccountCreation() {
		
		AccountPage accPage = new AccountPage();
		accPage.createAccount();
		
		
		}
}
