package base1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility1.Utilityclass1;

public class ProjectDemoBase extends Utilityclass1{
	
	
	
	@Parameters({"url","browser"})
	@BeforeMethod
	public void browserlaunch(String url ,String browser) {
		launchbrowser1(url, browser);
	}
	
	@DataProvider(name="getdata")
	public Object[][] Exceldata() throws IOException {
		Object[][] data=ReadExcel(Excelfile);
		return data;
	}
	
	
	@AfterMethod
	public void browserclose() {
		closebrowser();
	}

}
