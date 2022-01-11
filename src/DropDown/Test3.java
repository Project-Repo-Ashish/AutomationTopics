package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		WebElement dd = driver.findElement(By.id("cars"));
		
		Select s= new Select(dd);
		s.selectByIndex(0);
		s.selectByValue("199");
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		
		Thread.sleep(3000);
		s.deselectByIndex(0);
		Thread.sleep(3000);
		s.deselectByValue("199");
		Thread.sleep(3000);
		s.deselectByVisibleText("More Than INR 500 ( 55 ) ");
		
		System.out.println(s.isMultiple());
		List<WebElement> allOpt = s.getOptions();
		System.out.println(allOpt.size());
		
		if (s.isMultiple()) {
			s.deselectAll();
		}
	}

}
