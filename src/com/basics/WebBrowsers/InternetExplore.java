package com.basics.WebBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplore {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        System.out.println("the current url is : " + url);
        String title = driver.getTitle();
        System.out.println("The title of the page is :" + title);
    }
}
