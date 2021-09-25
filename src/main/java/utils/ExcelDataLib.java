package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataLib {
	
	public static String[][] getData(String fileName) throws IOException{
		XSSFWorkbook wbook = new XSSFWorkbook("./data/" + fileName + ".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Rows: " + lastRowNum);
		
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("including Header: " + physicalNumberOfRows);
		
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Colums: " + lastCellNum );
		String [][] data = new String[lastRowNum][lastCellNum];
		for(int i = 1; i<=lastRowNum  ; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
			}
		}
		
		wbook.close();
		return data;

}
}
