package com.basics.WebBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        System.out.println("the current url is : " + url);
        String title = driver.getTitle();
        System.out.println("The title of the page is :" + title);
    }
}
