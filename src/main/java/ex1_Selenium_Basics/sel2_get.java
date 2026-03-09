package ex1_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class sel2_get {
    public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}/**

 //Selenium 3 -
 //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

 selenum 4- above getproperty() not use, selenium browser automaticaly envoke driver

 FirefoxDriver driver = new FirefoxDriver();
 // new FirefoxDriver(); - This START of the Selenium Session
 // Sesion - Fresh copy of browser is started!.
 // POST request to the Server - Firefox Driver.

 driver.get("https://vwo.com");
 // Commmand number 2 - POST request to give to the driver to navigate to a URL


 **/
