package javaadvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdrivercln {

	public WebDriver cloneit() {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\VipinMishra\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		return driver;
		
	}

	}
