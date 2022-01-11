package scrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	    
	   
	  
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     driver.get("https://www.myntra.com/");
	     
	     
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,7000)");
	     
	     Thread.sleep(3000);
	     js.executeScript("window.scrollBy(0,-7000)"); 
	}

}
