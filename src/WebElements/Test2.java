package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		WebElement logbt = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	    
		Dimension s = logbt.getSize();
		int height = s.getHeight();
		System.out.println(height +"Btn Height ");
		
		 int width = s.getWidth();
		 System.out.println(width +"Btn Width");
		 
		 
	
	}

}
