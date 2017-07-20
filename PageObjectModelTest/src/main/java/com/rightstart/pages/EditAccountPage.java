package com.rightstart.pages;

import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.EditAccountPageProperty;
import com.rightstart.utility.WebElements;

public class EditAccountPage extends WebElements implements EditAccountPageProperty{

	public EditAccountPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	public void editFirstName(String testData) {
		clearTextBox(editFirstName);
		enterText(editFirstName, testData);
	}
	public void editLastName(String testData) {
		clearTextBox(editLastName);
		enterText(editLastName, testData);
	}
	
	public void clickEditSubmitButton() {
		click(editsubmitButton);
	}
}
