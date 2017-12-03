package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("My Home | opentaps CRM")) {
			reportStep("this is not My Home Page", "FAIL");
		}
	}

	@FindBy(how = How.LINK_TEXT, using = "Leads")
	private WebElement eleLeads;

	public MyLeadsPage clickLeads() {
		click(eleLeads);
		return new MyLeadsPage(driver, test);
	}
}
