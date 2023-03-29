package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	@FindBy(linkText = "Leads")
	private WebElement leadsLink;

	@FindBy(linkText = "Organizations")
	private WebElement organizationsLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;

	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;

	@FindBy(linkText = "Products")
	private WebElement productsLink;

	@FindBy(linkText = "More")
	private WebElement moreDropdown;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignsOption;

	@FindBy(linkText = "Vendors")
	private WebElement vendorsOption;

	@FindBy(linkText = "Invoice")
	private WebElement invoiceOption;

	@FindBy(linkText = "Quotes")
	private WebElement quotesOption;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setLeadsLink(WebElement leadsLink) {
		this.leadsLink = leadsLink;
	}

	public void setOrganizationsLink(WebElement organizationsLink) {
		this.organizationsLink = organizationsLink;
	}

	public void setContactsLink(WebElement contactsLink) {
		this.contactsLink = contactsLink;
	}

	public void setOpportunitiesLink(WebElement opportunitiesLink) {
		this.opportunitiesLink = opportunitiesLink;
	}

	public void setProductsLink(WebElement productsLink) {
		this.productsLink = productsLink;
	}

	public void setMoreDropdown(WebElement moreDropdown) {
		this.moreDropdown = moreDropdown;
	}

	public void setCampaignsOption(WebElement campaignsOption) {
		this.campaignsOption = campaignsOption;
	}

	public void setVendorsOption(WebElement vendorsOption) {
		this.vendorsOption = vendorsOption;
	}

	public void setInvoiceOption(WebElement invoiceOption) {
		this.invoiceOption = invoiceOption;
	}

	public void setQuotesOption(WebElement quotesOption) {
		this.quotesOption = quotesOption;
	}

	public void setLogoutIcon(WebElement logoutIcon) {
		this.logoutIcon = logoutIcon;
	}

	public void setSignOutLink(WebElement signOutLink) {
		this.signOutLink = signOutLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getMoreDropdown() {
		return moreDropdown;
	}

	public WebElement getCampaignsOption() {
		return campaignsOption;
	}

	public WebElement getVendorsOption() {
		return vendorsOption;
	}

	public WebElement getInvoiceOption() {
		return invoiceOption;
	}

	public WebElement getQuotesOption() {
		return quotesOption;
	}
	
	//Business Logic
	public void clickOnLeadsModule() {
		leadsLink.click();
	}

	public void clickOnOrganizationsModule() {
		organizationsLink.click();
	}

	public void clickOnContactsModule() {
		contactsLink.click();
	}

	public void clickOnOpportunitiesModule() {
		opportunitiesLink.click();
	}

	public void clickOnProductModule() {
		productsLink.click();
	}

	public void clickOnCampaignOption() {	
		Actions action=new Actions(driver);
		action.moveToElement(moreDropdown).perform();;
		action.moveToElement(campaignsOption).click().perform();	
	}

	public void clickOnVendorsModule() {
		Actions action=new Actions(driver);
		action.moveToElement(moreDropdown).perform();;
		action.moveToElement(vendorsOption).click().perform();

	}

	public void logoutAction() {
		Actions action=new Actions(driver);
		action.moveToElement(logoutIcon).perform();
		action.click(signOutLink).perform();
	}

}
