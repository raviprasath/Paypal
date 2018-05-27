package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{

		@BeforeTest
		public void setData() {
			testCaseName="TC003_CreateLead";
			testDescription="Create a new lead";
			testNodes="Leads";
			category="Smoke";
			authors="Ravi";
			browserName="chrome";
			dataSheetName="TC003";
		}
		@Test(dataProvider="fetchData")
		public void loginAndLogout(String uName,String pwd,String CompanyName,String fName, String lName,String Verify) {
			
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads()
			.clickCreateLead()
			.enterCompanyName(CompanyName)
			.enterFirstName(fName)
			.enterLastName(lName)
			.clickCreateLead()
			.verifyFName(Verify);

		}


	}
