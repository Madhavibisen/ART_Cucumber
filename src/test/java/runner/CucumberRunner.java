package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./features", glue = { "stepdefinitions" }, tags = "@smoke or @regression"
// plugin =
// {"io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"}
)
//public class CucumberRunner{
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
