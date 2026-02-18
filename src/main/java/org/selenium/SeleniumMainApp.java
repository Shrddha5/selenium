package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMainApp {
    public static void main(String[] args) {
        System.out.println("Selenium Main App");
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");

        // Additional Selenium setup and code can be added here

        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com/");
    }
}
