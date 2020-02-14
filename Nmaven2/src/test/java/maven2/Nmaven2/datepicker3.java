package maven2.Nmaven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker3 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/datepicker/");
	  driver.manage().window().maximize();
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'14')]")).click();
  }
}
