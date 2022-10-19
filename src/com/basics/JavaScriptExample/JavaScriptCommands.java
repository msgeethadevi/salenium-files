package com.basics.JavaScriptExample;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class JavaScriptCommands {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.google.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement searchbox = driver.findElement(By.name("q"));
        js.executeScript("arguments[0].value='selenium';",searchbox);
        WebElement button =driver.findElement(By.cssSelector(".RNmpXc"));
        js.executeScript("arguments[0].click()",button);
        js.executeScript("console.log('Hello geetha...........')");
    }
}
