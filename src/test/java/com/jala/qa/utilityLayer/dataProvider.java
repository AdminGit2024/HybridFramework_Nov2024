package com.jala.qa.utilityLayer;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataProvider {

//	@DataProvider
	public Object[][] getDataFromExcel(String sheetname, String excelPath) throws IOException {
		 String localPath = System.getProperty("user.dir");
		 FileInputStream path = new FileInputStream(localPath+excelPath);
		 XSSFWorkbook action = new XSSFWorkbook(path);
		 XSSFSheet sheetNumber = action.getSheet(sheetname);
		 
		 
		 Object getData[][] = new Object[sheetNumber.getLastRowNum()][sheetNumber.getRow(0).getLastCellNum()];
		 
		    for(int i =0; i<sheetNumber.getLastRowNum();i++) {
			 
			 for(int c=0; c<sheetNumber.getRow(0).getLastCellNum();c++) {
				 
				 getData[i][c] = sheetNumber.getRow(i+1).getCell(c).toString();
			 }
			 
			
		 }
			return getData;
	}
}
