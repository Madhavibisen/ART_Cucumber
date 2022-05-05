package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotorInsureNewPolicy_EN_Page {

	WebDriver project_Driver;

	@FindBy(xpath = "//*[@id = 'productTabs2']//child::div[text() = ' Motor ']//parent::div[starts-with(@class, 'product-widget')]")
	// CacheLookup
	WebElement icn_MotorJourney_AR;

	@FindBy(xpath = "//*[@placeholder='Enter National Id/Iqama ID']")
	WebElement txt_National_Id;

	@FindBy(xpath = "//*[@placeholder='DD-MM-YYYY']")
	WebElement txt_date_Of_Birth;

	@FindBy(xpath = "//*[@placeholder='5xxxxxxxx']")
	WebElement txt_mobileNumber;

	@FindBy(xpath = "//*[@placeholder='Enter email']")
	WebElement txt_emailId;

	@FindBy(xpath = "//*[@placeholder='Sequence Number']")
	WebElement txt_sequenceNumber;

	@FindBy(xpath = "//*[@placeholder='dd-mm-yyyy']")
	WebElement txt_policyStartDate;

	public MotorInsureNewPolicy_EN_Page(WebDriver project_Driver) {
		this.project_Driver = project_Driver;
		PageFactory.initElements(project_Driver, this);

	}

	public void clickMotorIcon() throws Throwable {
		Thread.sleep(3000);
		System.out.println("Here in click Motor Icon");
		// icn_MotorJourney_AR.click();
		JavascriptExecutor JSE = (JavascriptExecutor) project_Driver;
		JSE.executeScript("arguments[0].click()", icn_MotorJourney_AR);

	}

	// @FindBy(id-some)
	// WebElement txt_nationalID;
	public void enterNationalID(String nationalID) {
		txt_National_Id.sendKeys(nationalID);

	}

	public void enterdateOfBirth(String dateofbirth) throws Throwable {
		Thread.sleep(2000);
		txt_date_Of_Birth.sendKeys(dateofbirth);
	}

	public void entermobileNumber(String mobilenumber) throws Throwable {
		Thread.sleep(2000);
		txt_mobileNumber.sendKeys(mobilenumber);
	}

	public void enteremailId(String emailid) throws Throwable {
		Thread.sleep(2000);
		txt_emailId.sendKeys(emailid);
	}

	public void entersequenceNumber(String sequencenumber) throws Throwable {
		Thread.sleep(2000);
		txt_sequenceNumber.sendKeys(sequencenumber);
	}

	public void enterpolicyDate(String policystartdate) throws Throwable {
		Thread.sleep(2000);
		txt_policyStartDate.sendKeys(policystartdate);
	}

}
