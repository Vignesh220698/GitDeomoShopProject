package test1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base1.ProjectDemoBase;
import page1.Homepage1;

public class TC0001_RegisterTest extends ProjectDemoBase{
	
	@BeforeTest
	public void setdata() {
		Excelfile="signup";
	}


@Test(priority = 1,dataProvider = "getdata")
public void Register(String name, String password) {
	
	new Homepage1(driver)
	.signupbutton()
	.signupusername(name)
	.signupassword(password)
	.signupbutton1();
	
	
	
}

}
