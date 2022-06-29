package co.com.proyecto.prueba.demoblaze.stepdefinitions;

import co.com.proyecto.prueba.demoblaze.tasks.LogIn;
import co.com.proyecto.prueba.demoblaze.tasks.OpenUp;
import co.com.proyecto.prueba.demoblaze.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DomeBlazeStepDefinitions {

    //prepara el escenario para el actor
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    //OPEN NAVEGADOR
    @Given("^dado que el usuario ingresa a domeblaze$")
    public void dadoQueElUsuarioIngresaADomeblaze() throws Exception {
        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.thePage());
    }
    //SCENARIO 1
    @When("^ingresa los datos del usuario a crear$")
    public void ingresaLosDatosDelUsuarioACrear() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.register());
    }

    @Then("^obtengo respuesta de mi usuario creado$")
    public void obtengoRespuestaDeMiUsuarioCreado() throws Exception {

    }

    //SCENARIO 2
    @When("^ingresa los datos del usuario a loguearse$")
    public void ingresaLosDatosDelUsuarioALoguearse() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LogIn.login());
    }

    @Then("^obtengo respuesta de mi usuario logueado$")
    public void obtengoRespuestaDeMiUsuarioLogueado() throws Exception {

    }
}
