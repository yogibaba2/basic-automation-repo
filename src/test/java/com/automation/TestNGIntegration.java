package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGIntegration {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void verifyPageTitle() {
		driver.get("https://www.bstackdemo.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "StackDemo", "Title does not match!");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
