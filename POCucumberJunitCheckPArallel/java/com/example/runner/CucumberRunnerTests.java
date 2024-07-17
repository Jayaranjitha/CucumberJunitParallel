import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@TestRun", features = "src/test/resources/features/LoginPage.feature", glue = "com.example.definitions",
                 plugin = {})

public class CucumberRunnerTests {

}