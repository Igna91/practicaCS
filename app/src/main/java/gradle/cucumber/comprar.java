package gradle.cucumber;
import com.ps.grupo2.comunio.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.java.es.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class comprar {

    Team equipo = null;
    Futbolista futbolista = null;

    @Given("^a <futboll player> and a <team id>$")
    public void a_futboll_player_and_a_team_id() throws Throwable {
        equipo = new Team("Chunguitos", 999, 250, 2);
        futbolista = new Futbolista("Pepin", "Defensa", 5, 3, 2, false, false, equipo, 1);
    }

    @When("^I press the \"([^\"]*)\" button AND the player is not for sale$")
    public void i_press_the_something_button_and_the_player_is_not_for_sale(String strArg1) throws Throwable {
        equipo.setIngresos(999);
        equipo.setID(1);
        futbolista.setPrecio(9);
        futbolista.setEstaEnMercado(false);
        futbolista.setId(1);
    }

    @When("^I press the \"([^\"]*)\" button AND the player not exist$")
    public void i_press_the_something_button_and_the_player_not_exist(String strArg1) throws Throwable {
        equipo.setIngresos(999);
        equipo.setID(1);
        futbolista.setPrecio(9);
        futbolista.setEstaEnMercado(true);
        futbolista.setId(-1);
    }

    @When("^I press the \"([^\"]*)\" button AND I don't have enough money$")
    public void i_press_the_something_button_and_i_dont_have_enough_money(String strArg1) throws Throwable {
        equipo.setIngresos(9);
        equipo.setID(1);
        futbolista.setPrecio(999);
        futbolista.setEstaEnMercado(true);
        futbolista.setId(1);
    }

    @When("^I press the \"([^\"]*)\" button AND I have enough money$")
    public void i_press_the_something_button_and_i_have_enough_money(String strArg1) throws Throwable {
        equipo.setIngresos(999);
        equipo.setID(1);
        futbolista.setPrecio(9);
        futbolista.setEstaEnMercado(true);
        futbolista.setId(1);
    }

    @When("^I press the \"(.*?)\" button AND I have enough money but team not exist$")
    public void i_press_the_button_AND_I_have_enough_money_but_team_not_exist(String arg1) throws Throwable {
        equipo.setIngresos(999);
        equipo.setID(-1);
        futbolista.setPrecio(9);
        futbolista.setEstaEnMercado(true);
        futbolista.setId(1);
    }

    @Then("^I should be able to not buy$")
    public void i_should_be_able_to_not_buy() throws Throwable {
        assertFalse(ItemsFichajes.fichar(futbolista, equipo));
    }

    @Then("^I should be able to buy my money should be increased$")
    public void i_should_be_able_to_buy_my_money_should_be_increased() throws Throwable {
        int ingresos = equipo.getIngresos();
        boolean fichaje = ItemsFichajes.fichar(futbolista, equipo);
        assertTrue((ingresos >= equipo.getIngresos())&& (fichaje));
    }
}
