package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import main.java.Ride;

public class CucumberSteps extends TestCase {
	Ride ride = new Ride();
	String actionButton;
	@Given("^User enters correct data$")
	public void User_enters_correct_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		// throw new PendingException();
		ride.setDestination("Indira Nagar");
		ride.setSource("Domlur");
		ride.setStartTime("17:30");
		ride.setEndTime("18:30");
		ride.setAuthUser("1");
	}

	@When("^User clicks \"([^\"]*)\"$")
	public void User_clicks(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		actionButton = arg1;
		
	}
	
	@Then("^System should show a message saying \"([^\"]*)\"$")
	public void System_should_show_a_message_saying(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		RideModify rideModify = new RideModify();
		assertEquals(arg1,rideModify.SaveRide(ride));
	}
	
	
	@Given("^User enters Destination \"([^\"]*)\" Source \"([^\"]*)\" StartTime \"([^\"]*)\" EndTime \"([^\"]*)\"$")
	public void User_enters_Destination_Source_StartTime_EndTime(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		ride.setDestination(arg1);	
		ride.setSource(arg2);
		ride.setStartTime(arg3);
		ride.setEndTime(arg4);
		ride.setAuthUser("1");
	}


	@Given("^User modifies a post they own$")
	public void User_modifies_a_post_they_own() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		ride.setDestination("Indira Nagar");
		ride.setSource("Domlur");
		ride.setStartTime("17:30");
		ride.setEndTime("18:30");
		ride.setAuthUser("1");
	}

	@Given("^User modifies a post they don't own$")
	public void User_modifies_a_post_they_don_t_own() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		ride.setDestination("Indira Nagar");
		ride.setSource("Domlur");
		ride.setStartTime("17:30");
		ride.setEndTime("18:30");
		ride.setAuthUser("0");
	}
	
	@Given("^User enters invalid date$")
	public void User_enters_invalid_date() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
	}

}