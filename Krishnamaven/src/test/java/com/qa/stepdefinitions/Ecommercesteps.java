package com.qa.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Ecommercesteps {
	
	@Given("we open e-commerce website")
	public void loginsite()
	{
		System.out.println("Login succesfull");
	}
	
	@And("we login inot the e-commerce website")
	public void loggedin()
	{
		System.out.println("Logged in succesfully and can able to see dashboard");
	}
	
	@Then("we validate dashboard")
	public void dashboard()
	{
		System.out.println("Dashboard verify");
	}

}
