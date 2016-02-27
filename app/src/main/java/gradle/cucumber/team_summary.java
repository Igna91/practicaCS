package gradle.cucumber;
import com.ps.grupo2.comunio.Futbolista;
import com.ps.grupo2.comunio.GestionEquipo;
import com.ps.grupo2.comunio.ItemsFichajes;
import com.ps.grupo2.comunio.Team;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class team_summary {

    Team equipo = null;
    Futbolista futbolista1 = new Futbolista("Pepin", "Defensa", 5, 3, 2, false, false, null, 1);
    Futbolista futbolista2 = new Futbolista("Juanin", "Defensa", 5, 3, 2, false, false, null, 2);
    Futbolista futbolista3 = new Futbolista("Martin", "Defensa", 5, 3, 2, false, false, null, 3);
    Futbolista futbolista4 = new Futbolista("Lolin", "Defensa", 5, 3, 2, false, false, null, 4);

    @Given("^my team$")
    public void my_team() throws Throwable {
        this.equipo = equipo = new Team("Chunguitos", 999, 250, 2);
    }

    @When("^My main team has players$")
    public void my_main_team_has_players() throws Throwable {
        equipo.agregar1Titular(futbolista1);
    }

    @When("^My main team does not have players$")
    public void my_main_team_does_not_have_players() throws Throwable {
        equipo.eliminarFutbolista(futbolista1, 1);
    }

    @When("^My secondary team has players$")
    public void my_secondary_team_has_players() throws Throwable {
        equipo.agregar1Suplente(futbolista1);
    }

    @When("^My secondary team does not have players$")
    public void my_secondary_team_does_not_have_players() throws Throwable {
        equipo.eliminarFutbolista(futbolista1, 5);
    }

    @When("^I press the \"([^\"]*)\" button$")
    public void i_press_the_something_button(String strArg1) throws Throwable {
        // Apretar botón.
    }

    @Then("^my main football team return$")
    public void my_main_football_team_return() throws Throwable {
        assertEquals(bbdd.equipo.getFutbolistasBD(), equipo.getFutbolistas());
        //assertArrayEquals(bbdd.equipo.getFutbolistasBD(), equipo.getFutbolistas());
    }

    @Then("^an empty element is returned$")
    public void an_empty_element_is_returned() throws Throwable {
        assertEquals(bbdd.equipo.getFutbolistasBD(), equipo.getFutbolistas());
    }

    @Then("^my backup equipment will return$")
    public void my_backup_equipment_will_return() throws Throwable {
        assertNotEquals(bbdd.equipo.getFutbolistasBD(), equipo.getFutbolistas());
    }

    @Then("^my team money will be returned$")
    public void my_team_money_will_be_returned() throws Throwable {
        System.out.println(equipo.getIngresos());
        assertEquals(equipo.getIngresos(), 999);
    }
}
