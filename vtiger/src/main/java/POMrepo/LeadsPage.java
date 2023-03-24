package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement leadsPagePlusButton;

	public WebElement getLeadsPagePlusButton() {
		return leadsPagePlusButton;
	}
	
	public void clickOnLeadsPlusButton() {
		leadsPagePlusButton.click();
	
}
}