package week3.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnXcellSheet {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wbook	=new XSSFWorkbook("./Data/LearnApachePOI.xlsx");
	    XSSFSheet sheet = wbook.getSheetAt(0);
	    
	    int rowNum= sheet.getLastRowNum();
	    System.out.println(rowNum+" "+sheet.getPhysicalNumberOfRows());
	    
	    short cellNum =sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		for (int j = 1; j <=rowNum; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < cellNum; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue(); 
				System.out.println(value + " ");
			} 
			System.out.println();
		}
	    
	    
	    
		wbook.close();

	    
	}

}
