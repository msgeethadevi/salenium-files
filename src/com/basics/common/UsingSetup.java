package com.basics.common;

import org.openqa.selenium.WebDriver;

public class UsingSetup {
    private static WebDriver driver;

    public static void main(String[] args) {
    driver = new SetUpForSelenium().chromeSetup();
    driver.get("https://www.google.com");
    }
}
