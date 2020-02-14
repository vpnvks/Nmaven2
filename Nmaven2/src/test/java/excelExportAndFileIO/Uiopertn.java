package excelExportAndFileIO;

import java.util.Properties;

public class Uiopertn {
public void perfm(String name) {
	Myobjrd pro=new Myobjrd();
	Properties pr=pro.readobj();
	if(name.equalsIgnoreCase("ravi")) {
		System.out.println("hello sir this notebook belongs to ravi and his"+pr.getProperty("ravi"));
	}
	else if(name.equalsIgnoreCase("shivam")){
		System.out.println("hello sir this notebook belongs to shivam and his"+pr.getProperty("shivam"));	
	}
	else {
		System.out.println("hello sir this notebook belongs to someone else and"+pr.getProperty("other"));
	}
}
}
