package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		WebElement mOver = driver.findElement(By.xpath("//a[text()='COURSE']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(mOver).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		
		Thread.sleep(3000);
		WebElement doubclk = driver.findElement(By.id("add"));
		Thread.sleep(3000);
		a.doubleClick(doubclk);
		
	}

}
