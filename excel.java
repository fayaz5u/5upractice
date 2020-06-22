package testwrkmvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.server.handler.GetAvailableLogTypesHandler;


public class excel {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\Users\\LENOVO\\eclipse-workspace\\testwrkmvn\\src\\test\\java\\testwrkmvn\\details.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		// to get particular sheet
		Sheet s = w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			System.out.println(c);
			}
			}
			}
			}
	