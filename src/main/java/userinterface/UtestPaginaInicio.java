package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com")
public class UtestPaginaInicio extends PageObject {

    public static final Target BOTON_REGISTRO =Target.the("Seleccionar el boton de registro").
            located(By.xpath("//div//a[@class='unauthenticated-nav-bar__sign-up']"));

}
