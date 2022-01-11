package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
	
		//Use Of  #5.ccsSelecter
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
       
     driver.get("https://demoapp.skillrary.com/");
     
     Thread.sleep(3000);
		driver.findElement(By.linkText("LOGIN")).click();	
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("user");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("user");
		
		driver.findElement(By.cssSelector("button[id='last']")).click();
	}

}
