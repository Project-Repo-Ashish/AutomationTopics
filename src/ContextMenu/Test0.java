package ContextMenu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.*;
public class Test0 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     Robot r=new Robot();
	     //Error:-Not getting Robot class Method
	     //r.KeyPress()
	}

}
