package Project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String readExcelData(String excelPath, String sheetName, int rowNum,int colNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String excelValue = wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();
		return excelValue;
	}
	public void writeExcelData(String excelPath, String sheetName, int rowNum, int colNum, String val) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(colNum).setCellValue(val);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
	}
public String readProperty(String propPath, String keyVal) throws Throwable
{
	FileInputStream fis = new FileInputStream(propPath);
	Properties prop = new Properties();
	prop.load(fis);
	String propVal = prop.getProperty(keyVal);
	return propVal;				
}

}
