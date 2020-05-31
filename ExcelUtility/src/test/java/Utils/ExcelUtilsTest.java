package Utils;

import java.io.IOException;

public class ExcelUtilsTest {
	
	public static void main(String[] args) throws IOException {
		
		String excelPath= "./data/TestData.xlsx";
		String sheetName = "sheet1";
		
		String excelPathsheet= "./data/TestData.xlx";
		String sheetNamesh = "sheet1";
		
		Excelutils excelUtil = new Excelutils(excelPath, sheetName);
		
		/* Calling the methods for Rows and Cell Data */
		excelUtil.getRowCount();
		excelUtil.getCellData(1,0);
		excelUtil.getCellData(1,1);
		excelUtil.getCellData(1,2);
		excelUtil.getCellData(2,0);
		excelUtil.getCellData(2,1);
		excelUtil.getCellData(2,2);
		
		
	}

}
