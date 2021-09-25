package week6.day2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.observer.entity.MediaEntity;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static void main(String[] args) {
		
		ExtentSparkReporter report = new ExtentSparkReporter("./reports.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(report);
		ExtentTest test = extent.createTest("TC001 - First Test");
		test.assignAuthor("Luisin");
		test.assignCategory("Regression Testing");
		test.pass("Enter User name");
		test.pass("Enter Password");
		test.fail("Wrong credentials", MediaEntityBuilder.createScreenCaptureFromPath("./sc.png").build());
		
		
		extent.flush();
		System.out.println("Completed");
	}

}
