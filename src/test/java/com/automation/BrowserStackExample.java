package com.automation;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;

public class BrowserStackExample {
    public static void main(String[] args) throws Exception {
        // BrowserStack credentials
        String username = "your_browserstack_username";
        String accessKey = "your_browserstack_access_key";

        // Set desired capabilities for the remote browser
        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, Object> bstackOptions = new HashMap<>();
        capabilities.setCapability("browserName", "Chrome");
        bstackOptions.put("os", "Windows");
        bstackOptions.put("osVersion", "10");
        bstackOptions.put("browserVersion", "120.0");
        bstackOptions.put("userName", username);
        bstackOptions.put("accessKey", accessKey);
        bstackOptions.put("consoleLogs", "info");
        capabilities.setCapability("bstack:options", bstackOptions);


        // Connect to BrowserStack
        WebDriver driver = new RemoteWebDriver(
                new URL("https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"),
                capabilities
        );

        // Navigate to a webpage
        driver.get("https://www.bstackdemo.com/");

        // Print the page title
        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
