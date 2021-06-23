package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.UtestModelo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

import java.util.List;

public class UtestRegistroUsuarioStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Dado("^que (.*) quiere registrarse en Utest$")
    public void queElUsuarioQuiereRegistrarseEnUtest(String nombreActor) {
        OnStage.theActorCalled(nombreActor).wasAbleTo(Abrir.laPagina());

    }


    @Cuando("^(.*) busca la opcion de registro$")
    public void elUsuarioBuscaLaOpcionDeRegistro(){
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.elBotonRegistrar());

    }


    @Entonces("^debe llenar los datos personales$")
    public void debeLlenarLosDatosPersonales(List<UtestModelo> utestDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarLosDatosPersonales.en(utestDatos.get(0).getNombre(), utestDatos.get(0).getApellido(),
                utestDatos.get(0).getCorreoElectronico(), utestDatos.get(0).getMes(), utestDatos.get(0).getDia(),
                utestDatos.get(0).getAño()));

    }

    @Entonces("^debe llenar los datos de su ubicacion$")
    public void debeLlenarLosDatosDeSuUbicacion(List<UtestModelo> utestDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarLosDatosDeSuUbicacion.en(utestDatos.get(0).getCiudad(), utestDatos.get(0).getCodigoPostal(),
                utestDatos.get(0).getPais()));

    }

    @Entonces("^debe llenar los datos de sus dispositivos$")
    public void debeLlenarLosDatosDeSusDispositivos(List<UtestModelo> utestDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarLosDatosDeSusDispositivos.en(utestDatos.get(0).getComputador(), utestDatos.get(0).getVersion(),
                utestDatos.get(0).getIdiomaComputador(),utestDatos.get(0).getDispositivoMovil(),utestDatos.get(0).getModelo(),
                utestDatos.get(0).getSitemaOperativoMovil()));

    }

    @Entonces("^debe crear una contraseña$")
    public void debeCrearUnaContraseña(List<UtestModelo> utestDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarContraseña.en(utestDatos.get(0).getContraseña()));

    }
}
