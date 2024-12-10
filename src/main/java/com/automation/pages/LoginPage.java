package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Locators
    By usernameField = By.id("react-select-2-input");
    By passwordField = By.id("react-select-3-input");
    By loginButton = By.id("login-btn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username + Keys.ENTER);

    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password + Keys.ENTER);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
