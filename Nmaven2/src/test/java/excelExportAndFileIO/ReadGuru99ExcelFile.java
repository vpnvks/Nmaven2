package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadGuru99ExcelFile {
	public ReadGuru99ExcelFile() {}
	 public Sheet readExcel(String filePath,String fileName,String sheetName)  {
		    //Create a object of File class to open xlsx file
		    File file =    new File(filePath+"\\"+fileName);
		    FileInputStream inputStream;
		    Workbook guru99Workbook = null;	
			
				try {
					inputStream = new FileInputStream(file);
					 String fileExtensionName = fileName.substring(fileName.indexOf("."));
					    if(fileExtensionName.equals(".xlsx")){
					 	
							guru99Workbook = new XSSFWorkbook(inputStream);
							
							}
					        else if(fileExtensionName.equals(".xls")){
					        guru99Workbook = new HSSFWorkbook(inputStream);
					    }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
				return guru99Sheet;
			
		    } 
		    }

