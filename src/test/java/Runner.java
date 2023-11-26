import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/java/arquivoTeste.feature", tags = "@tag", glue = "resorces/stepDefinitions")
public class Runner {

}


