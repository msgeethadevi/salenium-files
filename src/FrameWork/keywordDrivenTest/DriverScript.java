package FrameWork.keywordDrivenTest;

import java.io.IOException;

public class DriverScript {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        String filePath = "Resources/Keywords.xlsx";
        utilityExcelFile.setExcelFile(filePath, "Sheet1");

        for(int i=1; i<7; i++){
            String actionKeyword = utilityExcelFile.getCellData(i,0);
            if (actionKeyword.equalsIgnoreCase("openBrowser")){
                ActionKeywords.openBrowser();
            }

            else if (actionKeyword.equalsIgnoreCase("navigateToUrl")){
                ActionKeywords.navigateToUrl();
            }

            else if (actionKeyword.equalsIgnoreCase("inputUserName")){
                ActionKeywords.inputUserName();
            }

            else if (actionKeyword.equalsIgnoreCase("inputPassword")){
                ActionKeywords.inputPassword();
            }

            else if (actionKeyword.equalsIgnoreCase("clickLogin")){
                ActionKeywords.clickLogin();
            }

            else if (actionKeyword.equalsIgnoreCase("closeBrowser")){
                ActionKeywords.closeBrowser();
            }

            System.out.println("Keyword driven test completed successfully");

        }

    }
}
