package com.basics.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsInSalenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        /** Implicit wait
         *This is provided because some web elements take different load time
         * This is the maximum time limit selenium will wait to find that element
         * If it is found early, it will go to the next action & not wait
         * By default the wait time is set to zero
         * Once it is set it will be valid for entire session till lifetime
         * The polling frequency /time is 500ms
         * It means that selenium will wait & search for the web element every 500ms in 10s  (user defined)
         */

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
       // driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("coders arcade", Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.linkText("")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.partialLinkText("Coders - Arcade - Educational Institute In RR Nagar")).click();
        WebElement weblink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Coders - Arcade - Educational Institute In RR Nagar")));
        weblink.click();


        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
        WebElement review =driver.findElement(By.linkText("Write a Review"));
        fluentWait.until(ExpectedConditions.visibilityOf(review));
        review.click();
        driver.quit();
        // Waits are also called as synchronization in selenium
        }
}
