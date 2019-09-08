package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		// tags = {"@Test"},
		// dryRun = false,
		monochrome = true,
		// strict = true,
		features = ".//src/test/resources/features", glue = { "stepDefinitions" }
// plugin = {"pretty", "html:target/cucumber-reports",
// "json:target/cucumber-reports/Cucumber.json"}

)

public class testRunner {

}
