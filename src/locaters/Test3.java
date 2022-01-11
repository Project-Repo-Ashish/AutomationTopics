package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://demoapp.skillrary.com/");
 
        driver.findElement(By.linkText("LOGIN")).click();
        driver.findElement(By.linkText("Forgot your password?")).click();

        //driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Return")).click();
        

	}

}
