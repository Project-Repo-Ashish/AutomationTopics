package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		WebElement blcok1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement blcok4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(blcok1, blcok4).perform();
	}

}
