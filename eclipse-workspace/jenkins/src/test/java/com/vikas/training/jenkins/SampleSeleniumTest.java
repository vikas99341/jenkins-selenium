package com.vikas.training.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleSeleniumTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuvikas\\Downloads\\soft\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
	}
	
	@Test
	public void validateGoogleId() throws Exception {
		System.out.println("Opening Browser");
		driver.get("http://www.google.com");
		System.out.println("Close the browser");
		//closing the browser
		driver.close();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}

