package Herdx_SourcePackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
    static ExtentReports extent;

    public static ExtentReports Configure_Method()
    {
        String path= System.getProperty("user.dir") + "//Output.html";
        ExtentSparkReporter report = new ExtentSparkReporter(path);
        report.config().setReportName("Automation testing for Website");
        report.config().setDocumentTitle("Test Results");
        extent = new ExtentReports();
        extent.attachReporter(report);
        extent.setSystemInfo("Tester","Saranya");
        return extent;

    }
}
