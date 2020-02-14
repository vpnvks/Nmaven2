package maven2.Nmaven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_test {
  @Test
  public void f() throws InterruptedException {
	  //ChromeDriverManager.getInstance(webDriverClass)	
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\VipinMishra\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
	  driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
	  //WebElement webe=driver.findElement(By.xpath("//input[@name='bdaytime']"));
	  driver.manage().window().maximize();
	 /* webe.sendKeys("26102019");
	  webe.sendKeys(Keys.TAB);
	  webe.sendKeys("1254PM");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();*/
	  driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[3][@role='button']")).click();
  }
}
