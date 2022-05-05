package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import reusableComponent.WebDriverHelper;

import utility.ReadPropertyFile;
import com.relevantcodes.extentreports.ExtentReports;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MotorInsureNewPolicy_EN_Page;
import runner.CucumberRunner;

public class MotorInsureNewPolicy_EnterDetails_EN {
	static WebDriver driver;
	ReadPropertyFile rp = null;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	// MotorInsureNewPolicy_Page motorInsurance;

	MotorInsureNewPolicy_EN_Page motorInsureNewPolicy;

	@Given("Browser is open")
	public void Browser_is_open() throws Exception {
		log.info("<---------------------------Motor EN flow<---------------------------");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);
		WebDriverHelper.initializeDriver();
		driver = WebDriverHelper.getDriver();
		driver.manage().window().maximize();
		log.info("Browser opened sucessfully");

	}

	@When("User in home page")
	public void user_in_home_page() throws Exception {
		rp = new ReadPropertyFile();
		driver.get(rp.getUrl());
		// driver.navigate().to("https://dcp-dev.alrajhitakaful.com/en");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// project_Driver.navigate().to("https://testproject.io/");
		log.info("User in home page");

	}

	@Then("User click on the motor option")
	public void user_click_on_the_motor_option() throws Throwable {
		motorInsureNewPolicy = new MotorInsureNewPolicy_EN_Page(driver);
		motorInsureNewPolicy.clickMotorIcon();
		log.info("User clicked on the motor option");
	}

	@And("User navigate to Insure New Policy page")
	public void user_navigate_to_insure_new_policy_page() {
		log.info("User navigate to Insure New Policy page");

	}

	@Then("User navigate to Insure New Policy")
	public void user_navigate_to_insure_new_policy() {
		log.info("User navigate to Insure New Policy");

	}

	@Then("User enters the policies holder details.")
	public void user_enters_the_policies_holder_details() {
		log.info("User enters the policies holder details");

	}

	@Then("User enter NID as {string}")
	public void user_enter_nid_as(String nationalid) {
		motorInsureNewPolicy.enterNationalID(nationalid);
		log.info("User entered the NID as" + " " + nationalid);

	}

	@Then("User enter dob as {string}")
	public void user_enter_dob_as(String dateofbirth) throws Throwable {
		motorInsureNewPolicy.enterdateOfBirth(dateofbirth);
		log.info("User entered the dob as" + " " + dateofbirth);

	}

	@Then("User enter mobile as {string}")
	public void user_enter_mobile_as(String mobilenumber) throws Throwable {
		motorInsureNewPolicy.entermobileNumber(mobilenumber);
		log.info("User entered the mobile number as" + " " + mobilenumber);

	}

	@Then("User enter email as {string}")
	public void user_enter_email_as(String emailid) throws Throwable {
		motorInsureNewPolicy.enteremailId(emailid);
		log.info("User entered the email as" + " " + emailid);

	}

	@And("^User enter sequence as \"([^\"]*)\"$")
	public void user_enter_sequence_as_something(String sequencenumber) throws Throwable {
		motorInsureNewPolicy.entersequenceNumber(sequencenumber);
		log.info("User entered the sequence number as" + " " + sequencenumber);

	}

	@And("^User enter the policy date as \"([^\"]*)\"$")
	public void user_enter_the_policy_date_as_something(String enterpolicyDate) throws Throwable {
		motorInsureNewPolicy.enterpolicyDate(enterpolicyDate);
		log.info("User entered the policies date as" + " " + enterpolicyDate);

	}

	@When("^report get generated$")
	public void report_get_generated() throws Throwable {
		report.flush();
		log.info("Report gets generated");

	}

	public static ExtentReports getExtentReportInstance() {
		return report;
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
