package utility1;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtendReportDemoshop{
	
	public static ExtentReports getshopreports() {
		
		
		ExtentSparkReporter reports = new ExtentSparkReporter("./ReportsShop/report.html");
		reports.config().setReportName("demoshop");
		reports.config().setDocumentTitle("DemoShopTitle");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reports);
		
		return extent;
	}
}
