package PaypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class Signup extends SeMethods{
	
	public Signup() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="radio-personal")
	private WebElement radioButton;

	public Signup selectRadioButton() {
		if(radioButton.isSelected())
			System.out.println("Shoppers radio button selected");
		else click(radioButton);
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNextButton;

	public SignupDetails clickNextButton() {
		click(eleNextButton);
		return new SignupDetails();
	}

}
