package LocatorsXpath.Relative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingTextMethod {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[1]/a")).click();
        // xpath from direct copying from webpage


        driver.findElement(By.xpath("//a[text()='Gmail']")).click();
        Thread.sleep(3000);
        //driver.quit();
    }
}
