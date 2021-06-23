package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestPaginaDatosPersonales;

public class IngresarLosDatosPersonales implements Task {


    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String mes;
    private String dia;
    private String año;



    public IngresarLosDatosPersonales(String nombre, String apellido, String correoElectronico, String mes, String dia, String año, String idioma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.mes = mes;
        this.dia = dia;
        this.año = año;

    }

    public static IngresarLosDatosPersonales en(String nombre, String apellido, String correoElectronico, String mes, String dia, String año) {
        return Tasks.instrumented(IngresarLosDatosPersonales.class,nombre,apellido,correoElectronico,mes,dia,año);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(nombre).into(UtestPaginaDatosPersonales.CAMPO_NOMBRE),
        (Enter.theValue(apellido).into(UtestPaginaDatosPersonales.CAMPO_APELLIDO)),
        (Enter.theValue(correoElectronico).into(UtestPaginaDatosPersonales.CAMPO_CORREO_ELECTRONICO)),
        (Click.on(UtestPaginaDatosPersonales.LISTA_MES.of(mes))),
        (Click.on(UtestPaginaDatosPersonales.LISTA_DIA.of(dia))),
        (Click.on(UtestPaginaDatosPersonales.LISTA_AÑO.of(año))),
        (Click.on(UtestPaginaDatosPersonales.BOTON_SIGUIENTE_1))

        );
    }
}
