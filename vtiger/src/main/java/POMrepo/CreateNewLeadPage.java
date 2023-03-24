package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewLeadPage {
	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "salutationtype")
	private WebElement salutationDropdown;
	
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextField;
	
	@FindBy(name= "company")
	private WebElement companyTextField;
	
	@FindBy(name = "industry")
	private WebElement industryDropdown;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement userRadioButton;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupRadioButton;
	
	@FindBy(name = "assigned_group_id")
	private WebElement assignedToDropdown;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;

	public WebElement getSalutationDropdown() {
		return salutationDropdown;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
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

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void selectSalutationType(String option) {
		Select select=new Select(salutationDropdown);
		select.selectByVisibleText(option);
	}
	
	public void enterFirstName(String firstName) {
		firstNameTextField.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		lastnameTextField.sendKeys(lastName);
	}
	
	public void enterCompanyName(String companyName) {
		companyTextField.sendKeys(companyName);
	}
	
	public void selelctFromIndustryDropdown(String option) {
		Select select=new Select(industryDropdown);
		select.selectByVisibleText(option);
	}
	
	public void clickOnGroupRadioButton() {
		groupRadioButton.click();
	}
	
	public void selelctFromAssignToDropdown(String option) {
		Select select=new Select(assignedToDropdown);
		select.selectByVisibleText(option);
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
}
