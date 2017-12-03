package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("Find Leads | opentaps CRM")) {
			reportStep("this is not My Leads Page", "FAIL");
		}
	}

	@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;

	public FindLeadsPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;

	public FindLeadsPage clickFindLeadButton() {
		click(eleFindLeadsButton);
		return new FindLeadsPage(driver, test);
	}

	@FindBy(how = How.LINK_TEXT, using = "Phone")
	private WebElement elePhone;

	public FindLeadsPage clickPhone() {
		click(elePhone);
		return this;
	}

	@FindBy(how = How.NAME, using = "phoneNumber")
	private WebElement elePhoneNumber;

	public FindLeadsPage enterPhoneNumber(String phNo) {
		type(elePhoneNumber, phNo);
		return this;
	}
	
	
	@FindBy(how = How.LINK_TEXT, using = "Email")
	private WebElement eleEmail;

	public FindLeadsPage clickEmail() {
		click(eleEmail);
		return this;
	}

	@FindBy(how = How.NAME, using = "emailAddress")
	private WebElement eleEmailId;

	public FindLeadsPage enterEmail(String eMail) {
		type(eleEmailId, eMail);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "id")
	private WebElement eleFromLeadId;

	public FindLeadsPage enterFromLeadId(String fromLeadId) {
		type(eleFromLeadId, fromLeadId);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstLeadId;
	static String leadId;

	public FindLeadsPage getLeadId() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		leadId = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement eleFirstLeadName;
	
	public FindLeadsPage getLeadName() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")));
		leadName = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		return this;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstLead;

	public ViewLeadPage clickOnFirstLead() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		clickWithNoSnap(eleFirstLead);
		return new ViewLeadPage(driver, test);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='id']")
	private WebElement eleLeadId;

	public FindLeadsPage enterCapturedLeadId() {
		type(eleLeadId, leadId);
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "x-paging-info")
	private WebElement eleError;

	public FindLeadsPage verifyError() {
		verifyExactText(eleError, "No records to display");
		return this;
	}

}
