package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Return ")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.name("login")).click();
		
		
		driver.findElement(By.id("navbar-search-input")).click();
		driver.findElement(By.id("navbar-search-input")).sendKeys("Cucumber");
		
		driver.findElement(By.id("searchBtn")).click();
	}

}
