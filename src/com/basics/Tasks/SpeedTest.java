package com.basics.Tasks;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SpeedTest {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://www.speedtest.net/");

        //driver.switchTo().alert().accept();
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        System.out.println(text);
        a.accept();
        driver.findElement(By.xpath("//span[text()='Go')]")).click();
        Thread.sleep(3000);



        driver.quit();
    }
}
