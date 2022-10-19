package MouseSimulation;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPuzzle {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement boxA = driver.findElement(By.xpath("//li[@name='A']"));
        WebElement boxB = driver.findElement(By.xpath("//li[@name='B']"));

        Actions builder = new Actions(driver);

        builder.moveToElement(boxA);
        builder.clickAndHold();
        Thread.sleep(5000);
        builder.moveToElement(boxB);
        builder.build().perform();
        Thread.sleep(5000);
        //driver.quit();
        System.out.println("Task is completed !!!!");
        driver.quit();

    }

}
