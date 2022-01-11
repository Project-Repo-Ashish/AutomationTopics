package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
    
   
  
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     driver.get("https://www.facebook.com/");
     
       WebElement ele1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
      ele1.click();
      WebElement ele2 = driver.findElement(By.xpath("//select[@id='day']"));
    
     
      WebElement ele3 = driver.findElement(By.xpath("//select[@id='month']"));
    
      Select s = new Select(ele3);
      Thread.sleep(3000);
      s.selectByIndex(5);
      Thread.sleep(3000);
      s.selectByValue("4");
      Thread.sleep(3000);
      s.selectByVisibleText("Nov");
    
      System.out.println(s.isMultiple());
      
      List arrList=new ArrayList();
      
      List<WebElement>allopt=s.getOptions();
      System.out.println(allopt.size());
    
    for (WebElement ele : allopt) 
    {
		String data=ele.getText();
		arrList.add(data);  
		
    }
      List temp=new ArrayList();
      temp.addAll(arrList);
    
      //For Assending
      Collections.sort(temp); 
      System.out.println(temp);       
	}

}