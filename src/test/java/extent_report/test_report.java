package extent_report;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test_report extends extent_frame {
	@Parameters({"num1","num2"})
	@Test(groups = "Smoke")
	public void test1(int num1,int num2) {
		System.out.println("I am in test1");
		int sum = num1+num2;
		assertTrue(sum==5);
	}
	@Test(groups = "Smoke")
	public void test2() {
		System.out.println("I am in test2");
		assertTrue(5==5);
	}
	@Test(groups = {"Sanity","Smoke"})
	public void test3() {
		System.out.println("I am in test3");
		assertTrue(5==5);
	}
	


}
