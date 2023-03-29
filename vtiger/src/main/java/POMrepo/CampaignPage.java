package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {

	

	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement CampaignPlusButton;
	public WebElement getCampaignPlusButton() {
		return CampaignPlusButton;
	}
	
	public  void clickOncampaignPlusButoon() {
		CampaignPlusButton.click();
	}
}
