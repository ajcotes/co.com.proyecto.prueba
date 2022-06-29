package co.com.proyecto.prueba.demoblaze.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static java.time.temporal.ChronoUnit.SECONDS;

public class RegisterPage extends PageObject {

    //ir a registrarse
    public static final Target SING_UP = Target.the("Dar Click en Sing Up")
            .located(By.xpath("//*[@id=\"signin2\"]"));
    //llenar los campo user
    public static final Target TEXT_USER = Target.the("Ingresar Usuario")
            .located(By.xpath("//*[@id=\"sign-username\"]"));
    //llenar los campo password
    public static final Target TEXT_PASSWORD = Target.the("Ingresar password")
            .located(By.xpath("//*[@id=\"sign-password\"]"));
    //clic crear user
    public static final Target CLICk_USER = Target.the("dar click en crear cuenta")
            .located(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));

    public void aceptarPopup(){
        getDriver().switchTo().alert().accept();
    }

}
