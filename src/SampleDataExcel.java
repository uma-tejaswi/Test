import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
String filePath = System.getProperty("user.dir")+"\\src\\Test.xlsx";
		
		FileInputStream fs = new FileInputStream(filePath);
		
		
		XSSFWorkbook  workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		
		Cell cell =row.getCell(0);
		
		
			System.out.println(sheet.getRow(1).getCell(2));
		
		

	}

}
