package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		Select s= new Select(drop);
		s.selectByIndex(5);
		s.selectByValue("search-alias=nowstore");
		s.selectByVisibleText("Appliances");
     
		List<WebElement> alloption = s.getOptions();
		System.out.println(alloption.size());
		
		for (WebElement allEle : alloption) {
			System.out.println("");
		}
		
	}

}
