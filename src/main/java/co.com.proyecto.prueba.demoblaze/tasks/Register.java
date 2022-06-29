package co.com.proyecto.prueba.demoblaze.tasks;

import co.com.proyecto.prueba.demoblaze.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    public static Register register() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterPage.SING_UP),
                Enter.theValue("anibalesi").into(RegisterPage.TEXT_USER),
                Enter.theValue("anibal159").into(RegisterPage.TEXT_PASSWORD),
                Click.on(RegisterPage.CLICk_USER)

        );
    }
}
