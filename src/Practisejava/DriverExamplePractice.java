package Practisejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverExamplePractice {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","driver/geckodriver64.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println("The current url is : " + url);
        String title = driver.getTitle();
        System.out.println("The title is ; " + title);
        driver.close();
    }
}
