package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPage {

	public VendorsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Vendor...']")
	private WebElement vendersPluseButton;
	public WebElement getVendersPluseButton() {
		return vendersPluseButton;
	
	
}
	public void clickOnVendorsPlusButton() {
		vendersPluseButton.click();
	}
}