package extent_report;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extent_frame {

static ExtentReports report;
static ExtentTest logger;
String methodname="";
		
@BeforeSuite

//type line System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "") in script console on Manage Jenkins
public void extreport() {
	report = new ExtentReports("./Report/Extent_Rep.html");	
		}
@BeforeMethod
public void method_name(Method method) { //to get name of method of test
	methodname = method.getName();
	logger = report.startTest(methodname);
}
@AfterMethod
public void tear(ITestResult result) {
	if (result.getStatus()==ITestResult.FAILURE) {
		logger.log(LogStatus.FAIL,logger.getTest().getName()+" is failed"+ logger.addScreenCapture("./download.jpg"));
	}
	
	if (result.getStatus()==ITestResult.SUCCESS) {
		logger.log(LogStatus.PASS, logger.getTest().getName()+" is passed");
	}
	report.flush();
}

@AfterSuite
public void stop_test() {
	  report.endTest(logger);
}
}

