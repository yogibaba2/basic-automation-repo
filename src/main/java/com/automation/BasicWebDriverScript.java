package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverScript
{
    public static void main( String[] args )
    {
        // Step 1: Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");

        // Step 2: Initialize the WebDriver instance for Chrome
        WebDriver driver = new ChromeDriver();

        try {
            // Step 3: Open the desired webpage
            driver.get("https://www.bstackdemo.com/");

            // Step 4: Retrieve and print the title of the webpage
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            // Step 5: Validate the page title
            if (pageTitle.equals("StackDemo")) {
                System.out.println("Title verified successfully!");
            } else {
                System.out.println("Title verification failed. Check the URL.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Step 6: Close the browser
            driver.quit();
        }
    }
}
