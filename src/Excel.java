import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {
	
	public static void main (String [] args) throws IOException {
		
		
		String filePath = System.getProperty("user.dir")+"\\src\\Test.xlsx";
		
		FileInputStream fs = new FileInputStream(filePath);
		
		
		XSSFWorkbook  workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
	/*Row row = sheet.getRow(0);
	
	Cell cell =row.getCell(0);
	
	
		System.out.println(sheet.getRow(2).getCell(2));*/
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=0; i<rowCount+1; i++) {
			
			Row row = sheet.getRow(i);
			
			for(int j=0; j< row.getLastCellNum(); j++) {
				
				System.out.print(row.getCell(j).getStringCellValue()+"-");
				
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
