package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
	 WebElement ele = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		System.out.println(ele.getText());
		Thread.sleep(3000);
		driver.close();
	}

}
