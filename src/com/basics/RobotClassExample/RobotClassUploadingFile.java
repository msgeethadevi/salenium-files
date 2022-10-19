package com.basics.RobotClassExample;

import com.basics.common.SetUpForSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotClassUploadingFile {
    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new SetUpForSelenium().chromeSetup();
        driver.get("https://resume.naukri.com/resume-quality-score");
        driver.findElement(By.xpath("//span[@class='browse']")).click();

            //create a object of the robot class
        //Abstract window toolkit-- AWT fullform
        Robot robot = new Robot();

        //Storing the path of the file to be uploaded
        //By using the string selection class

        StringSelection filePath = new StringSelection("C:\\Users\\geeth\\OneDrive\\Desktop\\GeethaDevi CV.docx");

        //copying the path of the document into clipboard using the toolkit class

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        // pasting the path using cntrl+ v for pasting the document into the address bar

        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);


        //Releasing the used keys in reverse order
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);

        //press and release the enter key
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //Giving time to calculate percentage og resume
        Thread.sleep(120000);

        System.out.println("updated Successfully");

        driver.quit();



    }

}

