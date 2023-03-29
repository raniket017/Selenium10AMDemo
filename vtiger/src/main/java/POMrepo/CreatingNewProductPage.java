package POMrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewProductPage {
	WebDriver driver;
	public CreatingNewProductPage(WebDriver driver) {

		PageFactory.initElements(driver, this);	
		this.driver = driver;
	}

	@FindBy(name = "productname")
	private WebElement productName;

	@FindBy(name = "sales_start_date")
	private WebElement salesStartDate;

	@FindBy(xpath = "//img[@src=\"themes/softed/images/select.gif\"]")
	private WebElement vendorNameLookUpIcon;

	@FindBy(id = "search_txt")
	private WebElement vendorNameSearchTextField;

	@FindBy(name = "search")
	private WebElement searchNowButton;



	@FindBy(id = "my_file_element")
	private WebElement uploadProductImageButton;

	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getSalesStartDate() {
		return salesStartDate;
	}

	public WebElement getVendorNameLookUpIcon() {
		return vendorNameLookUpIcon;
	}

	public WebElement getVendorNameSearchTextField() {
		return vendorNameSearchTextField;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}

	public WebElement getUploadProductImageButton() {
		return uploadProductImageButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void enterProductName(String prodName) {
		productName.sendKeys(prodName);
	}

	public void enterDate(String date) {
		salesStartDate.sendKeys(date);
	}

	public void clickOnVendorLookUpButton() {
		vendorNameLookUpIcon.click();
	}

	public void enterInSearchTextBox(String vendorName) {
		vendorNameSearchTextField.sendKeys(vendorName);
	}

	public void clickOnSearchButton() {
		searchNowButton.click();
	}

	public void clickOnVendorNameAfterSearch(String vendorName) {

		driver.findElement(By.xpath("//a[text()='"+vendorName+"']")).click();
	}
	
	public void uploadProductImage(String filePath) {
		String path = System.getProperty("user.dir");
		uploadProductImageButton.sendKeys(path+filePath);
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
}
