package com.basics.PageObjectModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchWebpage {
    static WebElement element = null;
    public static WebElement searchbox(WebDriver driver){
        element = driver.findElement(By.name("q"));
        return element;
    }

    public static WebElement searchbutton(WebDriver driver) {
        element = driver.findElement(By.name("btnK"));
        return element;
    }

}
