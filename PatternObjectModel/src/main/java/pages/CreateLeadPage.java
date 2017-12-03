package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("this is not Create Lead Page", "FAIL");
		}
	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompName;

	public CreateLeadPage enterCompName(String cName) {
		type(eleCompName, cName);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;

	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_firstNameLocal")
	private WebElement eleFirstNameLocal;

	public CreateLeadPage enterFirstNameLocal(String fNameLocal) {
		type(eleFirstNameLocal, fNameLocal);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_lastNameLocal")
	private WebElement eleLastNameLocal;

	public CreateLeadPage enterLastNameLocal(String lNameLocal) {
		type(eleLastNameLocal, lNameLocal);
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "createLeadForm_personalTitle")
	private WebElement eleSaluation;

	public CreateLeadPage enterSalutation(String salutation) {
		type(eleSaluation, salutation);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_dataSourceId")
	private WebElement eleSource;

	public CreateLeadPage chooseSource(String source) {
		selectDropDownUsingText(eleSource, source);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalProfTitle")
	private WebElement eleTitle;

	public CreateLeadPage enterTitle(String title){
		type(eleTitle, title);
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "createLeadForm_annualRevenue")
	private WebElement eleARevenue;

	public CreateLeadPage enterAnnualRevenue(String aRevenue){
		type(eleARevenue, aRevenue);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_industryEnumId")
	private WebElement eleIndustry;

	public CreateLeadPage chooseIndustry(String industry){
		selectDropDownUsingText(eleIndustry, industry);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_ownershipEnumId")
	private WebElement eleOwnership;

	public CreateLeadPage chooseOwnership(String ownership){
		selectDropDownUsingText(eleOwnership, ownership);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_sicCode")
	private WebElement eleSidCode;

	public CreateLeadPage enterSidCoude(String sidCode){
		type(eleSidCode, sidCode);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_description")
	private WebElement eleDesc;

	public CreateLeadPage enterDescription(String desc){
		type(eleDesc, desc);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_importantNote")
	private WebElement eleImpNotice;

	public CreateLeadPage enterImportantNotice(String impNotice){
		type(eleImpNotice, impNotice);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneCountryCode")
	private WebElement eleCountryCode;

	public CreateLeadPage enterCountryCode(String countryCode){
		type(eleCountryCode, countryCode);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAreaCode")
	private WebElement eleAreaCode;

	public CreateLeadPage enterAreaCode(String areaCode){
		type(eleAreaCode, areaCode);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneExtension")
	private WebElement eleExtn;

	public CreateLeadPage enterExtension(String extn){
		type(eleExtn, extn);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_departmentName")
	private WebElement eleDept;

	public CreateLeadPage enterDepartment(String dept){
		type(eleDept, dept);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_currencyUomId")
	private WebElement elePrefCurrency;

	public CreateLeadPage choosePrefferedCurrency(String prefCurrency){
		selectDropDownUsingText(elePrefCurrency, prefCurrency);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_numberEmployees")
	private WebElement eleNoOfEmps;

	public CreateLeadPage enterNoOfEmployees(String noOfEmps){
		type(eleNoOfEmps, noOfEmps);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_tickerSymbol")
	private WebElement eleTickerSymbol;

	public CreateLeadPage enterTicketSymbol(String tickerSymbol){
		type(eleTickerSymbol, tickerSymbol);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAskForName")
	private WebElement elePersonToAskFor;

	public CreateLeadPage enterPersonToAskFor(String personToAskFor){
		type(elePersonToAskFor, personToAskFor);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryWebUrl")
	private WebElement eleWebUrl;

	public CreateLeadPage enterWebUrl(String webUrl){
		type(eleWebUrl, webUrl);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_generalToName")
	private WebElement eleToName;

	public CreateLeadPage enterToName(String toName){
		type(eleToName, toName);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_generalAddress1")
	private WebElement eleAddLine1;

	public CreateLeadPage enterAddressLn1(String addLine1){
		type(eleAddLine1, addLine1);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_generalAddress2")
	private WebElement eleAddLine2;

	public CreateLeadPage enterAddressLn2(String addLine2){
		type(eleAddLine2, addLine2);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_generalCity")
	private WebElement eleCity;

	public CreateLeadPage enterCity(String city){
		type(eleCity, city);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_generalStateProvinceGeoId")
	private WebElement eleState;

	public CreateLeadPage chooseState(String state){
		selectDropDownUsingText(eleState, state);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_generalCountryGeoId")
	private WebElement eleCountry;

	public CreateLeadPage chooseCountry(String country){
		selectDropDownUsingText(eleCountry, country);
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCode")
	private WebElement eleZipCode;

	public CreateLeadPage enterZipCode(String zipCode){
		type(eleZipCode, zipCode);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCodeExt")
	private WebElement eleZipCodeExtn;

	public CreateLeadPage enterZipCodeExtn(String zipCodeExtn){
		type(eleZipCodeExtn, zipCodeExtn);
		return this;
	}
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_marketingCampaignId")
	private WebElement eleMrktCampaign;

	public CreateLeadPage chooseMarketingCampaign(String mrktCampaign){
		selectDropDownUsingText(eleMrktCampaign, mrktCampaign);
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement elePhNo;

	public CreateLeadPage enterPhoneNo(String phNo){
		type(elePhNo, phNo);
		return this;
	}
	
	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement eleEmailAdd;

	public CreateLeadPage enterEmailAddress(String emailAdd){
		type(eleEmailAdd, emailAdd);
		return this;
	}
	
	
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement eleCreateLead;

	public ViewLeadPage clickSubmitCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage(driver, test);
	}
}
