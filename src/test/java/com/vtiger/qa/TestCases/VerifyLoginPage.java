package com.vtiger.qa.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.qa.Base.BaseCLass;
import com.vtiger.qa.Pages.LoginPage;

public class VerifyLoginPage extends BaseCLass{
	
	@Test
	public void tcValidateLogIn() {
		
		
		LoginPage login = new LoginPage();
		login.enterCredentials();
		
		

	}
}
