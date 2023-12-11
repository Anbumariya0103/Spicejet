package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseSJ;



public class ListenerSJ extends BaseSJ implements ITestListener {
	ExtentTest test;
	 ExtentReports extents= Extent.getreport();
	@Override
	public void onTestStart(ITestResult result) {
	test=extents.createTest(result.getMethod().getMethodName());
	System.out.println("Test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("testpassed");
		System.out.println("Test succeed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getThrowable());
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) {
		extents.flush();
	}

}
 
