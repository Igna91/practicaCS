package gradle.cucumber;
import com.ps.grupo2.comunio.Futbolista;
import com.ps.grupo2.comunio.GestionEquipo;
import com.ps.grupo2.comunio.ItemsFichajes;
import com.ps.grupo2.comunio.Team;

import java.util.ArrayList;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitx.framework.ListAssert;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;


public class menu {

    @Given("^the app menu$")
    public void the_app_menu() throws Throwable {
        // jejeje
    }

    @Then("^I can see the \"(.*?)\" screen$")
    public void i_can_see_the_screen(String arg1) throws Throwable {
        assertTrue(false);
    }

    @Then("^I can see the Fichajes screen$")
    public void i_can_see_the_Fichajes_screen() throws Throwable {
        assertTrue(false);
    }

    @Then("^I can share my score$")
    public void i_can_share_my_score() throws Throwable {
        assertTrue(false);
    }



}
