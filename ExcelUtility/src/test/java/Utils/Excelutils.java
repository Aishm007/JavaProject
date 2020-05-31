package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	/*---- For .xlsx files---- */
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	/*---- For .xlsx files---- */
	static HSSFWorkbook workbook1;
	static HSSFSheet sheet1;

	public Excelutils(String excelPath, String sheetName) throws IOException {
		
		/*----- For .xlsx files---- */
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet("sheetName");
		 
		 /* --- For .xlsx files---- */
		 InputStream file = new FileInputStream(excelPath);
		 workbook1 = new HSSFWorkbook(new POIFSFileSystem(file));
		 sheet1 = workbook1.getSheet(sheetName);
		
	}
	
	/* function to get the number of rows from the excel */
	
	public static void getRowCount() {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("number of Rows: " +rowCount);
		
	}
	
/* function to get the number of columns from the excel */
	
	public static void getCellData(int getRowNum, int getColNum) throws IOException {
		
		
		DataFormatter dataformatter= new DataFormatter();
		Object obj = dataformatter.formatCellValue(sheet.getRow(getRowNum).getCell(getColNum));
		System.out.println("Value is : "+ obj);
	}
}
