package maven2.Nmaven2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_pick2Test {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com");//"https://demos.telerik.com/kendo-ui/datetimepicker/index");
	  WebElement element = driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']"));
	  String dateval = "Wed, Oct 30 2019";
	  setdate(driver,element,dateval);
	  /*driver.manage().window().maximize();
	  driver.findElement(By.xpath("//span[@unselectable='on' and @class='k-icon k-i-calendar']")).click();
	  driver.findElement(By.xpath("//input[@aria-owns='datetimepicker_dateview]")).click();*/
  }
  public void setdate(WebDriver driver,WebElement element, String dateval)
  {
	  JavascriptExecutor js = (JavascriptExecutor )driver;
	  js.executeScript("arguments[0].setAttribute('text','"+dateval+"');",element);
  }
}
