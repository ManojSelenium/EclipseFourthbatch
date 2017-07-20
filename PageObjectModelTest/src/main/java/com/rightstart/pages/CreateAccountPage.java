package com.rightstart.pages;

import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.CreateAccountPageProeprty;
import com.rightstart.utility.WebElements;

public class CreateAccountPage extends WebElements implements CreateAccountPageProeprty{

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	public void enterFirstName(String testData) {
		enterText(firstNameLocator, testData);
	}
	public void enterLastName(String testData) {
		enterText(lastNameLocator, testData);
	}
	public void enterEmail(String testData) {
		enterText(emailLocator, testData);
	}
	public void enterConfirmEmail(String testData) {
		enterText(confrimEmailLocator, testData);
	}
	public void enterPassword(String testData) {
		enterText(passwordLocator, testData);
	}
	public void enterConfrimPassword(String testData) {
		enterText(confirmPasswordLocator, testData);
	}

	public void clickSubmit(){
		click(submitButtonLocator);
	}

}


