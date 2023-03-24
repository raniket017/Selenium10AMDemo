package vtiger.leads;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMrepo.CreateNewLeadPage;
import POMrepo.HomePage;
import POMrepo.LeadInformationPage;
import POMrepo.LeadsPage;
import vtiger.genericUtlity.BaseClass;
import vtiger.genericUtlity.ExcelUtility;



@Listeners(vtiger.genericUtlity.ListenersImplementationClass.class)

public class ToCreateALeadTest extends BaseClass {
	
	@Test(retryAnalyzer = vtiger.genericUtlity.RetryAnalyserImplementationClass.class)
	public void toCreateALeadAndToVerifyTheLead() throws EncryptedDocumentException, IOException {
		
		ExcelUtility eUtils=new ExcelUtility();
		
		String salutation = eUtils.fetchDataFromExcelSheet("Lead_001", 17, 2);
		String firstName = eUtils.fetchDataFromExcelSheet("Lead_001", 18, 2);
		String lastName = eUtils.fetchDataFromExcelSheet("Lead_001", 19, 2);
		String companyName = eUtils.fetchDataFromExcelSheet("Lead_001", 20, 2);
		String industryName = eUtils.fetchDataFromExcelSheet("Lead_001", 21, 2);
		String assignedTo = eUtils.fetchDataFromExcelSheet("Lead_001", 23, 2);
		
		HomePage home=new HomePage(driver);
		home.clickOnLeadsModule();
		Assert.fail();
		LeadsPage leads = new LeadsPage(driver);
		leads.clickOnLeadsPlusButton();
		
		CreateNewLeadPage createLead = new CreateNewLeadPage(driver);
		createLead.selectSalutationType(salutation);
		createLead.enterFirstName(firstName);

		createLead.enterLastName(lastName);
		createLead.enterCompanyName(companyName);
		createLead.selelctFromIndustryDropdown(industryName);
		createLead.clickOnGroupRadioButton();
		createLead.selelctFromAssignToDropdown(assignedTo);
		createLead.clickOnSaveButton();
		
		LeadInformationPage leadInfo = new LeadInformationPage(driver);
		String actualLeadName = leadInfo.verifyLeadInfo(firstName);
		
		Assert.assertTrue(actualLeadName.contains(firstName));
		System.out.println("The Lead has been created");
		
	}

}
