package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_CreateLeadFull extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004_CreateLead";
		testCaseName = "TC004_CreateLead";
		testDescription = "To Create New Lead";
		category= "smoke";
		authors	="RohithNaresh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadFull(String userName, String passWord, String cName, String fName, String lName,
			String fNameLocal, String lNameLocal, String salutation, String source, String title, 
			String aRevenue, String industry, String ownership, String sidCode, String desc, String impNotice,
			String countryCode, String areaCode, String extn, String dept, String prefCurrency, String noOfEmps,
			String tickerSymbol, String personToAskFor,	String webUrl, String toName, String addLine1, 
			String addLine2, String city, String state, String country,	String zipCode, String zipCodeExtn,
			String mrktCampaign, String phNo, String emailAdd) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterFirstNameLocal(fNameLocal)
		.enterLastNameLocal(lNameLocal)
		.enterSalutation(salutation)
		.chooseSource(source)
		.enterTitle(title)
		.enterAnnualRevenue(aRevenue)
		.chooseIndustry(industry)
		.chooseOwnership(ownership)
		.enterSidCoude(sidCode)
		.enterDescription(desc)
		.enterImportantNotice(impNotice)
		.enterCountryCode(countryCode)
		.enterAreaCode(areaCode)
		.enterExtension(extn)
		.enterDepartment(dept)
		.choosePrefferedCurrency(prefCurrency)
		.enterNoOfEmployees(noOfEmps)
		.enterTicketSymbol(tickerSymbol)
		.enterPersonToAskFor(personToAskFor)
		.enterWebUrl(webUrl)
		.enterToName(toName)
		.enterAddressLn1(addLine1)
		.enterAddressLn2(addLine2)
		.enterCity(city)
		.chooseState(state)
		.chooseCountry(country)
		.enterZipCode(zipCode)
		.enterZipCodeExtn(zipCodeExtn)
		.chooseMarketingCampaign(mrktCampaign)
		.enterPhoneNo(phNo)
		.enterEmailAddress(emailAdd)
		.clickSubmitCreateLead()
		.verifyFirstName(fName)
		;
	}
}
