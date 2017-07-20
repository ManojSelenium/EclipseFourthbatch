package com.rightstart.pages;

import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.LandingPageProperty;
import com.rightstart.utility.WebElements;

public class LandingPage extends WebElements implements LandingPageProperty {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		System.out.println("Driver From Landing Page ::: "+this.driver);
	}
	
	
	public void closeWelcomePopup() {
		click(welcomePopupLocator);
		
	}
	
	public boolean verifyWelcomePoup() {
		
		return verifyElementPresent(welcomePopupLocator);
	}
	
	public void clickRegisterButton() {
		click(registerButtonLocator);
	}
	
	public void clickSignIn(){
		
	}
}
