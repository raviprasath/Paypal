package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PaypalPages.PaypalHome;
import wdMethods.ProjectMethods;

public class TC007_PaypalSignup extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC007_PaypalSignup";
		testDescription="Create a new Paypal account";
		testNodes="Leads";
		category="Smoke";
		authors="Ravi";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void paypalSignup(String text, String text1, String text2, String text3) {
		
		new PaypalHome()
		.clickSignUp()
		.selectRadioButton()
		.clickNextButton()
		.selectCountry(text)
		.enterEmail(text1)
		.enterPassword(text2)
		.enterRePassword(text3)
		.clickContinue();
	}


}
