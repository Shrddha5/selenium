package ex10_input_select_assert_radio;

import Ex8_waithelper.ec8_waithelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class checkbox_radio extends commonToAll{
    @Test
    public void test_select() {

        // Select BOX - HTMLs
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        //select.selectByVisibleText("Option 2");

        select.selectByIndex(1);

        ec8_waithelper WaitHelpers = new ec8_waithelper();
        WaitHelpers.waitJVM(4000);
        closeBrowser(driver);





    }


}
