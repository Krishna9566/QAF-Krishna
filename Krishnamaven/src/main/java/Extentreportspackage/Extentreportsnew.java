package Extentreportspackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportsnew {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter extentreport; 
	ExtentTest test;
	
	@BeforeTest
	public void beforetest()
	{
		extent=new ExtentReports();
		extentreport=new ExtentSparkReporter("Reports/extentreport.html");
		extent.attachReporter(extentreport);
		System.out.println("Before test");
	}
	
	@Test
	public void opengoogle()
	{
		test=extent.createTest("opengoogle");
		test.log(Status.PASS, "Opened google succesfully");
		test.pass("Pass");		
	}
	
	@Test
	public void openfacebook()
	{
		test=extent.createTest("openfacebook");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		if(driver.getTitle().equals("facebookk"))
		{
			test.log(Status.PASS, "Facebook title is equal");
		}	
		else
		{
		test.log(Status.FAIL, "Facebook title is not equal");
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath("Reports/extentfail.png").build());
		test.addScreenCaptureFromPath("extentfail.png");
	}
		driver.quit();
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test");
		extent.flush();
	}
}
