package FrameWork.OrangeHRM.keyworddriven;

import FrameWork.keywordDrivenTest.ActionKeywords;
import FrameWork.keywordDrivenTest.utilityExcelFile;

import java.awt.*;
import java.io.IOException;

public class ActualExecution {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        String filePath = "C:\\Users\\geeth\\OneDrive\\Desktop\\orange\\OrangeTask.xlsx";
        ExcelFile.ExcelFilePath(filePath, "Sheet1");

        for(int i=1; i<8; i++){
            String actions= ExcelFile.getCellData(i,0);

            if (actions.equalsIgnoreCase("openBrowser")){
                MethodsForOrange.openBrowser();
            }

            else if (actions.equalsIgnoreCase("navigateToUrl")){
                MethodsForOrange.navigateToUrl();
            }

            else if (actions.equalsIgnoreCase("inputUserName")){
                MethodsForOrange.inputUserName();
            }

            else if (actions.equalsIgnoreCase("inputPassword")){
                MethodsForOrange.inputPassword();
            }

            else if (actions.equalsIgnoreCase("clickOnLogin")){
                MethodsForOrange.clickOnLogin();
            }

            else if (actions.equalsIgnoreCase("userDropDownClick")){
                MethodsForOrange.userDropDownClick();
            }

            else if (actions.equalsIgnoreCase("logOut")){
                MethodsForOrange.logOut();
            }

            System.out.println("Keyword driven test completed successfully");


        }



    }

}
