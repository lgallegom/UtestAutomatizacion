package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import userinterface.UtestPaginaInicio;

import static userinterface.UtestPaginaInicio.BOTON_REGISTRO;

public class Buscar implements Task {

    public static Buscar elBotonRegistrar() {
        return Tasks.instrumented(Buscar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPaginaInicio.BOTON_REGISTRO));

    }
}
