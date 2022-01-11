package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	     Alert a = driver.switchTo().alert();
	     System.out.println(a.getText());
	     a.dismiss();
	     
	}

}
