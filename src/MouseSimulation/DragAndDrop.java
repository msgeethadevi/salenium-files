package MouseSimulation;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

   // Drag & drop

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement draggable= driver.findElement(By.id("draggable"));
        WebElement droppable= driver.findElement(By.id("droppable"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(draggable, droppable);
        builder.build().perform();
        Thread.sleep(3000);

    }

}
