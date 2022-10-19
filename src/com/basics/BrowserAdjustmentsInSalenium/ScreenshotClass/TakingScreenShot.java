package com.basics.BrowserAdjustmentsInSalenium.ScreenshotClass;

import com.basics.common.SetUpForSelenium;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver =new SetUpForSelenium().chromeSetup();
        driver.get("https://www.google.com");


        //Method1 : taking screenshot of browser
        File screenshotofwebpage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotofwebpage, new File("./src/com/basics/BrowserAdjustmentsInSalenium/ScreenshotClass/screenshotofwebpage.png"));
        Thread.sleep(2000);


        //Method 2 : taking screenshot of webelement
        WebElement google=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        File screenshotofgooglewebelement=google.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotofgooglewebelement, new File("./src/com/basics/BrowserAdjustmentsInSalenium/ScreenshotClass/screenshotofgooglewebelement.png"));
        Thread.sleep(2000);

        driver.quit();


    }
}
