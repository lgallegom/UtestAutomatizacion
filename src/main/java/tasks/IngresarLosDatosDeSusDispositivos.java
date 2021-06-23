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
import userinterface.UtestPaginaDatosDispositivos;

public class IngresarLosDatosDeSusDispositivos implements Task {

    private String computador;
    private String version;
    private String idiomaComputador;
    private String movil;
    private String modelo;
    private String soMovil;

    public IngresarLosDatosDeSusDispositivos(String computador, String version, String idiomaComputador, String movil, String modelo, String soMovil) {
        this.computador = computador;
        this.version = version;
        this.idiomaComputador = idiomaComputador;
        this.movil = movil;
        this.modelo = modelo;
        this.soMovil = soMovil;
    }

    public static IngresarLosDatosDeSusDispositivos en(String computador, String version, String idiomaComputador, String movil, String modelo, String soMovil) {
        return Tasks.instrumented(IngresarLosDatosDeSusDispositivos.class,computador,version,idiomaComputador,
                movil,modelo, soMovil);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(computador).into(UtestPaginaDatosDispositivos.CAMPO_COMPUTADOR),
        Hit.the(Keys.ARROW_DOWN).into(UtestPaginaDatosDispositivos.CAMPO_COMPUTADOR),
        Hit.the(Keys.ENTER).into(UtestPaginaDatosDispositivos.CAMPO_COMPUTADOR),
        Enter.theValue(version).into(UtestPaginaDatosDispositivos.CAMPO_VERSION),
        Hit.the(Keys.ARROW_DOWN).into(UtestPaginaDatosDispositivos.CAMPO_VERSION),
        Hit.the(Keys.ENTER).into(UtestPaginaDatosDispositivos.CAMPO_VERSION),
        Enter.theValue(idiomaComputador).into(UtestPaginaDatosDispositivos.CAMPO_IDIOMA),
        Hit.the(Keys.ARROW_DOWN).into(UtestPaginaDatosDispositivos.CAMPO_IDIOMA),
        Hit.the(Keys.ENTER).into(UtestPaginaDatosDispositivos.CAMPO_IDIOMA),
        Enter.theValue(movil).into(UtestPaginaDatosDispositivos.CAMPO_MOVIL),
        Hit.the(Keys.ARROW_DOWN).into(UtestPaginaDatosDispositivos.CAMPO_MOVIL),
        Hit.the(Keys.ENTER).into(UtestPaginaDatosDispositivos.CAMPO_MOVIL),
        Enter.theValue(modelo).into(UtestPaginaDatosDispositivos.CAMPO_MODELO),
        Hit.the(Keys.ARROW_DOWN).into(UtestPaginaDatosDispositivos.CAMPO_MODELO),
        Hit.the(Keys.ENTER).into(UtestPaginaDatosDispositivos.CAMPO_MODELO),
        Enter.theValue(soMovil).into(UtestPaginaDatosDispositivos.CAMPO_SO_MOVIL),
        Hit.the(Keys.ARROW_DOWN).into(UtestPaginaDatosDispositivos.CAMPO_SO_MOVIL),
        Hit.the(Keys.ENTER).into(UtestPaginaDatosDispositivos.CAMPO_SO_MOVIL),
        Click.on(UtestPaginaDatosDispositivos.BOTON_SIGUIENTE_3));



    }
}
