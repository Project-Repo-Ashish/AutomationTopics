package scrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	    
	   
	  
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     driver.get("https://www.myntra.com/");
	     
	    WebElement ele = driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[47]")); 
	     Point loc = ele.getLocation();
	     int x=loc.getX();
	     int y=loc.getY();
	     
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy("+x+","+y+")");
	
	   Thread.sleep(3000);
	   ele.click();
	}

}
