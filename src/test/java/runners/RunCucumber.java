package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "C:\\Users\\Matheus\\Desktop\\TestAmazon\\src\\test\\resources\\features",
        tags = {"~@ignore"},
        glue = {"steps"}


)

public class RunCucumber {
}
