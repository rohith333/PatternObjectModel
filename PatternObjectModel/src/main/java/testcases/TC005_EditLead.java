package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_EditLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005_EditLead";
		testCaseName = "TC005_EditLead";
		testDescription = "To edit exisiting lead details";
		category= "smoke";
		authors	="RohithNaresh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, String fName, String cName) {

		
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(fName)
		.clickFindLeadButton()
		.clickOnFirstLead()
		.clickEdit()
		.enterCompanyName(cName)
		.clickUpdateButton()
		.verifyCompanyName(cName)
		;
		}
}
