package com.rightstart.pages;

import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.DahsBoardPageProperty;
import com.rightstart.utility.WebElements;

public class DashBaordPage extends WebElements  implements DahsBoardPageProperty{

	
	public DashBaordPage(WebDriver driver) {
		super(driver);
	}
	
	
	public String verifyWelcomeMessage() {
		return getText(userWelcomeMessage);
	}
	
	public void clickMyProfle() {
		click(myProfileLocator);
	}
	
	
}
