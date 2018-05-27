package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit lead which is already exist";
		testNodes="Edit Lead";
		category="Sanity";
		authors="Raviprasath";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fName,String data,String verify) {
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
		.clickEditOption()
		.enterDescription(data)
		.clickUpdate()
		.verifyFName(verify);
	}

}
