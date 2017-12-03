package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_CreateLead";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Create New LeadS";
		category= "smoke";
		authors	="RohithNaresh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, String cName, String fName, String lName) {
		

		
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
		.clickSubmitCreateLead()
		.verifyFirstName(fName)
		;
	}
}
