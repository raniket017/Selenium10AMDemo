package POMrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createNewCampaginPage {

	@FindBy(name="campaignname")
	private WebElement campaignname;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement userRadioButton;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupRadioButton;
	
	@FindBy(name = "assigned_group_id")
	private WebElement assignedToDropdown;
	
	@FindBy(name="campaigntype")
	private WebElement campaigntypedropdown;
	
	
	
}
