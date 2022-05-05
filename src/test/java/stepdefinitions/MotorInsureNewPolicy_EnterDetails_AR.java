package stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MotorInsureNewPolicy_AR_Page;
import runner.CucumberRunner;
import utility.ReadPropertyFile;

public class MotorInsureNewPolicy_EnterDetails_AR {
	static WebDriver driver;
	ReadPropertyFile rp = null;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());

	// MotorInsureNewPolicy_Page motorInsurance;

	MotorInsureNewPolicy_AR_Page motorInsureNewPolicy;

	@Given("getting Browser from the previous page.")
	public void getting_browser_from_the_previous_page() {
		log.info("<---------------------------Motor AR flow<---------------------------");

		driver = MotorInsureNewPolicy_EnterDetails_EN.getDriver();
		driver.manage().window().maximize();
		log.info("Getting driver from the previous page");
	}

	@When("^URL is hitted$")
	public void url_is_hitted() throws Throwable {
		rp = new ReadPropertyFile();
		driver.get(rp.getUrl());
		log.info("User in home page");

	}

	@And("^user clicks on the Aabic language hyperlink$")
	public void user_clicks_on_the_aabic_language_hyperlink() throws Throwable {
		motorInsureNewPolicy = new MotorInsureNewPolicy_AR_Page(driver);
		motorInsureNewPolicy.clickArabiclink();
		log.info("user clicks on the Aabic language hyperlink");
	}

	@Then("^user clicks on the motor product$")
	public void user_clicks_on_the_motor_product() throws Throwable {
		motorInsureNewPolicy.clickMotorIcon();
		log.info("user clicks on the motor product");
	}

	@And("^user navigates the to Insure New Policy pages$")
	public void user_navigates_the_to_insure_new_policy_pages() throws Throwable {
		log.info("user navigates the to Insure New Policy pages");

	}

	@Then("^user navigates to the Insure New Policy$")
	public void user_navigates_to_the_insure_new_policy() throws Throwable {
		log.info("User navigate to Insure New Policy");

	}

	@Then("user start entering the policies holder details.")
	public void user_start_entering_the_policies_holder_details() {
		log.info("User enters the policies holder details");

	}

	@And("^user enters National ID as \"([^\"]*)\"$")
	public void user_enters_national_id_as_something(String nationalid) throws Throwable {
		motorInsureNewPolicy.enterNationalID(nationalid);
		log.info("User entered the NID as" + " " + nationalid);
	}

	@Then("^user enters date of birth as \"([^\"]*)\"$")
	public void user_enters_date_of_birth_as_something(String dateofbirth) throws Throwable {
		motorInsureNewPolicy.enterdateOfBirth(dateofbirth);
		log.info("User entered the dob as" + " " + dateofbirth);
	}

	@Then("^user enters mobile number as \"([^\"]*)\"$")
	public void user_enters_mobile_number_as_something(String mobilenumber) throws Throwable {
		motorInsureNewPolicy.entermobileNumber(mobilenumber);
		log.info("User entered the mobile number as" + " " + mobilenumber);
	}

	@And("^user enters email ID as \"([^\"]*)\"$")
	public void user_enters_email_id_as_something(String emailid) throws Throwable {
		motorInsureNewPolicy.enteremailId(emailid);
		log.info("User entered the email as" + " " + emailid);
	}

	@And("^user enters sequence number as \"([^\"]*)\"$")
	public void user_enters_sequence_number_as_something(String sequencenumber) throws Throwable {
		motorInsureNewPolicy.entersequenceNumber(sequencenumber);
		log.info("User entered the sequence number as" + " " + sequencenumber);
	}

	@And("^user enters the policy date as \"([^\"]*)\"$")
	public void user_enters_the_policy_date_as_something(String policystartdate) throws Throwable {
		motorInsureNewPolicy.enterpolicyDate(policystartdate);
		log.info("User entered the policie date as" + " " + policystartdate);
	}

//	@When("^report get generated$")
//	public void report_get_generated() throws Throwable {
//		report.flush();
//		log.info("Report gets generated");
//
//	}

	public static ExtentReports getExtentReportInstance() {
		return report;
	}
}
