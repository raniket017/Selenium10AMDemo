package POMrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createNewCampaginPage {
	WebDriver driver;
	public createNewCampaginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);	
		this.driver = driver;
	}
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
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement VanderNameLookup;
	
	@FindBy(id="search_txt")
	private WebElement ProductNameTextFeild;
	
	@FindBy(name="search")
	private WebElement SearchButton;
	
	@FindBy(name="closingdate")
	private WebElement ExpectedDate;
	
	@FindBy(name="button")
	private WebElement savebutton;

	public WebElement getCampaignname() {
		return campaignname;
	}

	public WebElement getUserRadioButton() {
		return userRadioButton;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}

	public WebElement getAssignedToDropdown() {
		return assignedToDropdown;
	}

	public WebElement getCampaigntypedropdown() {
		return campaigntypedropdown;
	}

	public WebElement getVanderNameLookup() {
		return VanderNameLookup;
	}

	public WebElement getVandorNameTextFeild() {
		return ProductNameTextFeild;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getExpectedDate() {
		return ExpectedDate;
	}
	public WebElement getsavebutton() {
		return savebutton;
	}
	public void enterCampaignName(String  campname) {
		campaignname.sendKeys(campname);
	}
	
	public void clickOnuserRadioButton() {
		userRadioButton.click();
	}
	
	
	
	public void clickOnVanderNameLookup() {
		VanderNameLookup.click();
	}
	public void enterInSearchTextBox(String ProductName) {
		ProductNameTextFeild.sendKeys(ProductName);
	}

	public void clickOnSearchButton() {
		SearchButton.click();
	}

	public void clickOnVendorNameAfterSearch(String vendorName) {

		driver.findElement(By.xpath("//a[text()='"+vendorName+"']")).click();
	}
	public void clickonsavebutton() {
		savebutton.click();
	}

	public void clickOnProductNameAfterSearch(String productName) {
		// TODO Auto-generated method stub
		
	}
}
