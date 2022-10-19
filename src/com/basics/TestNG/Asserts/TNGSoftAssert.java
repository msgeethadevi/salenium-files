package com.basics.TestNG.Asserts;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNGSoftAssert {
    SoftAssert softAssert = new SoftAssert();   // Creating an object for soft assert
    //It will make the testcases to execute all the tests after the soft assert and won't fail
    //This implementation is wrong
    private static WebDriver driver;
    @Test
    public void sampleLoginTest() throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        softAssert.assertEquals(title,"Swag Lab", "Title Mismatch");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        softAssert.assertEquals(true,false);

        Thread.sleep(2000);
        driver.quit();

        //here all the asserts are checked and it will give a failed report if all the tests are not passed
        softAssert.assertAll();


    }
}
