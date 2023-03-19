package com.vtiger.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.vtiger.qa.Base.BaseCLass;

public class LoginPage extends BaseCLass {

	public void enterCredentials() {

		WebElement userName = driver.findElement(By.name("user_name"));
		utils.inputData(userName, "admin");

		WebElement password = driver.findElement(By.name("user_password"));
		utils.inputData(password, "admin");

		utils.myClick(driver.findElement(By.name("Login")));

	}

	public void logOut() throws InterruptedException {
		utils.threadWait(4000);
		utils.myClick(driver.findElement(By.linkText("Sign Out")));
	}

}