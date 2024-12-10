package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManagerExample {
    public static void main(String[] args) {

        // No need to set up the ChromeDriver path explicitly
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a webpage
            driver.get("https://www.bstackdemo.com/");

            // Print the page title
            System.out.println("Page Title: " + driver.getTitle());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
