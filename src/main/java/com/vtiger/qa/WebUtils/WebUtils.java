package com.vtiger.qa.WebUtils;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.Utils;

import com.sun.jmx.mbeanserver.Util;

public class WebUtils {
	

	public static WebDriver driver;
	public Actions action;
	public Select select;

	// ** Class Objects **//
	public void selectClassObj(WebElement element) {
		select = new Select(element);
	}

	public void actionClassObj(WebDriver driver) {
		action = new Actions(driver);

	}

	// ** Waiting Methods **//
	public void threadWait(int duration)  {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void implicitlyWait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

	// ** Action Class Functions **//

	public void acMouseOver(WebDriver driver, WebElement element) {
		actionClassObj(driver);
		if (element.isDisplayed() == true) {
			action.moveToElement(element).build().perform();
		} else
			System.out.println("Element not Found.");
	}

	public void acRightClickOnElement(WebDriver driver, WebElement element) {
		actionClassObj(driver);
		if (element.isDisplayed() == true) {
			action.contextClick(element).build().perform();
		} else
			System.out.println("Element Not Found.");
	}

	public void acRightClick(WebDriver driver) {
		actionClassObj(driver);
		action.contextClick().build().perform();
	}

	public void acDoubleClick(WebDriver driver) {
		actionClassObj(driver);
		action.doubleClick().build().perform();
	}

	public void acDoubleClickOnElement(WebDriver driver, WebElement element) {
		actionClassObj(driver);
		if (element.isDisplayed() == true) {
			action.doubleClick(element).build().perform();
		} else
			System.out.println("Element Not Found.");
	}

	public void acDragAndDrop(WebDriver driver, WebElement element, WebElement target) {
		actionClassObj(driver);
		if (element.isDisplayed() == true) {
			action.dragAndDrop(element, target).build().perform();
		} else
			System.out.println("Element Not Found.");
	}

	public void acDragAndDropBy(WebDriver driver, WebElement element, int x, int y) {
		actionClassObj(driver);
		if (element.isDisplayed() == true) {
			action.dragAndDropBy(element, x, y).build().perform();
		} else
			System.out.println("Element Not Found.");
	}

	public void acEnterKeys(WebDriver driver, WebElement element, String value) {
		actionClassObj(driver);
		if (element.isDisplayed() == true) {
			action.sendKeys(element, value).build().perform();
		} else
			System.out.println("Element Not Found.");
	}

	// ** Select Class Functions **//

	public void slSelectByText(WebElement element, String text) {
		selectClassObj(element);
		if (element.isDisplayed() == true) {
			select.selectByVisibleText(text);
		} else
			System.out.println("Element Not Found.");
	}

	public void slSelectByIndex(WebElement element, int index) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			select.selectByIndex(index);
		} else
			System.out.println("Element Not Found.");
	}

	public void slSelectByValue(WebElement element, String value) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			select.selectByValue(value);
		} else
			System.out.println("Element Not Found.");
	}

	public void slDeselectAll(WebElement element) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			select.deselectAll();
		} else
			System.out.println("Element Not Found.");
	}

	public void slDeselectByText(WebElement element, String text) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			select.deselectByVisibleText(text);
		} else
			System.out.println("Element Not Found.");
	}

	public void slDeselectByValue(WebElement element, String value) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			select.deselectByValue(value);
		} else
			System.out.println("Element Not Found.");
	}

	public void slDEselectByindex(WebElement element, int index) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			select.deselectByIndex(index);
		}
	}

	public void slGetAllSelectedOptions(WebElement element) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			for (WebElement Options : allSelectedOptions) {
				System.out.println("Slected Option : " + Options.getText());
			}
		} else
			System.out.println("Element Not Found.");
	}

	public void slGetFirstSelcetedOptions(WebElement element) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			WebElement firstOption = select.getFirstSelectedOption();
			System.out.println("First Selected Option : " + firstOption.getText());
		} else
			System.out.println("Element not Found.");
	}

	public void slIsMultiple(WebElement element) {
		selectClassObj(element);
		if (element.isDisplayed() == true && element.isEnabled() == true) {
			if (select.isMultiple()) {
				System.out.println("Selected Tag Allows Multiple Selections");
			} else
				System.out.println("Selected Tag Not Allows Multiple Selections");
		} else
			System.out.println("Element Not Found.");
	}

	public void slGetOptions(WebElement element) {
		selectClassObj(element);
		if (element.isDisplayed() && element.isEnabled()) {
			List<WebElement> Options = select.getOptions();
			for (WebElement Option : Options) {
				System.out.println("Option : " + Option.getText());
			}
		} else
			System.out.println("Element Not Found.");
	}

//**     WINDOW HANDLING    **//

	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public void switchToWindowByTitle(String title) {

		Set<String> AllWinHashCode = driver.getWindowHandles();

		for (String WinHashCode : AllWinHashCode) {
			String currentWin = driver.getTitle();
			driver.switchTo().window(currentWin);
			if (currentWin.equals(title)) {
				break;
			}
		}
	}

	public void switchToWindowByUrl(String url) {

		Set<String> AllWinHashCode = driver.getWindowHandles();

		for (String WinHashCode : AllWinHashCode) {
			String currentWin = driver.getTitle();
			driver.switchTo().window(currentWin);
			if (currentWin.equals(url)) {
				break;
			}
		}
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
	}
	
	

	public void browserClose() {
		driver.quit();

	}

	
	
	
	public void inputData(WebElement element, String value) {
		if (element.isDisplayed() == true) {
			element.sendKeys(value);
		} else
			System.out.println("element is not displayed");

	}

	
	
	
	
	public void myClick(WebElement element) {
		if (element.isDisplayed() == true) {
			element.click();
		} else
			System.out.println("element is not displayed");

	}

}
