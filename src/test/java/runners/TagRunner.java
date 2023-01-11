package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


// Sadece @smoke tagine sahip olan senaryolari calistiran runner
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/01_Tags.feature",
        glue = "stepdefinitions",
        tags ="@smoke or @regression" ,
        dryRun = false
)

public class TagRunner {


}
