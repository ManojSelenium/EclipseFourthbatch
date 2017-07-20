package com.rightstart.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElements {

	WebDriver driver;
	
	public WebElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
	}
	
	public void clearTextBox(By prop) {
		driver.findElement(prop).clear();
	}
	
	public String getText(By prop) {
		
		return driver.findElement(prop).getText();
	}
	
	public boolean verifyElementPresent(By prop) {
		
		System.out.println("Driver From WebElements:::: "+driver);
		boolean elementFound=false;
		try {
			elementFound=driver.findElement(prop).isDisplayed();
			return elementFound;
		} catch (Exception e) {
			return elementFound;
		}
	}
}
