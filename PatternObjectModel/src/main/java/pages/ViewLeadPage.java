package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("this is not LogIn Page", "FAIL");
		}
	}

	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleVerifyLeadId;

	public ViewLeadPage verifyFirstName(String fName) {
		verifyPartialText(eleVerifyLeadId, fName);
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement eleEdit;

	public EditLeadPage clickEdit() {
		click(eleEdit);
		return new EditLeadPage(driver, test);
	}

	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	private WebElement eleVerifyCompanyName;

	public ViewLeadPage verifyCompanyName(String cName) {
		verifyPartialText(eleVerifyCompanyName, cName);
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement eleDelete;

	public MyLeadsPage clickDelete() {
		click(eleDelete);
		return new MyLeadsPage(driver, test);
	}

	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement eleDuplicateLead;

	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateLead);
		return new DuplicateLeadPage(driver, test);
	}

	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleLeadName;

	public ViewLeadPage verifyLeadName() {
		String leadNameFromFindLeads=leadName;
		verifyPartialText(eleLeadName, leadNameFromFindLeads);
		return this;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	private WebElement eleFindLeads;

	public FindLeadsPage clickFindLead() {
		click(eleFindLeads);
		return new  FindLeadsPage(driver, test);
	}

}
