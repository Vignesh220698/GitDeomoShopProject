package utility1;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base1.ProjectDemoBase;

public class Listernerclass extends ProjectDemoBase  implements ITestListener{
	
	ExtentTest test;
	ExtentReports extent=ExtendReportDemoshop.getshopreports();
	

	public void onTestStart(ITestResult result) {
	
		test=extent.createTest(result.getMethod().getMethodName());
		System.out.println("Test Start");
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "testpass");
		System.out.println("Test Sucess");
		
		
		String filepath= null;
		try {
			filepath = getScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		System.out.println("Test Fail");
		
		String filepath=null;
		try {
			filepath = getScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skip");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		System.out.println("Test Finish");
		
	}
	
	

}
