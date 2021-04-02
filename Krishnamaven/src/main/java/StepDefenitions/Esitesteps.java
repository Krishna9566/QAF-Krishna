package StepDefenitions;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Esitesteps {

	@Given("^we have opened esite$")
	public void we_have_opened_esite() throws Throwable {
		System.out.println("we have opened esite");
	}
	@When("^we login to see esite dashboard$")
	public void we_login_to_see_esite_dashboard(DataTable datatable) throws Throwable {
		
	List<String> value=	datatable.asList(String.class);
	System.out.println(value.get(0));
	System.out.println(value.get(1));
		
	}

	@Then("^we close the esite$")
	public void we_close_the_esite() throws Throwable {
		System.out.println("we close the esite");
	}
	
	@When("^we login to see esite dashboard using header$")
	public void we_login_to_see_esite_dashboard_using_header(DataTable datatable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
	List<Map<String,String>> value=datatable.asMaps(String.class, String.class);
	System.out.println(value.get(0).get("Username"));
	System.out.println(value.get(1).get("Username"));
	System.out.println(value.get(0).get("Password"));
	System.out.println(value.get(1).get("Password"));

	}
	
	@When("^we login to see esite dashboard using header with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void we_login_to_see_esite_dashboard_using_header_with_and(String username, String password) throws Throwable {
	   System.out.println(username);
	   System.out.println(password);
	}
}
