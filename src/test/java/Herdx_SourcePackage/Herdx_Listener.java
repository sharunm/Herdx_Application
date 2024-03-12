package Herdx_SourcePackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Herdx_Listener implements ITestListener {
    ExtentTest test;
    ExtentReports extent =  ExtentReportNG.Configure_Method();
    @Override
    public void onTestStart(ITestResult result) {
        // ITestListener.super.onTestStart(result);
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //ITestListener.super.onTestSuccess(result);
        test.log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // ITestListener.super.onTestFailure(result);
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        //ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        // ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        //  ITestListener.super.onFinish(context);
    }
}



