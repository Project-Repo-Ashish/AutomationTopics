package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=5613976381407023684&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007796&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMInrKrrPyg9AIVd51LBR11aQP3EAAYASAAEgJv7PD_BwE");
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		WebElement serTxt = driver.findElement(By.id("twotabsearchtextbox"));
		Point loc=serTxt.getLocation();
		
		int x=loc.getX();
		System.out.println(x +"its X cordinate");
		
		int y=loc.getY();
		System.out.println(y +"its Y cordinate");
		
		driver.close();				
	}

}
