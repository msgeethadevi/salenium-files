package com.basics.PageObjectModel.tests;

import com.basics.PageObjectModel.Pages.GoogleSearchPageObject;
import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.WebDriver;

public class GSPageObjectTest {
     static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearchTest();

    }

    public static void googleSearchTest(){
        driver = new SetUpForSelenium().chromeSetup();
        GoogleSearchPageObject obj = new GoogleSearchPageObject(driver);
        driver.get("https://www.google.com");
        obj.setSearchbox("selenium");
        obj.clickSearchButton();
        driver.quit();



    }
}
