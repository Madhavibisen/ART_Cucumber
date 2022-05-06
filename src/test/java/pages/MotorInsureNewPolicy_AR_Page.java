package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotorInsureNewPolicy_AR_Page {

	WebDriver project_Driver;
	
	
	@FindBy(xpath = "//a[contains(text(),'عربي')]")
	WebElement txt_Arabic_hyperlink;

	@FindBy(xpath = "//*[@class='productName']")
	WebElement txt_MotorJourney_AR;

	@FindBy(xpath = "//*[@formcontrolname='NatIdNumber']")
	WebElement txt_National_Id;

	@FindBy(xpath = "//*[@placeholder='DD-MM-YYYY']")
	WebElement txt_date_Of_Birth;

	@FindBy(xpath = "//*[@formcontrolname='MobileNumber']")
	WebElement txt_mobileNumber;

	@FindBy(xpath = "//*[@formcontrolname='EmailAddress']")
	WebElement txt_emailId;

	@FindBy(xpath = "//*[@formcontrolname='sequenceNumber']")
	WebElement txt_sequenceNumber;

	@FindBy(xpath = "//*[@placeholder='سنة - شهر - يوم']")
	WebElement txt_policyStartDate;

	public MotorInsureNewPolicy_AR_Page(WebDriver project_Driver) {
		this.project_Driver = project_Driver;
		PageFactory.initElements(project_Driver, this);

	}

	public void clickArabiclink() throws InterruptedException {
		Thread.sleep(3000);
		txt_Arabic_hyperlink.click();

	}
	public void clickMotorIcon() throws Throwable {
		Thread.sleep(3000);
		// txt_MotorJourney_AR.click();
		JavascriptExecutor JSE = (JavascriptExecutor) project_Driver;
		JSE.executeScript("arguments[0].click()", txt_MotorJourney_AR);

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
