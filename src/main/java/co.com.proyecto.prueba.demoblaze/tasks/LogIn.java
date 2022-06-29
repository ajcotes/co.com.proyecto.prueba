package co.com.proyecto.prueba.demoblaze.tasks;

import co.com.proyecto.prueba.demoblaze.userinterface.LogInPage;
import co.com.proyecto.prueba.demoblaze.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task {

    public static LogIn login() {
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LogInPage.LOG_IN),
                Enter.theValue("anibalesi").into(LogInPage.TEXT_USER),
                Enter.theValue("anibal159").into(LogInPage.TEXT_PASSWORD),
                Click.on(LogInPage.CLICk_LOGIN)

        );
    }
}
