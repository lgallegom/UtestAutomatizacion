package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UtestPaginaDatosDeUbicacion extends PageObject {
    public static final Target CAMPO_CIUDAD= Target.the("Campo para ingresar la ciudad").located(By.id("city"));
    public static final Target CAMPO_CODIGO_POSTAL = Target.the("Campo para ingresar el codigo postal").located(By.id("zip"));
    public static final Target CAMPO_PAIS = Target.the("Campo para ingresar el pais").located(By.id("//*[@class='ui-select-match-text pull-left']"));
    public static final Target BOTON_SIGUIENTE_2 = Target.the("Boton para pasar a siguiente pagina").located(By.xpath("//*[contains(text(),'Next: Devices')])"));
}
