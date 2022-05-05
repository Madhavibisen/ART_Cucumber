package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="./features",
glue= {"stepdefinitions"},

//tags = "@Smoke",
//tags = {"@smoke"},
plugin = {"io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"})

public class CucumberRunner{
//public class CucumberRunner extends AbstractTestNGCucumberTests{		

}
