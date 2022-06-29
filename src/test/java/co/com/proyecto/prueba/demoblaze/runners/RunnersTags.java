package co.com.proyecto.prueba.demoblaze.runners;


//importaciones
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//run  que corre la clase
@RunWith(CucumberWithSerenity.class)

//parametros en donde esta ubicado el archivo cucumber, escenarios y epicas y eso,
// y la ubicacion donde se guardaran
@CucumberOptions (
        features = "src/test/resources/features/demoblaze.feature",
        tags = "@HU01",
        glue = "co/com/proyecto/prueba/demoblaze/stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnersTags {
}
