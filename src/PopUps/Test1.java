package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	     driver.findElement(By.xpath("//div[text()='Login ']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[@id='ext-gen23']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//span[text()='14']")).click();
	}
}
