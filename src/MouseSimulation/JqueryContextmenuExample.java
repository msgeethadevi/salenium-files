package MouseSimulation;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class JqueryContextmenuExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

         WebElement rightclick=driver.findElement(By.linkText("right click me"));
        Actions RCaction = new Actions(driver);
        RCaction.contextClick(rightclick).perform();
        Thread.sleep(2000);
        WebElement quit = driver.findElement(By.linkText("Quit"));
        RCaction.click(quit).perform();
        Alert alertOnQuit = driver.switchTo().alert();
        Thread.sleep(2000);
        String alertText = alertOnQuit.getText();
        System.out.println(" the text is :"+ alertText);
        alertOnQuit.accept();
        Thread.sleep(2000);
        driver.quit();









    }
}
