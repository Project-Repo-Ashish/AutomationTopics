package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		WebElement uemail = driver.findElement(By.id("email"));
		
		if (uemail.isDisplayed()) {
		  System.out.println("Pass: is Display");
		 
		}else {
			System.out.println("Fail: is Display");
		}
		
	}

}
