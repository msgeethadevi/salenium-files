package com.basics.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.basics.common.SetUpForSelenium;
public class DependencyCreation {
    private static WebDriver driver;

    @Test
    void openBrowser() throws InterruptedException {
        driver=new SetUpForSelenium().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = {"openBrowser"})
    void loginToApplication(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test(dependsOnMethods = {"loginToApplication"})
    void quitTheApplication() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
