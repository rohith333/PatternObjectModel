package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DuplicateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC007_DuplicateLead";
		testCaseName = "TC007_DuplicateLead";
		testDescription = "To duplicate the exisiting lead";
		category= "smoke";
		authors	="RohithNaresh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String passWord, String eMail) {
	
		
		
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.clickEmail()
		.enterEmail(eMail)
		.clickFindLeadButton()
		.getLeadName()
		.clickOnFirstLead()
		.clickDuplicateLead()
		.clickDuplicateLeadCreate()
		.verifyLeadName()
		;
		}
}
