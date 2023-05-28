package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

    public String readData(int rowNum,int cellNum){
        String filePath = "data.xlsx";
        try {
            Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath));
            Sheet sheet = workbook.getSheet("Sayfa1");
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(cellNum);
            return  cell.getStringCellValue();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
