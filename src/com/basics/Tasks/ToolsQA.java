package com.basics.Tasks;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToolsQA {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://demoqa.com/progress-bar");
        driver.findElement(By.id("startStopButton")).click();
        /*WebElement elem = driver.findElement(By.xpath("//div[@role='progressbar' and text()=100%]"));

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(elem));
        String finalText = driver.findElement(By.xpath("div[@role='progressbar']")).getText();
        System.out.println("Download percentage :" + finalText); */
    }
}
