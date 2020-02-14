
package maven2.Nmaven2;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4j_demo {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  Logger log = Logger.getLogger("devpinoyLogger");//Using Logger.getLogger("devpinoyLogger") we create system level logs
	  driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
	  log.debug("opening webiste");//Using log.debug method we store data into Manual.log
	  driver.manage().window().maximize();
	  log.debug("maximising screen");
	  driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
	  log.debug("clicking on calander symbol");
	  Thread.sleep(1000);
	  log.debug("wait for 1 sec");
	  driver.findElement(By.xpath("//a[3][@role='button']")).click();
	  log.debug("clicking on submit button");
  }
}
