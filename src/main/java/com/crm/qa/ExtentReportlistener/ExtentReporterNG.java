package com.crm.qa.ExtentReportlistener;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporterNG impliments IReporter {
	
	private ExtentReports extent;
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		extent = new ExtentReports(outputDirectory + File.separator + "CRM_Extent.html",true);
		
		for(ISuite suite:suites) {
			Map<String,ISuiteResult> result = suite.getResults();
			for(ISuiteResult r:resut.values()) {
				ITestContext context = r.getTestContext();
				buildTestNodes(context.getPassedTests(),LogStatus.PASS);
				buildTestNodes(context.getFailedTests(),LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
				
			}
		}
		extent.flush();
		extent.close();
	}

}
