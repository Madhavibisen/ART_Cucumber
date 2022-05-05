package stepdefinitions;

import utility.TakeSS;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks {

ExtentReports report = null;
ExtentTest test = null;

/*
* In Before hooks, we will get ExtentReports Class instance which was created
* in HomeageSD class. and invoke startTest method of ExtentReports class in
* order to start test and keep details in Extent report
*
* NOTE :- Scenario class contains all information about the Scenario which has
* been executed recently.
*/
@Before
public void beforeRunScenario(Scenario s) {

report = MotorInsureNewPolicy_EnterDetails_EN.getExtentReportInstance();

test = report.startTest(s.getName());
}


/*
* In after hooks, we will take screenshot and will add info of particular
* scenario using logs.
*
* we will end test in after hooks which will be invoked after scenario
* execution
*/
@After
public void afterRunScenario(Scenario s) {
String path = TakeSS.getScreenShot(s);

if (s.getStatus() == Status.FAILED)
test.log(LogStatus.FAIL, test.addScreenCapture(path), s.getName() + " Scenario Failed");
else if (s.getStatus() == Status.PASSED)
test.log(LogStatus.PASS, test.addScreenCapture(path), s.getName() + " Scenario passed");

report.endTest(test);


}

}


