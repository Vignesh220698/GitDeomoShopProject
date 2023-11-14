package test1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base1.ProjectDemoBase;
import page1.Homepage1;

public class TC0002_LoginTest extends ProjectDemoBase{
	
	
	@BeforeTest
	public void setdata() {
		
		Excelfile="login";
		
	}
	@Test(priority = 2,dataProvider = "getdata")
	public void Login(String username,String password) throws InterruptedException {
		
		new Homepage1(driver)
		.loginbutton()
		.loginusername(username)
		.loginpassword(password)
		.loginbutton1();
		
		
		
		Thread.sleep(4000);
		String source=driver.getPageSource();
		
		boolean Actual=source.contains("Welcome");
		boolean expected=true;
		Assert.assertEquals(Actual, expected);
		System.out.println("Login Sucessfully");
		
	}
}
