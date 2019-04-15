package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
	features = {"src/test/java/daviesTest/FeatureFiles/CreateAccount.feature",
			"src/test/java/daviesTest/FeatureFiles/Registration.feature",
			"src/test/java/daviesTest/FeatureFiles/Cart.feature"},
	
	glue = {"daviesTest.StepFiles"},
	monochrome = true,
	tags = {"@cart"},
	plugin = {"pretty", "html:target/cucumber", 
			"json:target/cucumber.json", 
			"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
	}
)
public class Runner {

}
