package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parrallel {
	public WebDriver driver;
	
	@Parameters({"BrowserName"})
	@Test
	public void demo(String browser) {
		if (browser.equals("chrome")) {
			driver =new ChromeDriver();
		}else {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
