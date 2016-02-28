package gradle.cucumber;
import com.ps.grupo2.comunio.MainActivity;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.java.es.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class login {

    public String password="";
    public String user="";
    public boolean result=false;

    @Given("^a user \"(.*?)\" and password \"(.*?)\"$")
    public void a_user_and_password(String arg1, String arg2) throws Throwable {
        password = arg2;
        user = arg1;
    }

    @When("^<password> is empty and <user> is not empty$")
    public void password_is_empty_and_user_is_not_empty() throws Throwable {
        password = "";
        user = "m";
    }

    @Then("^should let me not access$")
    public void should_let_me_not_access() throws Throwable {
        assertFalse(MainActivity.loginAccess(user, password));
    }

    @When("^<password> is not empty and user <user> is empty$")
    public void password_is_not_empty_and_user_user_is_empty() throws Throwable {
        password = "m";
        user = "";
    }

    @When("^the <password> is valid and the <user> is invalid$")
    public void the_password_is_valid_and_the_user_is_invalid() throws Throwable {
        password = "m";
        user = "///223+++";
    }

    @When("^the <password> is valid and the <user> is valid$")
    public void the_password_is_valid_and_the_user_is_valid() throws Throwable {
        password = "m";
        user = "m";
    }

    @Then("^should let me access$")
    public void should_let_me_access() throws Throwable {
        assertTrue(MainActivity.loginAccess(user, password));
    }

    @When("^the <password> is invalid and the <user> is valid$")
    public void the_password_is_invalid_and_the_user_is_valid() throws Throwable {
        password = "/3333132+++";
        user = "m";
    }
}

