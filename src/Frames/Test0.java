package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.snapdeal.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
	     Actions a=new Actions(driver);
	     a.moveToElement(ele).click();
	     driver.switchTo().frame(0);
	     driver.findElement(By.xpath("//a[text()='Your Account']")).click();
	     driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("14589615456");
	}

}
