package com.basics.PageObjectModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
    WebDriver driver = null;
    // this webDriver instance is null
    // when we call methods we must use a different driver instance
    //from diffrent tests
    // So we need constructor

    public GoogleSearchPageObject (WebDriver driver){

        this.driver = driver;
    }
    By searchbox = By.name("q");
    By searchbutton = By.name("btnK");

    public void setSearchbox(String text){

        driver.findElement(searchbox).sendKeys(text);
    }
    public void clickSearchButton (){

        driver.findElement(searchbutton).sendKeys(Keys.ENTER);
    }
}
