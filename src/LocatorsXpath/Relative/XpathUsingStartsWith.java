package LocatorsXpath.Relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathUsingStartsWith {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[starts-with(@id,'login-button')]")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
