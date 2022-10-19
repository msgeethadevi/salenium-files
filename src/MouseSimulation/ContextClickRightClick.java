package MouseSimulation;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickRightClick {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement contextclick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(contextclick).contextClick().build().perform();
        driver.findElement(By.xpath("//span[text()='Quit']")).click();
        Thread.sleep(3000);
        Alert a =driver.switchTo().alert();
       String text= a.getText();
        System.out.println(text);
        a.accept();
        Thread.sleep(3000);
        driver.quit();







    }
}
