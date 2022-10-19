package com.basics.BrowserAdjustmentsInSalenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        // Method 1
        int height=driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        System.out.println(" Height of the window is : " + height);
        System.out.println(" Width of the window is : " + width);

        // Method 2
        Dimension size = driver.manage().window().getSize();
        System.out.println("Height using dimension class :" + size.getHeight());
        System.out.println("Width using dimension class :" + size.getWidth());

        driver.manage().window().setSize(new Dimension(700,500));
        // Taking variable class
        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();
        System.out.println("X position : "+ x+ "Y position "+y);

        // Taking point class
        Point position = driver.manage().window().getPosition();
        System.out.println("X position : "+ position.getX()+ "Y position "+position.getY());

        driver.manage().window().setPosition(new Point(500 , 100));


    }

}
