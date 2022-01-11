package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="pass")
	private WebElement passtb;
	
	@FindBy(name="login")
	private WebElement logbtn;
	
	@FindBy(xpath="//div[@aria-label='Account']")
	private WebElement accountbtn;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logoutbtn;
	
	public Facebook(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	public void email(String email) {
		emailtb.sendKeys(email);
	}
	public void pass(String password) {
		passtb.sendKeys(password);
	}
	public void login() {
		logbtn.click();
	}
	public void account() {
		accountbtn.click();
	}
	public void logout() {
		logoutbtn.click();
	}
	

}
