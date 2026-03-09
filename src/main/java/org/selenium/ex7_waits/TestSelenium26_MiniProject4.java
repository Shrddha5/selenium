package org.selenium.ex7_waits;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.commonToAll;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium26_MiniProject4 extends commonToAll {

    @Description("Verify makemytrip opens with modal")
    @Test
    public void testCloseModal() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        // Explicit wait for visibility of the close modal button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement closePopUp = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-cy=\"closeModal\"]"))
        );

        closePopUp.click();
        driver.quit();
    }

    // Optional: Helper method for reusability
    public WebElement waitForVisibility(WebDriver driver, int timeoutInSeconds, String xpathLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }

}