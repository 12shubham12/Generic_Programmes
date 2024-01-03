//creating the read excel class and methods and calling the constructor from Main_Test Class

package Reading_writing_Excel;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelDataProvider {

    XSSFWorkbook wb;
    public ExcelDataProvider(){
        File src = new File("./TestData/Data.xlsx");
        try{
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        }
        catch(Exception e){
            System.out.println("Unable to read Excel File "+e.getMessage());
        }
    }
    //method to read the data from the excel
    public String getUserName(String sheetName,int row,int column){
    return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
    }
    public String getPassword(String sheetName,int row,int column){
    return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
    }
    public double getRCH_NumericDetail(String sheetName,int row,int column){
        return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
    }
}
