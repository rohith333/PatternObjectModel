package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006_DeleteLead";
		testCaseName = "TC006_DeleteLead";
		testDescription = "To delete the exisiting lead";
		category= "smoke";
		authors	="RohithNaresh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, String phNo) {
		
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.clickPhone()
		.enterPhoneNumber(phNo)
		.clickFindLeadButton()
		.getLeadId()
		.clickOnFirstLead()
		.clickDelete()
		.clickFindLead()
		.enterCapturedLeadId()
		.clickFindLeadButton()
		.verifyError()
		;
		}
}
