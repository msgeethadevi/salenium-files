package MouseSimulation;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesInsalenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.switchTo().frame("packageFrame");
        //WebElement frame= driver.findElement(By.name("packageFrame"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Action']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageListFrame");
        Thread.sleep(3000);
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
