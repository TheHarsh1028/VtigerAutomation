package com.vtiger.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.vtiger.qa.Base.BaseCLass;

public class AccountPage extends BaseCLass {
	
	public void createAccount() {
		
		utils.acMouseOver(driver, driver.findElement(By.linkText("Marketing")));
		utils.myClick(driver.findElement(By.linkText("Accounts")));
		
		utils.myClick(driver.findElement(By.xpath("//img[@alt='Create Account...']")));
		
		utils.inputData(driver.findElement(By.xpath("//input[@name='accountname']")), "HArshJi1");
		utils.myClick(driver.findElement(By.xpath("//input[@value='T']")));
		utils.slSelectByText(driver.findElement(By.name("assigned_group_id")), "Support Group");
		
		
		utils.myClick(driver.findElement(By.xpath("//input[@name='button']")));
		 
		
		utils.threadWait(3000);
		
		
		Alert alrt = driver.switchTo().alert();
	    String duplicateAlertText = alrt.getText();
		if (duplicateAlertText.contains("Account Name Already Exists!")) {
			alrt.accept();
		}
		else {
			System.out.println("Account Created.");
		}
		
	}
 
}
