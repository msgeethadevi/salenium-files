package FrameWork.OrangeHRM.datadriven;

import com.basics.common.SetUpForSelenium;
import com.beust.ah.A;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class AutomatingOrangeHRM {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new SetUpForSelenium().chromeSetup();

        int successfulLoginCount = 0;
        int unSuccessfulLoginCount = 0;

        FileInputStream filepath = new FileInputStream("C:\\Users\\geeth\\OneDrive\\Desktop\\orange\\OrangeLogincases.xlsx");
        XSSFWorkbook workbook =new XSSFWorkbook(filepath);
        XSSFSheet sheet =workbook.getSheet("Sheet2");

        int lastrow = sheet.getLastRowNum();

        System.out.println("no of data rows is"+ (lastrow-1));

        for(int row=0; row<lastrow; row++){
            XSSFRow currentRow = sheet.getRow(row);
            String username=currentRow.getCell(0).getStringCellValue();
            String password=currentRow.getCell(1).getStringCellValue();

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.findElement(By.name("username")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
            //driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
            //driver.findElement(By.linkText("Logout")).click();

            Thread.sleep(2000);

            String ExpectedUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
            String ActualUrl = driver.getCurrentUrl();

            System.out.println("Expexted URL is :"+ ExpectedUrl);
            System.out.println("Actual URL is "+ ActualUrl);

            if (ActualUrl.equalsIgnoreCase(ExpectedUrl)){
                System.out.println("LoginSuccessfull for user"+row);
                System.out.println();

                successfulLoginCount=successfulLoginCount+1;

                driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
                driver.findElement(By.linkText("Logout")).click();

            }

            else{
                System.out.println("LoginUnSuccessfull for user"+row);
                System.out.println();
                unSuccessfulLoginCount=unSuccessfulLoginCount+1;
            }
        }

        System.out.println("Successful Login Count: " + successfulLoginCount);
        System.out.println("Unsuccessful Login Count: " + unSuccessfulLoginCount);
        driver.quit();
        workbook.close();
        filepath.close();

    }
}
