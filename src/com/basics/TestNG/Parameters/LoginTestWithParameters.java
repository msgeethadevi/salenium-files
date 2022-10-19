package com.basics.TestNG.Parameters;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestWithParameters {

    private static WebDriver driver;

    @Test
    @Parameters({"url","userName","password"})
    public void loginWithParameters(String url, String userName, String password) throws InterruptedException {
        driver= new SetUpForSelenium().chromeSetup();
        driver.get(url);
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
