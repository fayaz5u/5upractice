package testwrkmvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testngmvn {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");
		
		WebDriver dri = new ChromeDriver();
		
		dri.get("https://www.facebook.com/");
		
		String ti = dri.getTitle();
		System.out.println(ti);
		
		File x = new File ("C:\\Users\\LENOVO\\eclipse-workspace\\testwrkmvn\\src\\test\\java\\testwrkmvn\\details.xlsx");
		
		FileInputStream xl = new FileInputStream(x);
		
		Workbook wb = new XSSFWorkbook(xl);
				
		Sheet sh = wb.getSheet("Sheet2");
	
		Row rw = sh.getRow(0);
		
		Cell cl = rw.getCell(1);
	
		System.out.println(cl);
	}

}
