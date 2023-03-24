package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewVendor {
	public CreatingNewVendor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "vendorname")
	private WebElement vendornameTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getVendornameTextField() {
		return vendornameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void enterVendorName(String vendorName) {
		vendornameTextField.sendKeys(vendorName);
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
}
