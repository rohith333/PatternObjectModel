package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("My Leads | opentaps CRM")) {
			reportStep("this is not My Leads Page", "FAIL");
		}
	}

	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement eleCreateLead;

	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage(driver, test);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	private WebElement eleFindLeads;

	public FindLeadsPage clickFindLead() {
		click(eleFindLeads);
		return new  FindLeadsPage(driver, test);
	}
		
	@FindBy(how = How.LINK_TEXT, using = "Merge Leads")
	private WebElement eleMergeLeads;

	public MergeLeadsPage clickMergeLeads() {
		click(eleMergeLeads);
		return new  MergeLeadsPage(driver, test);
	}
	
}
