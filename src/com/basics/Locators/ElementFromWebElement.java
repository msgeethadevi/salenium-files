package com.basics.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementFromWebElement {
    //Tagname locator
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://www.google.com");

        //By creating web element object form we get into the search frame,
        // inside frame we have search box.
        // here tagname is form, we create object for form tag and
        // using this we again find the web element for search box by By-name locator

        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
        Thread.sleep(1000);
        driver.quit();

    }
}
