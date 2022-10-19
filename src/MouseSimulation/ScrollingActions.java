package MouseSimulation;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollingActions {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.tutorialspoint.com/index.htm");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        WebElement sDE = driver.findElement(By.xpath("//span[@class='text-green'][1]"));
        String sDT =sDE.getText();
        System.out.println("The Scroll Down text is:"+ sDT);
        action.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(2000);

        WebElement sUE= driver.findElement(By.xpath("//a[@href='https://www.tutorialspoint.com/codingground.htm']"));
        String sUT = sUE.getText();
        System.out.println(" The Scroll up text is" + sUT);
        Thread.sleep(2000);
        driver.quit();





    }
}
