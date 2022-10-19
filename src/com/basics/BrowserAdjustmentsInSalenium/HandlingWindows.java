package com.basics.BrowserAdjustmentsInSalenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver.get("https://www.google.com/");
        String baseWindow = driver.getWindowHandle();
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.switchTo().window(baseWindow);
        Thread.sleep(3000);
        driver.quit();
    }
}
