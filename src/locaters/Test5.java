package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// Use Of Xpath locater
		//With AmCat Login automated
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.myamcat.com/");
	
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
	driver.findElement(By.xpath("//input[@id='loginEmail']")).sendKeys("ashish.bhalray14@gmail.com");
	driver.findElement(By.xpath("//input[@id='loginPasswordLoginFormNew']")).sendKeys("ASH14ish@rud");
	
	driver.findElement(By.xpath("(//button[@id='loginBtnNew'])[1]")).click();
	
	}

}
