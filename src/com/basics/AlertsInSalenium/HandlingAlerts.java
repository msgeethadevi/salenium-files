package com.basics.AlertsInSalenium;

import com.basics.common.SetUpForSelenium;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

public class HandlingAlerts {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //JavaScript alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert1 = driver.switchTo().alert();
        String t1 = alert1.getText();
        Thread.sleep(1000);
        System.out.println("Alert text: " + t1);
        alert1.accept();
        Thread.sleep(1000);


        if (driver.getPageSource().contains("You successfully clicked an alert"))
            System.out.println("Clicked on successfully");
        System.out.println("--------------------------------------");


        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert2= driver.switchTo().alert();
        String t2 = alert2.getText();
        System.out.println("Alert text : "+t2);
        alert2.dismiss();
        Thread.sleep(2000);

        if(driver.getPageSource().contains("You clicked: Cancel"))
            System.out.println("you dismisses alert");
        System.out.println("---------------------------------------------------------");



        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert3 = driver.switchTo().alert();
        String t3 = alert3.getText();
        System.out.println( "Alert text :"+t3);
        Thread.sleep(2000);
        alert3.sendKeys("hii i am geetha");
        Thread.sleep(2000);
        alert3.accept();


        if(driver.getPageSource().contains("You entered: hii i am geetha"))
            System.out.println("you clicked on ok ");
        System.out.println("---------------------------------------------------");

        driver.quit();

    }
}
