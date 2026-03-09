package ex1_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium10_Testng {
    @Test
    public void test_Selenium_app_vwo() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        driver.quit();


    }
}