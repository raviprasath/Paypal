package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "updateLeadForm_description")
	private WebElement eleDescription;
	
	public EditLeadPage enterDescription(String data2) {
		type(eleDescription, data2);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdate;
	
	public ViewLeadPage clickUpdate() {
		click(eleUpdate);
		return new ViewLeadPage();
	}
}
