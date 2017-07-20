package com.rightstart.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rightstart.utility.TestBase;

public class EditAccountTest extends TestBase{

	WebDriver driver;
	String sBrowser="chrome";
	@BeforeMethod
	public void setUp() {
		
		
		intilizeBrowser(sBrowser);
	}
	
	@Test(description="Verify edit account functioality")
	public void tc_4() {
		
	}
	
	
	
}
