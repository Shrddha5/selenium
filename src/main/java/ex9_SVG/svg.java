package ex9_SVG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class svg {
    @Test
    public void verifyStatesInSVG() {
        ChromeDriver driver = new ChromeDriver();
        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
    }
}
