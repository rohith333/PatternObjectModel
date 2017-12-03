package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("opentaps CRM")) {
			reportStep("this is not LogIn Page", "FAIL");
		}
	}
	
	
	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	private WebElement eleCompanyName;

	public EditLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@class='smallSubmit']")
	private WebElement eleUpdate;

	public ViewLeadPage clickUpdateButton() {
		click(eleUpdate);
		return new ViewLeadPage(driver,test);
	}
	
	
}
