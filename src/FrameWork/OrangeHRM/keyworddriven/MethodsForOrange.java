package FrameWork.OrangeHRM.keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsForOrange {
    public static WebDriver driver;

    public static void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void navigateToUrl(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public static void inputUserName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        Thread.sleep(2000);
    }

    public static void inputPassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        Thread.sleep(2000);
    }

    public static void clickOnLogin() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(2000);
    }

    public static void userDropDownClick() throws InterruptedException {

        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
    }

    public static void logOut() throws InterruptedException {

        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }



}
