package maven2.Nmaven2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sekuli_trial {
  @Test
  public void f() throws FindFailed, InterruptedException {
	  Screen s = new Screen();
	  Pattern fileinputbox =new Pattern("C:\\Users\\VipinMishra\\Desktop\\filepath.PNG");
	  Pattern openbutton = new Pattern("C:\\Users\\VipinMishra\\Desktop\\openimg.PNG");
	  Pattern formt = new Pattern("C:\\Users\\VipinMishra\\Desktop\\formatchange.PNG");
	  Pattern formt1 = new Pattern("C:\\Users\\VipinMishra\\Desktop\\allformat.png");
	  Pattern formt2 = new Pattern("C:\\Users\\VipinMishra\\Desktop\\convert.png");
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.ilovepdf.com/word_to_pdf");//"http://demo.guru99.com/test/image_upload/index.php");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@id='pickfiles']")).click();//("//a[contains(text(),'New Tours')]")).click();
	  
	  s.type(formt, "A");
	  s.click(formt1);
	  s.type(fileinputbox, "C:\\Users\\VipinMishra\\Desktop\\CTD.docx");
	  s.click(openbutton);
	  Thread.sleep(2000);
	  s.click(formt2);
  }
}
