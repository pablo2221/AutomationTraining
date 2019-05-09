import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "specDef",
        plugin = {"html:reports/cucumber-reports", "json:reports/cucumber.json"} /*se creo desde el proyecto un directory llamado reports*/
)

public class cucumberRunner {



}
