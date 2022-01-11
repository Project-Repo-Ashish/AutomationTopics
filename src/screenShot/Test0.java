package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.myntra.com/");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     
	     TakesScreenshot ts=(TakesScreenshot) driver;
	     
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     
	     File dest=new File("./photo/myntra.png");
	     
	     FileUtils.copyFile(src, dest);
	     
	     driver.close();
	}

}
