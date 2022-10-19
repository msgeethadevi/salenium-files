package com.basics.TestNG.Assignments;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrangeDependencyCreation {

    private static WebDriver driver;

    @Test
    public void openOrangeBrowser() throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "openOrangeBrowser")
    public void logInToOrange() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods ="logInToOrange" )
    public void tearDown(){
        driver.quit();
    }


}
