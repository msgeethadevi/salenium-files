package KeyBoardActionsInSalenium;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class EnterKey {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();

    }

}
