package com.automation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
		driver =  new ChromeDriver();
	}
	
	@AfterSuite
	public void aftereSuite() {
		if(driver != null) {
			driver.close();
		}
	}
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
        driver.get("https://google.com");
    }
}
