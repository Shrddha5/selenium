package ex1_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium13_NO_HTTP {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("bing.com"); // HTTPs is important. IF YOU NOT PROVIDE HTTP THAN WEB NOT OPEN
        driver.get("https://bing.com"); // HTTPs is important.
    }
}
