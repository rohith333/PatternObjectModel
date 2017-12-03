package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC008_MergeLeads extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC008_MergeLeads";
		testCaseName = "TC008_MergeLeads";
		testDescription = "To merge two exisiting leads";
		category= "smoke";
		authors	="RohithNaresh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName, String passWord, String fromLeadId, String toLeadId) {
		
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.enterFromLeadId(fromLeadId)
		.clickFindLeadButton()
		.clickFirstLeadId()
		.clickToLeadIcon()
		.enterToLeadId(toLeadId)
		.clickFindLeadButton()
		.clickFirstLeadId()
		.clickMergeButton()
		.clickFindLead()
		.enterFromLeadId(fromLeadId)
		.clickFindLeadButton()
		.verifyError()
		;
		}
}
