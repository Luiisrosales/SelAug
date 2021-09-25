package week6.day1;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/tc001.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Rows: " + lastRowNum);
		
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("including Header: " + physicalNumberOfRows);
		
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Colums: " + lastCellNum );
		
		for(int i = 1; i<=lastRowNum  ; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
		
		wbook.close();
		
		
		
		
	}
	
	
	

}
