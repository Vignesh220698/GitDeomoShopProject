package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base1.ProjectDemoBase;

public class LoginPage1 extends ProjectDemoBase{
	
	
	@FindBy(id="loginusername")
	WebElement loginusername;
	
	@FindBy(id="loginpassword")
	WebElement loginpassword;
	
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginbutton;
	
	public LoginPage1(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
      
	public LoginPage1 loginusername(String username) {
		sentkey(loginusername ,username);
		return this;
	}
	
	public LoginPage1 loginpassword(String password) {
		sentkey(loginpassword,password);
		return this;
	}
	
	public void loginbutton1() {
		click(loginbutton);
	}
	
}
