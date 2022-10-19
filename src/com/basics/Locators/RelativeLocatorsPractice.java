package com.basics.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocatorsPractice {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://saucedemo.com");

        /**  Relative Locators
         * above
         * below
         * toLeftOf
         *toRightOf
         * near
         */
        WebElement loginbutton= driver.findElement(By.id("login-button"));
        driver.findElement(RelativeLocator.with(By.name("password")).above(loginbutton)).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.quit();


    }
}
