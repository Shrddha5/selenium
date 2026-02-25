package Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium7_get {
    public static void main(String[] args) {
        ChromeDriver driver =new  ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
