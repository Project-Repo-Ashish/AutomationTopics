package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testCase2 {
 
public WebDriver driver;
	
	@BeforeMethod
	public void tc1() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiabix.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void tc2() {
		driver.findElement(By.linkText("Arithmetic Aptitude")).click();
		driver.findElement(By.xpath("(//a[text()='View Answer'])[1]")).click();
		String title = driver.getTitle();
	
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "sdgweg3eg3hh");
		
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		s.assertAll();
	}
	@AfterMethod
	public void tc3() {
		driver.close();
	}
}
