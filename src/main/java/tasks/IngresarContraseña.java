package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestPaginaContraseña;

public class IngresarContraseña implements Task {

    private String contraseña;


    public IngresarContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public static IngresarContraseña en(String contraseña) {
        return Tasks.instrumented(IngresarContraseña.class,contraseña);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(contraseña).into(UtestPaginaContraseña.CAMPO_CONTRASEÑA),
                Enter.theValue(contraseña).into(UtestPaginaContraseña.CAMPO_CONFIRMAR_CONTRASEÑA),
                Click.on(UtestPaginaContraseña.BOTON_TERMINOS_USO),
                Click.on(UtestPaginaContraseña.BOTON_POLITICA_SEGURIDAD),
                Click.on(UtestPaginaContraseña.BOTON_COMPLETAR));

    }
}
