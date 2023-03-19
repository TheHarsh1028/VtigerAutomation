package com.vtiger.qa.Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vtiger.qa.Pages.LoginPage;
import com.vtiger.qa.WebUtils.WebUtils;

public class BaseCLass extends WebUtils {

	public static WebUtils utils;
	LoginPage loginObj;
	@BeforeMethod
	public void BeforeMethod() {
		
		loginObj = new LoginPage();
		loginObj.enterCredentials();
	}
	
	
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		loginObj.logOut();
	}
	
	
	
	
	
	@BeforeClass
	public void setUp() {
		utils = new WebUtils();
		utils.launchBrowser();

	}

	@AfterClass
	public void tearDown() {
		utils.browserClose();
	}

}
