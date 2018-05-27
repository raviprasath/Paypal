package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {

	public FindLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="(//div[@class='x-form-element']/input)[14]")
	private WebElement eleFirstName;
	
	public FindLeadPage enterFirstName(String data1) {
		type(eleFirstName, data1);
		return this;	
	}
	@FindBy(how = How.XPATH, using = "(//button[@class='x-btn-text'])[7]")
	private WebElement eleFindLead;

	public FindLeadPage clickFindLeadButton() {
		click(eleFindLead);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstOption;
	
	public String FirstID = getText(eleFirstOption);
	
	public ViewLeadPage clickFirstToEdit() {
		click(eleFirstOption);
		return new ViewLeadPage();
	}
	
	@FindBy(how = How.XPATH, using="(//div[@class='x-form-element']/input)[13]")
	private WebElement eleFirstNameDelete;
	
	public FindLeadPage enterFirstNameDelete() {
		type(eleFirstNameDelete, FirstID);
		return this;	
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-paging-info']")
	private WebElement eleNoRecords;
	
	public FindLeadPage verifyFName(String Verify) {
		verifyExactText(eleNoRecords, Verify);
		return this;	
	}
}
