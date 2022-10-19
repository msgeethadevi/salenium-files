package com.basics.PageObjectModel.tests;

import com.basics.PageObjectModel.Pages.GoogleSearchWebpage;
import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchWebpageTest {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver= new SetUpForSelenium().chromeSetup();
        driver.get("https://www.google.com");
        GoogleSearchWebpage.searchbox(driver).sendKeys("selenium");
        GoogleSearchWebpage.searchbutton(driver).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.quit();

    }
}
