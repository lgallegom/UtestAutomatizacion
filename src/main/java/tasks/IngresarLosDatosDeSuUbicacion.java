package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.UtestPaginaDatosDeUbicacion;
import userinterface.UtestPaginaDatosPersonales;

public class IngresarLosDatosDeSuUbicacion implements Task {

    private String ciudad;
    private String codigoPostal;
    private String pais;

    public IngresarLosDatosDeSuUbicacion(String ciudad, String codigoPostal, String pais) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }


    public static IngresarLosDatosDeSuUbicacion en(String ciudad, String codigoPostal, String pais) {
        return Tasks.instrumented(IngresarLosDatosDeSuUbicacion.class, ciudad, codigoPostal, pais);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(ciudad).into(UtestPaginaDatosDeUbicacion.CAMPO_CIUDAD),
        Hit.the(Keys.ARROW_DOWN).into(UtestPaginaDatosDeUbicacion.CAMPO_CIUDAD),
        Hit.the(Keys.ENTER).into(UtestPaginaDatosDeUbicacion.CAMPO_CIUDAD),
        Enter.theValue(codigoPostal).into(UtestPaginaDatosDeUbicacion.CAMPO_CODIGO_POSTAL),
        Enter.theValue(pais).into(UtestPaginaDatosDeUbicacion.CAMPO_PAIS),
        Hit.the(Keys.ARROW_DOWN).into(UtestPaginaDatosDeUbicacion.CAMPO_PAIS),
        Hit.the(Keys.ENTER).into(UtestPaginaDatosDeUbicacion.CAMPO_PAIS),
        Click.on(UtestPaginaDatosDeUbicacion.BOTON_SIGUIENTE_2));


    }
}
