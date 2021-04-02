package com.qa.commonmethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import cucumber.api.Scenario;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Commonmethods {

public WebDriver driver;
public ExtentReports extent;  //default access specifier is "private"
ExtentSparkReporter extentreport;
public String nameofCurrMethod=null;
ExtentTest test;

public static Logger logger=Logger.getLogger(Commonmethods.class);
//PageFactory.initElements(driver, Loginmethods.class);

public String getconfigproperty(String key) throws IOException
{
	FileInputStream getconfig=new FileInputStream("Resources/config.properties");
	Properties property=new Properties();
	property.load(getconfig);
	String value=property.getProperty(key);
	return value;
}

public void extentreport()
{
 extent=new ExtentReports(); 
 extentreport=new ExtentSparkReporter("Reports/extentreport.html");
 extent.attachReporter(extentreport);
}

public void printlog(ExtentTest test,String value,String message) throws IOException
{
	if(value.equalsIgnoreCase("Pass"))		
	{
	  test.log(Status.PASS, message);	
    }
	else if(value.equalsIgnoreCase("Fail"))
	{
		//screenshot();
		test.log(Status.FAIL, message,MediaEntityBuilder.createScreenCaptureFromPath("D://Krishna//Images//Sampleashot.png").build());
		
	}
	
}

public void screenshot() throws IOException
{
	Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	ImageIO.write(screenshot.getImage(), "jpg", new File("D://Krishna//Images//Sampleashot.png"));
}

@BeforeClass
public void launchbrowser() throws IOException
{
	extentreport();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(getconfigproperty("URL"));
}

@AfterClass
public void quitbrowser()
{
	driver.quit();
	extent.flush();
}

}
