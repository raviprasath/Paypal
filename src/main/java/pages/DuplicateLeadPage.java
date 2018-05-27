package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {

	public DuplicateLeadPage() {
PageFactory.initElements(driver, this);		
	}

	@FindBy(how = How.XPATH, using = "//div[@class='fieldgroup-body']/table/tbody/tr[24]/td[2]/input")
	private WebElement eleCreateLead;
	
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}
}
