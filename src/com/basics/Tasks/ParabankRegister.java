package com.basics.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Using X-path

public class ParabankRegister {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("geetha");
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("devi");
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("rajajinagar");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("karnataka");
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("560098");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("8888888888");
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1111");
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("geetha");
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("12345678");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();



    }
}
