package excelExportAndFileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Myobjrd {
	
	public Properties readobj() {
		Properties pr=new Properties();
		try {
		FileInputStream FIS =new FileInputStream("C:\\Users\\VipinMishra\\e-workspace\\Nmaven2\\src\\test\\java\\objects\\Myobj.properties");
		
			pr.load(FIS);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pr;
		
	}

}
