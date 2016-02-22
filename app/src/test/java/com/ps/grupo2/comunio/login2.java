package gradle.cucumber;
import com.ps.grupo2.comunio.MainActivity;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.java.es.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class login2 {
	
	public String password="";
	public String user="";
	

	@Given("^a user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_user_and_password(String arg1, String arg2) throws Throwable {
		password = arg2;
		user = arg1;
	}

	@When("^<password> is empty and <user> is not empty$")
	public void password_is_empty_and_user_is_not_empty() throws Throwable {
		password = "";
	}

	@Then("^should return <access>$")
	public void should_return_access() throws Throwable {
		assertTrue(MainActivity.loginAccess(user, password));
	}

	@When("^<password> is not empty and user <user> is empty$")
	public void password_is_not_empty_and_user_user_is_empty() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the <password> is invalid and the <user> is valid$")
	public void the_password_is_invalid_and_the_user_is_valid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
