package com.rightstart.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	
	public WebDriver driver;
	
	public WebDriver intilizeBrowser(String sBrowser) {
		if(sBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\JARS\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(sBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\JARS\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		System.out.println("Driver From test base ::: "+driver);
		return driver;
	}
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
}
