package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@RegistrationForm",
		      
              plugin = {"pretty", "html:target/cucumber-html-report",
        "json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
           glue = "com.automation.steps",
        dryRun = false,
          
        features = "src/test/java/features/")
public class TestRunner {

}
