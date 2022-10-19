package com.basics.BrowserAdjustmentsInSalenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMangement {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            Thread.sleep(2000);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.manage().window().minimize();
            Thread.sleep(2000);
            driver.manage().window().fullscreen();
            Thread.sleep(2000);
            driver.close();



    }


}
