package com.orangehrm.extentreportlistener;

import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.base.TestBase;
import com.orangehrm.utils.ScreenshotUtil;

public class ExtentTestListener implements ITestListener, ISuiteListener {

	private static ExtentReports extent;
	private static ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Suite", suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		extent.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		com.orangehrm.base.TestBase.logger = test;

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail("Test failed: " + result.getThrowable());

		WebDriver driver = TestBase.driver;
		String testName = result.getName();
		String screenshotPath = ScreenshotUtil.captureScreenshot(driver, testName);
		String base64 = ScreenshotUtil.captureBase64Screenshot(driver);

		try {
			test.fail("Failure Screenshot:").addScreenCaptureFromPath(screenshotPath)
					.addScreenCaptureFromBase64String(base64);
		} catch (Exception e) {
			test.fail("Screenshot error: " + e.getMessage());
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip("Test skipped");
	}
}
