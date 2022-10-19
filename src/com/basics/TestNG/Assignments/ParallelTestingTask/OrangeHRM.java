package com.basics.TestNG.Assignments.ParallelTestingTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {

    private static WebDriver driver;

    @Test
    public void orange() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\geeth\\IdeaProjects\\Salenium_concepts\\driver\\chromedriver2.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
