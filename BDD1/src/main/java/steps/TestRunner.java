package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = "steps",monochrome = true,

plugin={"pretty","junit:target/htmlReport.xml"})
public class TestRunner {
	

}
