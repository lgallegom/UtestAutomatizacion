package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UtestPaginaDatosPersonales extends PageObject {

    public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar el nombre").located(By.id("firstName"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar el apellido").located(By.id("lastName"));
    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("Campo para ingresar el correo electronico").located(By.id("email"));
    public static final Target LISTA_MES = Target.the("Campo para seleccionar mes de nacimiento").located(By.id("birthMonth"));
    public static final Target LISTA_DIA = Target.the("Campo para seleccionar dia de nacimiento").located(By.id("birthDay"));
    public static final Target LISTA_AÑO = Target.the("Campo para seleccionar año de nacimiento").located(By.id("birthYear"));
    public static final Target BOTON_SIGUIENTE_1 = Target.the("Boton para pasar a siguiente pagina").located(By.xpath("//*[contains(text(),'Next: Location')])"));

}


