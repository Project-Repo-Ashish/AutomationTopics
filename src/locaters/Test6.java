package locaters;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		
		//Automation Login For Instagram 
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		if (tittle.equals("Instagram")) {
			driver.findElement(By.name("username")).sendKeys("adhbfbwjrheh");
			driver.findElement(By.name("password")).sendKeys("455agdsbvnfmvn");
			driver.findElement(By.xpath("//div[text()='Log In']")).click();
			
			System.out.println("Pass:Home page is displayed");
		}else {
			System.out.println("Fail:Home page is not displayed");
			}
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
	//	driver.close(); 
	}

}
