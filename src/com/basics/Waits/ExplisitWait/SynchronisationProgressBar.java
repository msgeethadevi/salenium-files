package com.basics.Waits.ExplisitWait;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SynchronisationProgressBar {
    private  static WebDriver driver;

    public static void main(String[] args) {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://demoqa.com/progress-bar");

        driver.findElement(By.id("startStopButton")).click();

        WebElement progressbar = driver.findElement(By.xpath("//div[@role='progressbar' and text()='100%']"));

        // Explicit wait
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(progressbar));

        String progressPercentage = driver.findElement(By.xpath("//div[@role='progressbar']")).getText();
        System.out.println("percentage is:"+progressPercentage);

        driver.quit();
    }
}
