package maven2.Nmaven2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class AJAX_trail {
	 ChromeDriver driver;
	 WebDriverWait wait;
  @Test
  public void f() {
	  driver.get("http://demo.guru99.com/test/ajax.html");
	  //WebElement web= driver.findElement(By.xpath("http://demo.guru99.com/test/ajax.html"));
	  //Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[2][@class='container']")));
	  By container = By.xpath("//div[2][@class='container']");//cssSelector(".container");
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(container));
	  System.out.println("Working");
	  String textbefore= driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
	  driver.findElement(By.xpath("//input[@id='yes']")).click();
	  driver.findElement(By.xpath("//input[@id='buttoncheck']")).click();
	  String textafter= driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
	  Assert.assertNotEquals(textbefore,textafter);
	  System.out.println("AJAx call performed");
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
