package maven2.Nmaven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {
public WebDriver driver;
  @BeforeTest
  @Parameters("browser")
  public void setbrowser(String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();  
	  }
	  else if (browser.equalsIgnoreCase("firefox")) {
		  WebDriverManager.firefoxdriver().setup(); 
		  driver = new FirefoxDriver();
	  }
  }
  
  @Test
  public void execute()
  {
	 driver.get("https://www.lambdatest.com/pricing");
	 driver.getTitle();
  }
}
