package com.basics.TestNG;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestWithoutAnnotaions {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver=new SetUpForSelenium().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String expected="https://www.saucedemo.com/inventory.html";
        String actual =driver.getCurrentUrl();

        if(actual.equalsIgnoreCase(expected)){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login Unsuccessful");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
