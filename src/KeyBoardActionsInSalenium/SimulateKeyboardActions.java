package KeyBoardActionsInSalenium;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;

public class SimulateKeyboardActions {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("geetha");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("Devi")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("geetha@gmail.com")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("8888888888")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("12345678")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("12345678")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.ENTER).build().perform();
        WebElement doubleclick =driver.findElement(By.name("search"));
          action.doubleClick(doubleclick).perform();
        Thread.sleep(3000);






    }

}

