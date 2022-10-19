package KeyBoardActionsInSalenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ReleasingTheKeys {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Actions actions = new Actions(driver);
        WebElement searchbox = driver.findElement(By.name("q"));
        actions.keyDown(Keys.SHIFT).sendKeys(searchbox,"selenium") // keysDown is for pressing the key
         .keyUp(Keys.SHIFT).sendKeys(searchbox,"selenium").perform();//Keyup is for releasing the key
        Thread.sleep(3000);
        searchbox.clear();
        Thread.sleep(3000);
        System.out.println("Done");
        driver.quit();




    }

}
