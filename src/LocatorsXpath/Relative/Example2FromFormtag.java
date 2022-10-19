package LocatorsXpath.Relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example2FromFormtag {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://accounts.google.com/ServiceLogin/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form/span/section/div/div/div/div/div/div/div/input[@id='identifierId']")).sendKeys("geetha@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
        Thread.sleep(5000);

        /*  WebElement text = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
         String output=text.getText();
        System.out.println("the text is: "+ output);
        Thread.sleep(3000);                                        Practice purpose to check usage of webelement
        text.click();    */

        driver.quit();


    }

    // //form/span/section/div/div/div/div/div/div/div/input[@id='identifierId']
}

