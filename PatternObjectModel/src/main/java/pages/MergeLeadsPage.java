package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {

	public MergeLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("Merge Leads | opentaps CRM")) {
			reportStep("this is not My Home Page", "FAIL");
		}
	}

	@FindBy(how = How.XPATH, using = "//img[@src='/images/fieldlookup.gif']")
	private WebElement eleFromLeadIcon;

	public FindLeadsPopUpPage clickFromLeadIcon() {
		click(eleFromLeadIcon);
		switchToWindow(1);
		return new FindLeadsPopUpPage(driver, test);
	}
		
		
	@FindBy(how = How.XPATH, using = "(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLeadIcon;

	public FindLeadsPopUpPage clickToLeadIcon() {
		click(eleToLeadIcon);
		switchToWindow(1);
		return new FindLeadsPopUpPage(driver, test);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Merge")
	private WebElement eleMergeButton;

	public ViewLeadPage clickMergeButton() {
		click(eleMergeButton);
		acceptAlert();
		return new ViewLeadPage(driver, test);		
	}
		
}
