package maven2.Nmaven2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker2_advance {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/datepicker/");
	  driver.manage().window().maximize();
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	  //driver.findElement(By.xpath("//a[contains(text(),'14')]")).click();
	  List<WebElement> table=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	  int tablecoun=table.size();
	  System.out.println("total no of element="+tablecoun);
	  for (int a=0;a<tablecoun;a++)
	  {
		String date1=table.get(a).getText();
		
		//System.out.println("webelement is="+date1);
		//Thread.sleep(20);
		if (date1.equals("29"))
		{
		WebElement click1=table.get(a);
		System.out.println("webelement is="+click1);
		click1.click();
		break;
		}
	  }
  }
}
