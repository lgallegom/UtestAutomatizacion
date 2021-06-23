package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPaginaDatosDispositivos extends PageObject {

    public static final Target CAMPO_COMPUTADOR = Target.the("Campo para ingresar Sistema operativo del computador").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target CAMPO_VERSION = Target.the("Campo para ingresar version del sistema operativo del computador").located(By.xpath("//*[@id='web-device'']/div[2]/div[2]/div/input[1]"));
    public static final Target CAMPO_IDIOMA = Target.the("Campo para ingresar idioma del computador").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target CAMPO_MOVIL = Target.the("Campo para ingresar marca del movil").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target CAMPO_MODELO = Target.the("Campo para ingresar modelo del movil").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target CAMPO_SO_MOVIL = Target.the("Campo para ingresar el sistema operativo del movil").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target BOTON_SIGUIENTE_3 = Target.the("Boton para pasar a la siguiente pagina").located(By.xpath("//*[contains(text(),'Next: Last Step')])"));

}
