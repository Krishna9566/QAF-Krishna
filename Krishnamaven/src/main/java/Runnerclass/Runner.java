package Runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/Features" ,
glue = {"StepDefenitions","Hookscucumber"},
monochrome=true,
dryRun =false,
strict=true,
plugin= {"pretty","html:Reports/HTMLReports.html",
		  "json:Reports/JSONReports.json"},
tags= {"@Logininsta"})

public class Runner{
	
	

}


