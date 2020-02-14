package excelExportAndFileIO;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Usingexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Uiopertn optn=new Uiopertn();
Excelread exlrd=new Excelread();
Sheet sht=exlrd.excelrd();
int Rowcnt=sht.getLastRowNum()-sht.getFirstRowNum();
for (int i=0;i<Rowcnt+1;i++) {
	Row rw=sht.getRow(i);
	for (int j=0;j<3;j++) {
		System.out.print(rw.getCell(j)+"       ");
	}
	System.out.println();
	optn.perfm(rw.getCell(0).toString());
	
}
	}

}
