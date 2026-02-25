package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium8_max_min {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
    }
}
