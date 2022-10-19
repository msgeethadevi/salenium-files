package com.basics.TestNG;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWithAnnotations {
    static WebDriver driver;

    @BeforeTest
    public void testSetUp(){
        driver=new SetUpForSelenium().chromeSetup();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String expected = "https://www.saucedemo.com/inventory.html";
        String actual = driver.getCurrentUrl();

        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login Unsuccessful");
        }
    }
        @AfterTest
        public void tearDown(){
        driver.quit();
        }

    }

