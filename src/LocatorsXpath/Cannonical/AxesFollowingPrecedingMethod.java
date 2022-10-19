package LocatorsXpath.Cannonical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AxesFollowingPrecedingMethod {

    //This method is called Canonocal xpath or Xpath Axes
    // we can get into the links using following and preceding method by using a single tag as referance

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://ultimateqa.com/automation");
        driver.manage().window().maximize();

        String pli = driver.findElement(By.xpath("//a[text()='Learn how to automate an application that evolves over time']//preceding::li[4]")).getText();
        System.out.println("The 4th preceding list item is : " + pli);

        WebElement FLI = driver.findElement(By.xpath("//a[text()='Learn how to automate an application that evolves over time']//following::li[2]"));
        String fli = FLI.getText();
        System.out.println("The 1st following list item is : " + fli);
        FLI.click();
        //Here i am clicking on the *Interactions with simple elements* by using canonical method but not working
        // In some Websites we can only get the text of the link(list items) but we cannot access the link
        //websites will not allow to click on link, for those we use other methods to click on those links to access information

        Thread.sleep(3000);

        driver.quit();

    }

}
