package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     driver.get("https://www.facebook.com/");
	     
	     Facebook fb= new Facebook(driver);
	     fb.email("rudraray147@gmail.com");
	     fb.pass("ASH1411ish@rud");
	     fb.login();
	     fb.account();
	     fb.logout();
	}

}
