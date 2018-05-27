package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DeleteLead";
		testDescription="Delete lead which is already exist";
		testNodes="Delete Lead";
		category="Sanity";
		authors="Raviprasath";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fName,String Verify) {
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogIn()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLead()
	.enterFirstName(fName)
	.clickFindLeadButton()
	.clickFirstToEdit()
	.clickDeleteOption()
	.clickFindLead()
	.enterFirstNameDelete()
	.clickFindLeadButton()
	.verifyFName(Verify);
	}

}
