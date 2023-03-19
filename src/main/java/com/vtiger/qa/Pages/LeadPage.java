package com.vtiger.qa.Pages;

import org.openqa.selenium.By;

import com.vtiger.qa.Base.BaseCLass;

public class LeadPage extends BaseCLass {
	
	public void createLeads() {
		utils.acMouseOver(driver, driver.findElement(By.linkText("Sales")));
		utils.myClick(driver.findElement(By.xpath("//div[@class= 'drop_mnu']//a[@class='drop_down']")));
		
		utils.myClick(driver.findElement(By.xpath("//img[@alt='Create Lead...']")));
		
		utils.inputData(driver.findElement(By.xpath("//td[@class='showPanelBg']//input[@name='firstname']")), "Harsh");
		utils.inputData(driver.findElement(By.xpath("//td[@class='showPanelBg']//input[@name='lastname']")), "JI");
		utils.inputData(driver.findElement(By.xpath("//td[@class='showPanelBg']//input[@name='company']")), "Shelby Limited");
		
		utils.myClick(driver.findElement(By.xpath("//td[@colspan='4']//input[@class='crmbutton small save']")));
	}

}
