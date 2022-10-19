package MouseSimulation;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class StoreDropDown {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://trytestingthis.netlify.app/");

        WebElement dropDown = driver.findElement(By.id("option"));
        Select select = new Select(dropDown);
        List<WebElement> alloptions  = select.getOptions();

        for (WebElement option : alloptions){
            System.out.println(option.getText());
            if(option.getText().equalsIgnoreCase("option 2"));
            option.click();
            System.out.println("success");
            driver.quit();
        }


    }

    }
