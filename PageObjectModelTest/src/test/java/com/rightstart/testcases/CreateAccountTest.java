package com.rightstart.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.rightstart.objrepo.DahsBoardPageProperty;
import com.rightstart.pages.CreateAccountPage;
import com.rightstart.pages.DashBaordPage;
import com.rightstart.pages.EditAccountPage;
import com.rightstart.pages.LandingPage;
import com.rightstart.utility.TestBase;

public class CreateAccountTest extends TestBase{


	WebDriver driver;
	String sBrowser="chrome";
	LandingPage lanindgPage;
	CreateAccountPage createaccountpage;
	DashBaordPage dashboardpage;
	EditAccountPage editaccountpage;
	
	@Parameters("sBrowser")
	@BeforeMethod
	public void setUp(String sBrowser) {
		driver=intilizeBrowser(sBrowser);
		System.out.println("Driver from CreateAccount Test :::"+driver);
		enterURL("http://www.rightstart.com");
		lanindgPage=new LandingPage(driver);
		createaccountpage=new CreateAccountPage(driver);
		dashboardpage=new DashBaordPage(driver);
		editaccountpage=new EditAccountPage(driver);
	}

	@Test(description="Verify that welcome popup")
	public void tc_1() {
		Assert.assertTrue(lanindgPage.verifyWelcomePoup());	
	}
	@Test(description="Verify that application allow to create an account with valid data")
	public void tc_2() throws InterruptedException {

		lanindgPage.closeWelcomePopup();
		Thread.sleep(3000);
		lanindgPage.clickRegisterButton();
		Thread.sleep(5000);
		String firstName=RandomStringUtils.randomAlphabetic(5);
		String lastName=RandomStringUtils.randomAlphabetic(5);
		createaccountpage.enterFirstName(firstName);
		createaccountpage.enterLastName(lastName);
		String emailData=RandomStringUtils.randomAlphabetic(5)+"@mailinator.com";
		String password="Manoj@123";
		createaccountpage.enterEmail(emailData);
		createaccountpage.enterConfirmEmail(emailData);
		createaccountpage.enterPassword(password);
		createaccountpage.enterConfrimPassword(password);
		createaccountpage.clickSubmit();
		Thread.sleep(7000);
		System.out.println(dashboardpage.verifyWelcomeMessage());
		Assert.assertTrue(dashboardpage.verifyWelcomeMessage().contains(firstName));
	}

	@Test(description="Verify that application allow to edit the created account details ")
	public void tc_3() throws InterruptedException {
		Thread.sleep(3000);
		lanindgPage.closeWelcomePopup();
		Thread.sleep(3000);
		lanindgPage.clickRegisterButton();
		Thread.sleep(5000);
		String firstName=RandomStringUtils.randomAlphabetic(5);
		String lastName=RandomStringUtils.randomAlphabetic(5);
		createaccountpage.enterFirstName(firstName);
		createaccountpage.enterLastName(lastName);
		String emailData=RandomStringUtils.randomAlphabetic(5)+"@mailinator.com";
		String password="Manoj@123";
		createaccountpage.enterEmail(emailData);
		createaccountpage.enterConfirmEmail(emailData);
		createaccountpage.enterPassword(password);
		createaccountpage.enterConfrimPassword(password);
		createaccountpage.clickSubmit();
		Thread.sleep(7000);
		System.out.println(dashboardpage.verifyWelcomeMessage());
		dashboardpage.clickMyProfle();
		Thread.sleep(7000);
		String editFirstName=RandomStringUtils.randomAlphabetic(5);
		String editLastName=RandomStringUtils.randomAlphabetic(5);
		
		
		editaccountpage.editFirstName(editFirstName);
		editaccountpage.editLastName(editLastName);
		editaccountpage.clickEditSubmitButton();
		Thread.sleep(7000);
		System.out.println("Edit account "+dashboardpage.verifyWelcomeMessage());
		
		Assert.assertTrue(dashboardpage.verifyWelcomeMessage().contains(editFirstName));
	}


	@AfterMethod
	public void quiteBrowser() {
		closeBrowser();
	}

}
