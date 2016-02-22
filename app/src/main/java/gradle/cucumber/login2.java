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
	public boolean result=false;
	public boolean isCorrect=false;


	@Given("^a user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_user_and_password(String arg1, String arg2) throws Throwable {
		password = arg2;
		user = arg1;
	}

	@When("^<password> is empty and <user> is not empty$")
	public void password_is_empty_and_user_is_not_empty() throws Throwable {
		result = MainActivity.loginAccess(user, "");
		isCorrect=false;
	}

	@Then("^should return <access>$")
	public void should_return_access() throws Throwable {
		assertSame(result, isCorrect);
	}

	@When("^<password> is not empty and user <user> is empty$")
	public void password_is_not_empty_and_user_user_is_empty() throws Throwable {
		result = MainActivity.loginAccess("", password);
		isCorrect=false;
	}

	@When("^the <password> is valid and the <user> is invalid$")
	public void the_password_is_valid_and_the_user_is_invalid() throws Throwable {
		result = (MainActivity.conexionBD("?",password)>0) ? true: false;
		System.out.println("Resultado: "+result);
		isCorrect=false;
	}

	@When("^the <password> is valid and the <user> is valid$")
	public void the_password_is_valid_and_the_user_is_valid() throws Throwable {
		result = (MainActivity.conexionBD(user,password)>0) ? true: false;
		isCorrect=true;
	}

	@When("^the <password> is invalid and the <user> is valid$")
	public void the_password_is_invalid_and_the_user_is_valid() throws Throwable {
		result = (MainActivity.conexionBD(user,"?")>0) ? true: false;
		isCorrect=false;
	}
}
