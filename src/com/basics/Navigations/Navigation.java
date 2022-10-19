package com.basics.Navigations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// Chrome driver

public class Navigation {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        //driver.manage().window().maximize();

        driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(1000); //hard wait

       driver.navigate().to("https://www.selenium.dev/downloads/");

        driver.navigate().to("https://www.flipkart.com");

        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();

        driver.navigate().forward();

        //driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");




        //driver.close();


    }
}
