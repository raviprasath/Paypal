package PaypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class PaypalHome extends SeMethods {
	public PaypalHome() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="signup-button")
	private WebElement eleSignUp;

	public Signup clickSignUp() {
		click(eleSignUp);
		return new Signup();
	}

}
