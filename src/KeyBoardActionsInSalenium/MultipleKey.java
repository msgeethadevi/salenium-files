package KeyBoardActionsInSalenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class MultipleKey {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
        Thread.sleep(2000);
        Actions builder = new Actions(driver);
        Action selectAll = builder.keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys("A").build();
        Thread.sleep(3000);
        selectAll.perform();




        Thread.sleep(2000);
        driver.quit();

    }

}
