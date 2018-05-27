package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID , using="viewLead_firstName_sp")
	private WebElement eleFirstname;

	public ViewLeadPage verifyFName(String Verify) {
		verifyExactText(eleFirstname, Verify);
		return this;	
	}
	
	@FindBy(how = How.XPATH, using="(//a[@class='subMenuButton'])[3]")
	private WebElement eleEditOption;
	
	public EditLeadPage clickEditOption() {
		click(eleEditOption);
		return new EditLeadPage();
	}
	
	@FindBy(how = How.XPATH, using="(//div[@class='frameSectionExtra']/a)[4]")
	private WebElement eleDeleteOption;
	
	public MyLeadPage clickDeleteOption() {
		click(eleDeleteOption);
		return new MyLeadPage();
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='frameSectionExtra']/a)[1]")
	private WebElement eleDuplicateLead;
	
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateLead);
		return new DuplicateLeadPage();
	}
}
