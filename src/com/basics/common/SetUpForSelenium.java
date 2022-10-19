package com.basics.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SetUpForSelenium {
    public static WebDriver driver;

    public WebDriver chromeSetup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        return driver;
    }

}
