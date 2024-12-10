package com.automation;

import com.automation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest(){
        driver.get("https://www.bstackdemo.com/signin");
        loginPage.enterUsername("demouser");
        loginPage.enterPassword("testingisfun99");
        loginPage.clickLogin();
        // Add assertions to verify login success
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
