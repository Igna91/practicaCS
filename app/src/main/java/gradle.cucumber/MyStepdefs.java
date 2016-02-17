package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

/**
 * Created by kaish on 17/02/2016.
 */
public class MyStepdefs {

    @Entonces("^el resultado debe ser <resultado> en la pantalla$")
    public void el_resultado_debe_ser_resultado_en_la_pantalla() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Cuando("^oprimo el <boton>$")
    public void oprimo_el_boton() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }


    @Y("^que  he introducido la contraseña <entrada_(\\d+)> en el login$")
    public void que_he_introducido_la_contraseña_entrada_en_el_login(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Dado("^que he introducido el usuario <entrada_(\\d+)> en el login$")
    public void que_he_introducido_el_usuario_entrada_en_el_login(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
