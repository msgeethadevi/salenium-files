package com.basics.Tasks;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Swaglabs {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}

