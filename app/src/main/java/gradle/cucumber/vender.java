package gradle.cucumber;
import com.ps.grupo2.comunio.Futbolista;
import com.ps.grupo2.comunio.GestionEquipo;
import com.ps.grupo2.comunio.MainActivity;
import com.ps.grupo2.comunio.Team;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.java.es.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class vender {

    Team equipo = null;
    Team equipoAux = new Team("Fanirato", 999, 250, 3);
    Futbolista futbolista = null;

    @Given("^a team and Player$")
    public void a_team_and_player() throws Throwable {
        equipo = new Team("Chunguitos", 999, 250, 2);
        futbolista = new Futbolista("Pepin", "Defensa", 5, 3, 2, false, false, equipo, 1);
    }

    @When("^I want to sell a player but does not belong to the team$")
    public void i_want_to_sell_a_player_but_does_not_belong_to_the_team() throws Throwable {
        equipo.setID(2);
        futbolista.setEstaEnMercado(false);
        futbolista.setId(1);
        equipo.eliminarFutbolista(futbolista, 1);
    }

    @When("^I want to sell a player, but that player does not exist$")
    public void i_want_to_sell_a_player_but_that_player_does_not_exist() throws Throwable {
        equipo.setID(2);
        futbolista.setEstaEnMercado(false);
        futbolista.setId(-1);
        equipo.agregar1Titular(futbolista);
    }

    @When("^I want to sell a player and exists and belongs to the team$")
    public void i_want_to_sell_a_player_and_exists_and_belongs_to_the_team() throws Throwable {
        equipo.setID(2);
        futbolista.setEstaEnMercado(false);
        futbolista.setId(1);
        equipo.agregar1Titular(futbolista);
    }

    @When("^I want to sell a player and is already sold$")
    public void i_want_to_sell_a_player_and_is_already_sold() throws Throwable {
        equipo.setID(2);
        futbolista.setEstaEnMercado(true);
        futbolista.setId(1);
        equipo.agregar1Titular(futbolista);
    }

    @When("^I want to sell a player and the team to which it belongs does not exist$")
    public void i_want_to_sell_a_player_and_the_team_to_which_it_belongs_does_not_exist() throws Throwable {
        equipo.setID(-1);
        futbolista.setEstaEnMercado(false);
        futbolista.setId(1);
        equipo.agregar1Titular(futbolista);
    }

    @Then("^I can not put it on sale$")
    public void i_can_not_put_it_on_sale() throws Throwable {
        assertFalse(GestionEquipo.venderJugador(equipo, futbolista));
    }

    @Then("^I can put it on sale$")
    public void i_can_put_it_on_sale() throws Throwable {
        assertTrue(GestionEquipo.venderJugador(equipo, futbolista));
    }
}
