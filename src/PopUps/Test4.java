package PopUps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.naukri.com/");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     
	     String parent=driver.getWindowHandle();
	     System.out.println(parent);
	   
	     
	    Set<String> child = driver.getWindowHandles();
	    System.out.println(child);
	    System.out.println(child.size());
	    
	    String expTil = "Congnizant";
	    for(String allwin:child) {
	    	
	    	driver.switchTo().window(allwin);
	    	String actTil = driver.getTitle();
	    	System.out.println(actTil);
	    	
	    	if (actTil.equals(expTil)) {
				driver.close();
			}
	    	
	    }
	}

}
