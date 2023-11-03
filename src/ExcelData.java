import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		ExcelData obj = new ExcelData();
		
		String filePath = System.getProperty("user.dir")+"\\src";
		String [] data = {"Miss. Teju", "KKD", "India"};
		
		System.out.println(filePath);
		
		obj.writeExcel(filePath, "Test.xlsx", "Sheet1", data);
		
	}
	
	
	public void writeExcel (String filePath, String fileName, String sheetName, String[] data) throws IOException {
		
		
		File file = new File(filePath+"\\"+fileName);
		
		FileInputStream fs = new FileInputStream(file);
		
		
		
		Workbook wbk =null;
		
		wbk = new XSSFWorkbook(fs);
		
		Sheet sheet = wbk.getSheet(sheetName);
		
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		Row row= sheet.getRow(0);
		
		Row newRow = sheet.createRow(rowCount+1);
		
		for(int j=0; j< row.getLastCellNum(); j++) {
			
			Cell cell = newRow.createCell(j);
			
			cell.setCellValue(data[j]);
			
		}
		
		fs.close();
		
		FileOutputStream output = new FileOutputStream(file);
		
		
		wbk.write(output);
		
		output.close();
		
		
	}

}
