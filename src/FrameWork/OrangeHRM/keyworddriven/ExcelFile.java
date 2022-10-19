package FrameWork.OrangeHRM.keyworddriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFile {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void ExcelFilePath(String path, String sheetName) throws IOException {
        FileInputStream fis=new FileInputStream(path);
        workbook=new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
    }

    public static String getCellData(int row, int column){
        Cell cell = sheet.getRow(row).getCell(column);
        String cellData= cell.getStringCellValue();
        return cellData;
    }

}
