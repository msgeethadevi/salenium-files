package LocatorsXpath.Absolute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AbsoluteXpath {

    // Absolute xpath is the way to find or laocate the webelement  by root of the webpage.
    //Absolute xpath : Starting with single forward slash
    // we go on till the current node
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://saucedemo.com");
        driver.findElement(By.xpath("(/html/body/div/div/div[2]/div[1]/div[1]/div/form/div/input)[1]")).sendKeys("standard_user");
        driver.findElement(By.xpath("(/html/body/div/div/div[2]/div[1]/div[1]/div/form/div/input)[2]")).sendKeys("secret_sauce");

    }
}
