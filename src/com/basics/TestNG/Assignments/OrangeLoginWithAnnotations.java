package com.basics.TestNG.Assignments;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeLoginWithAnnotations {

    static WebDriver driver;

    @BeforeTest
    public void OpenBrowser(){
        driver=new SetUpForSelenium().chromeSetup();
    }

    @Test
    public void OrangeLogin() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(2000);

        String ExpectedUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        String ActualUrl = driver.getCurrentUrl();

        if (ExpectedUrl.equalsIgnoreCase(ActualUrl)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login Unsuccessful");
        }
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
