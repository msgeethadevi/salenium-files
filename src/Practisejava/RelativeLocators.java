package Practisejava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));

        driver.get("https://anydesk.com/");
        //driver.findElement(By.linkText("navbarSupportedContent"));
        //WebElement downloads = driver.findElement(By.linkText("Downloads"));
        WebElement download = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[3]/p"));

        //downloads.click();
        driver.findElement(RelativeLocator.with(By.xpath("//*[@id='navbarSupportedContent']/div/a[1]/p")).toLeftOf(download)).click();
        Thread.sleep(3000);
        driver.quit();





    }
}
