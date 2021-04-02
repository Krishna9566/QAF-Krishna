package StepDefenitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	

		@Given("we have mobile phone")
		public void we_have_mobile_phone() {
		System.out.println("we have mobile phone");
		    
		}

		@When("we install instagram")
		public void we_install_instagram() {
			System.out.println("we install instagram");
		    
		}
		@When("we enter username and password in instagram app")
		public void we_enter_username_and_password_in_instagram_app() {
			System.out.println("we enter username and password in instagram app");
		    
		}
		@Then("we finally see instagram dashboard")
		public void we_finally_see_instagram_dashboard() {
			System.out.println("we finally see instagram dashboard");
		    
		}

			@When("we install twitter")
			public void we_install_twitter() {
				System.out.println("we install twitter");
			}

			@When("we enter username and password in twitter app")
			public void we_enter_username_and_password_in_twitter_app() {
				System.out.println("we enter username and password in twitter app");
			}
			@Then("we finally see twitter dashboard")
			public void we_finally_see_twitter_dashboard() {
				System.out.println("we finally see twitter dashboard");
			}







}
