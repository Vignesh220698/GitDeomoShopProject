package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base1.ProjectDemoBase;

public class SignUpPage1 extends ProjectDemoBase{
	
	
	
	@FindBy(id = "sign-username")
	WebElement username;
	
	@FindBy(id="sign-password")
	WebElement pass;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signupbutton1;
	
	public SignUpPage1(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	   public SignUpPage1 signupusername(String name) {
		   
		   sentkey(username , name);
		   return this;
		   
	   }
	 public SignUpPage1 signupassword(String password)
	 {
		 sentkey(pass,password);
		 return this;
	 }
	
	 public void signupbutton1() {
		 click(signupbutton1);
	 }
	
}
