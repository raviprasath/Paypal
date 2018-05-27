package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{

		public MyLeadPage() {
			PageFactory.initElements(driver,this);
		}		

		@FindBy(how=How.XPATH ,using="//div[@class='frameSectionBody']/ul/li[2]")
		private WebElement eleCreateLead;

		public CreateLeadPage clickCreateLead() {
			click(eleCreateLead);
			return new CreateLeadPage();
		}
		
		@FindBy(how=How.XPATH ,using="//div[@class='frameSectionBody']/ul/li[3]")
		private WebElement eleFindLead;
		
		public FindLeadPage clickFindLead() {
			click(eleFindLead);
			return new FindLeadPage();
		}

	}

