package com.qa.testcases;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.commonmethods.Commonmethods;
import com.qa.pageobjectmodel.Loginmethods;

import Pageobjectmodel.Loginmethod;

public class Loginaccount extends Commonmethods{

	ExtentTest test;
	
	@Test
	public void Logintest() throws InterruptedException, IOException
	{
	    nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName(); 
		test = extent.createTest(nameofCurrMethod);
        printlog(test,"PASS","URL Opened successfully");
        PageFactory.initElements(driver, Loginmethods.class);
        
        Loginmethods.loginbutton.click();
        Thread.sleep(2000);
        Loginmethods.username.sendKeys(getconfigproperty("Username"));
        Loginmethods.password.sendKeys(getconfigproperty("Password"));
        Loginmethods.submitbutton.click();
        Thread.sleep(2000);
        if(driver.getTitle().equals("samp"));
        {
        	 printlog(test,"Fail","Title is displayed diff");
        Assert.fail();	
        }
        //printlog(test,"PASS","Logged in successfully");
        
	}

}
