package com.basics.Tasks;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class MyStoretask {
    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver =new SetUpForSelenium().chromeSetup();

        driver.get("http://automationpractice.com/index.php");
       driver.findElement(By.xpath("//nav/div/a[@href='http://automationpractice.com/index.php?controller=my-account']")).click();
       driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("geetha1@gmail.com");
       driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
       driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
       driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Geetha");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("Devi")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("geetha@gmail.com")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("12345678")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2)).build().perform();

        WebElement dropdowndays = driver.findElement(By.name("days"));
        Select days=new Select(dropdowndays);
        days.selectByIndex(8);

        action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2)).build().perform();


        WebElement dropdownmonth = driver.findElement(By.id("months"));
        Select months=new Select(dropdownmonth);
        months.selectByValue("December");

        action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2)).build().perform();

        WebElement dropdownyear = driver.findElement(By.id("years"));
        Select years=new Select(dropdownyear);
        years.selectByValue("1995");





                action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                /*.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))*/
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("geetha")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("Devi")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("abc")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("xyz")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("xyz1")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("xyz2")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("111111")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("no information")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("9999999999")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("xyz")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5000);










    }
}
