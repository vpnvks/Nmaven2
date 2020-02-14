package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public Sheet excelrd() {
				
			//
			File file =new File("C:\\Users\\VipinMishra\\Selenium\\Java\\reading_excel.xlsx");
			Workbook wkbk=null;
			try {
				FileInputStream FIS =new FileInputStream(file); // No poi so far
				 wkbk=new XSSFWorkbook(FIS);
				
			} 
			
			catch (FileNotFoundException e) {
				System.out.println("excel file not found");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("workbook not present");
			}
		
		Sheet Exlst=wkbk.getSheet("S_list");
		
		return Exlst;
		
	}
}
