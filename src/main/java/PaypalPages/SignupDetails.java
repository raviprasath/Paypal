package PaypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class SignupDetails extends SeMethods{
	
	public SignupDetails() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="country")
	private WebElement eleCountry;

	public SignupDetails selectCountry(String text) {
		selectDropDownUsingText(eleCountry, text);
		return this;
	}

	@FindBy(how=How.ID,using="email")
	private WebElement eleEmail;

	public SignupDetails enterEmail(String text) {
		selectDropDownUsingText(eleEmail, text);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;

	public SignupDetails enterPassword(String text) {
		type(elePassword, text);
		return this;
	}
	
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement eleRePassword;

	public SignupDetails enterRePassword(String text) {
		type(eleRePassword, text);
		return this;
	}

	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement eleContinue;

	public SignupDetails clickContinue() {
		click(eleContinue);
		return this;
	}
}
