package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rudraray147@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("ASH1411ish@rud");
		
		driver.findElement(By.name("login")).click();
	}

}
