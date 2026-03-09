package ex1_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium12_navigation_get_navigate {
    @Test
    public void test_Selenium01() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com"); // 95%

        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL


        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}// diff between get() and navigateto() both are use for open url window, byt navigate have method
// refresh(), forward(), backword()