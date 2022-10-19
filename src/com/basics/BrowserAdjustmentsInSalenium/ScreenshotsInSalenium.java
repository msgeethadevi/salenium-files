package com.basics.BrowserAdjustmentsInSalenium;

import com.basics.common.SetUpForSelenium;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenshotsInSalenium {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.google.com");
        File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot1,new File("./screenshot1.png"));
        WebElement google = driver.findElement(By.cssSelector(".lnXdpd"));
        File screenshot2 = google.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot2,new File("./screenshot2.png"));
        driver.quit();

    }
}