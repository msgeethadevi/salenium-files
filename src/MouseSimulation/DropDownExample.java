package MouseSimulation;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class DropDownExample {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://trytestingthis.netlify.app/");

        //Selecting
         WebElement dropDown = driver.findElement(By.id("option"));
        Select select = new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByValue("option 2");
        Thread.sleep(2000);
        select.selectByVisibleText("Option 3");
        Thread.sleep(2000);

        // deselecting
        WebElement dropDown1 = driver.findElement(By.id("owc"));
        Select select1 = new Select(dropDown1);
        Thread.sleep(2000);
        select1.selectByIndex(1);
        Thread.sleep(2000);
        select1.selectByValue("option 2");
        Thread.sleep(2000);
        select1.selectByVisibleText("Option 3");
        Thread.sleep(2000);
        select1.deselectByVisibleText("Option 3");
        System.out.println("Task completed");
        driver.quit();



    }
}
