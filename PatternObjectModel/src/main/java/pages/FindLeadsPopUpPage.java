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

public class FindLeadsPopUpPage extends ProjectMethods {

	public FindLeadsPopUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("Find Leads")) {
			reportStep("this is not My Leads Page", "FAIL");
		}
	}

	@FindBy(how = How.NAME, using = "id")
	private WebElement eleFromLeadId;

	public FindLeadsPopUpPage enterFromLeadId(String fromLeadId) {
		type(eleFromLeadId, fromLeadId);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;

	public FindLeadsPopUpPage clickFindLeadButton() {
		click(eleFindLeadsButton);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "id")
	private WebElement eleToLeadId;

	public FindLeadsPopUpPage enterToLeadId(String toLeadId) {
		type(eleToLeadId, toLeadId);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstLeadId;

	public MergeLeadsPage clickFirstLeadId() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		clickWithNoSnap(eleFirstLeadId);
		switchToWindow(0);
		return new MergeLeadsPage(driver, test);
	}
}
