package com.basics.TestNG.Assignments.ParallelTestingTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabs {
    private static WebDriver driver;

    @Test
    public void sauceDemo() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\geeth\\IdeaProjects\\Salenium_concepts\\driver\\chromedriver2.exe");

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
