package javaadvance;

import org.openqa.selenium.WebDriver;

public class Opensite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Webdrivercln wd=new Webdrivercln();
WebDriver wd1=wd.cloneit();
wd1.get("https://www.guru99.com/all-about-excel-in-selenium-poi-jxl.html");
	}

}
