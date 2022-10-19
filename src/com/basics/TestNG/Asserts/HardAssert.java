package com.basics.TestNG.Asserts;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

    private static WebDriver driver;

    @Test
    void openApplication() throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Swag Lab", "Title Mismatch");
    }

    @Test(dependsOnMethods = {"openApplication"})
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
