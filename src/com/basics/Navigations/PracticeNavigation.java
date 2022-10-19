package com.basics.Navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNavigation {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //driver.navigate().to("https:/www.flipkart.com");
        driver.navigate().to("https:/www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.findElement(By.name("email")).sendKeys("geetha@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(1000);

        driver.manage().window().minimize();
        driver.close();


    }
}
