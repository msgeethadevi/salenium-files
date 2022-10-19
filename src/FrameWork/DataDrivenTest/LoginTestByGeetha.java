package FrameWork.DataDrivenTest;

import com.basics.common.SetUpForSelenium;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginTestByGeetha {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        driver = new SetUpForSelenium().chromeSetup();

        int successfulLoginCount = 0;
        int unSuccessfulLoginCount = 0;
        FileInputStream filePath = new FileInputStream("C:\\Users\\geeth\\OneDrive\\Desktop\\Automation jars\\Dependencies\\Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        XSSFSheet sheet = workbook.getSheet("Sheet3");  //providing Sheet name
        int rowCount = sheet.getLastRowNum(); // 19
        System.out.println("Number of records in excel sheet "+ (rowCount-1));

        for (int row=1; row<rowCount; row++){
            XSSFRow current_row = sheet.getRow(row);
            String User_Name = current_row.getCell(0).getStringCellValue();
            String Password = current_row.getCell(1).getStringCellValue();

            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys(User_Name);
            driver.findElement(By.id("password")).sendKeys(Password);
            driver.findElement(By.id("login-button")).click();

            Thread.sleep(2000);

            String expectedUrl = "https://www.saucedemo.com/inventory.html";
            String actualUrl =driver.getCurrentUrl();

            System.out.println("actual url for record:" +row+ " : "+ actualUrl);
            System.out.println("Expected url for record:" +row+ " : "+ expectedUrl);

            if(actualUrl.equalsIgnoreCase(expectedUrl)){
                System.out.println("Login succesfull for record : "+ row);
                System.out.println();// shifting to next line

                successfulLoginCount = successfulLoginCount+1;

                driver.findElement(By.xpath("button[@id='react-burger-menu-btn']")).click();
                Thread.sleep(2000);

                WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
                Actions action = new Actions(driver);
                action.moveToElement(logout).click().build().perform();
                Thread.sleep(3000);
            }
            else {
                System.out.println("Login Unsuccessful for Record: " + row);
                System.out.println(); // Giving a line after each output
                unSuccessfulLoginCount = unSuccessfulLoginCount+1;
            }

        }
        System.out.println("Data Driven Test Completed Successfully");
        System.out.println("Successful Login Count: " + successfulLoginCount);
        System.out.println("Unsuccessful Login Count: " + unSuccessfulLoginCount);

        driver.quit();
        workbook.close();
        filePath.close();
    }

}





