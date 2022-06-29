package co.com.proyecto.prueba.demoblaze.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage extends PageObject {

    //ir a LogIn
    public static final Target LOG_IN = Target.the("Dar Click en Log In")
            .located(By.xpath("//*[@id=\"login2\"]"));
    //llenar los campo user
    public static final Target TEXT_USER = Target.the("Ingresar Usuario")
            .located(By.xpath("//*[@id=\"loginusername\"]"));
    //llenar los campo password
    public static final Target TEXT_PASSWORD = Target.the("Ingresar password")
            .located(By.xpath("//*[@id=\"loginpassword\"]"));
    //dar click
    public static final Target CLICk_LOGIN = Target.the("dar click en crear cuenta")
            .located(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
}
