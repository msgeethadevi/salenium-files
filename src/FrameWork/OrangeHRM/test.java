package FrameWork.OrangeHRM;

import FrameWork.OrangeHRM.keyworddriven.MethodsForOrange;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        MethodsForOrange.openBrowser();
        MethodsForOrange.navigateToUrl();
        MethodsForOrange.inputUserName();
        MethodsForOrange.inputPassword();
        MethodsForOrange.clickOnLogin();
        MethodsForOrange.userDropDownClick();
        MethodsForOrange.logOut();




    }
}
