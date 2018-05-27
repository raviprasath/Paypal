package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DuplicateLead";
		testDescription="Duplicate lead which is already exist";
		testNodes="Duplicate Lead";
		category="Sanity";
		authors="Raviprasath";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fName,String verify) {
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
		.clickDuplicateLead()
		.clickCreateLead()
		.verifyFName(verify);
		}

}
