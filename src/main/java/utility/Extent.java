package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {

	public static ExtentReports getreport() {
		ExtentSparkReporter extent=new ExtentSparkReporter("./SJReport/report.html");
	extent.config().setReportName("SpiceJet");
	extent.config().setDocumentTitle("SpiceJettitle");
	ExtentReports report= new ExtentReports();
	report.attachReporter(extent);
	return report;

}
}

