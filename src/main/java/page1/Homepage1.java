package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base1.ProjectDemoBase;

public class Homepage1 extends ProjectDemoBase{
	
	
	@FindBy(id="signin2")
	WebElement signupbutton;
	
	@FindBy(id="login2")
	WebElement loginbutton;
	
	public Homepage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public SignUpPage1 signupbutton() {
		click(signupbutton);
		return new SignUpPage1(driver);
	}
	
	public LoginPage1 loginbutton() {
		
		click(loginbutton);
		return new LoginPage1(driver);
	}

}
