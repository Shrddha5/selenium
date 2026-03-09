package ex1_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

public class Selenium11_Driver_change {
    public static void main(String[] args) {

        WebDriver driver1 = new ChromeDriver(); // we can change driver cro,e to firefox
        driver1 = new FirefoxDriver();  //we can change driver cro,e to firefox

        Integer [] a = new Integer[3];
        a[0] = 12;
        a[0] = 112;
        a[0] = 122;
        System.out.println(a);

        ArrayList a1 = new ArrayList();

        a1.add(23);
        a1.add(34); //
        System.out.println(a1);
        System.out.println(a1.toString());


    }
}
