package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPaginaContraseña extends PageObject {

    public static final Target CAMPO_CONTRASEÑA = Target.the("Campo para ingresar la contraseña").located(By.id("password"));
    public static final Target CAMPO_CONFIRMAR_CONTRASEÑA = Target.the("Campo para confirmar la contraseña").located(By.id("confirmPassword"));
    public static final Target BOTON_TERMINOS_USO = Target.the("Casilla para aceptar terminos de uso").located(By.xpath("//*[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target BOTON_POLITICA_SEGURIDAD = Target.the("Casilla para aceptar politicas de seguridad").located(By.xpath("//*[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));
    public static final Target BOTON_COMPLETAR = Target.the("Boton para finalizar registro").located(By.xpath("//*[contains(text(),'Complete Setup')])"));

}
