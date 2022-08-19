package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
	public Map<String, String> setdata(String FileName, String Sheetname) throws IOException {
		
		Map<String ,String > map = new HashMap<String ,String >();
		FileInputStream fis = new FileInputStream ("C:\\Users\\HP\\Downloads\\datadrivennew\\"+FileName);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		Sheet  sheet =	workbook.getSheet(Sheetname);
		
		Row r1= sheet.getRow(0);
		System.out.println(r1);
		Row r2= sheet.getRow(1);
		System.out.println(r2);
		int last = r1.getLastCellNum();
		
		for (int i =0; i<last;i++) {
			
			
			
			map.put(r1.getCell(i).getStringCellValue(), r2.getCell(i).getStringCellValue());
			
		}
		return map;
	}
	
	
	
	
	
	

}
