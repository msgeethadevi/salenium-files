package com.basics.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CSS_Selector {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));


        //proper or standard method
        driver.get("https://www.google.com");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("selenium", Keys.ENTER);
        Thread.sleep(2000);

        // Css selector

        //In css selector for searching using id, we use #  (hash)
        //In css selector for searching using class, we use . (dot)

        driver.navigate().to("https://trytestingthis.netlify.app/");
        driver.findElement(By.cssSelector("#fname")).sendKeys("geetha");



    }

}


