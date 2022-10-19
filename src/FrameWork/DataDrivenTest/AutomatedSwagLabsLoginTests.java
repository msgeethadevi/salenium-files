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

public class AutomatedSwagLabsLoginTests {


        private static WebDriver driver;

        public static void main(String[] args) throws IOException, InterruptedException, IOException {
            driver = new SetUpForSelenium().chromeSetup();
            int successfulLoginCount = 0;
            int unsuccessfulLoginCount = 0;
            // Setting the path of the WorkBook
            FileInputStream filePath = new FileInputStream("C:\\Users\\geeth\\OneDrive\\Desktop\\Automation jars\\Dependencies\\Data.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(filePath);
            XSSFSheet sheet = workbook.getSheet("Sheet3"); // Providing the Sheet Name
            int rowCount = sheet.getLastRowNum(); // 19
            System.out.println("No. of records in the Excel Sheet: " + rowCount);

            for (int row = 1; row <= rowCount; row++) {
                XSSFRow current_row = sheet.getRow(row);
                String User_Name = current_row.getCell(0).getStringCellValue();
                String Password = current_row.getCell(1).getStringCellValue();

                driver.get("https://www.saucedemo.com/");
                driver.findElement(By.id("user-name")).sendKeys(User_Name);
                driver.findElement(By.id("password")).sendKeys(Password);
                driver.findElement(By.id("login-button")).click();

                Thread.sleep(2000);

                String expectedUrl = "https://www.saucedemo.com/inventory.html";
                String actualUrl = driver.getCurrentUrl();

                System.out.println("Actual Url for Record: " + row + " : " + actualUrl);
                System.out.println("Expected Url for Record: " + row + " : " + expectedUrl);

                if (actualUrl.equalsIgnoreCase(expectedUrl)) {
                    System.out.println("Login Successful for Record " + row);
                    System.out.println(); // Giving a line after each output
                    successfulLoginCount = successfulLoginCount + 1;

                    driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
                    Thread.sleep(1000);
                    WebElement logOut = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
                    Actions action = new Actions(driver);
                    action.moveToElement(logOut).click().build().perform();
                    Thread.sleep(3000);
                } else {
                    System.out.println("Login Unsuccessful for Record: " + row);
                    System.out.println(); // Giving a line after each output
                    unsuccessfulLoginCount = unsuccessfulLoginCount + 1;
                }

            }
            System.out.println("Data Driven Test Completed Successfully");
            System.out.println("Successful Login Count: " + successfulLoginCount);
            System.out.println("Unsuccessful Login Count: " + unsuccessfulLoginCount);

            driver.quit();
            workbook.close();
            filePath.close();
        }
    }

