package vtiger.Campaign;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMrepo.CampaignPage;
import POMrepo.CreatingNewProductPage;
import POMrepo.CreatingNewVendor;
import POMrepo.HomePage;
import POMrepo.ProductInformationPage;
import POMrepo.ProductPage;
import POMrepo.VendorInformationPage;
import POMrepo.VendorsPage;
import POMrepo.createNewCampaginPage;
import vtiger.genericUtlity.BaseClass;
import vtiger.genericUtlity.IPathConstant;
import vtiger.genericUtlity.javaUtility;
@Listeners(vtiger.genericUtlity.ListenersImplementationClass.class)
public class CreateACampaignTest  extends BaseClass{
	@Test
	public void createCampaignWithProduscDetails() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException {
		String vendorName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_VENDOR, 18, 2);
		String productName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_PRODUCT, 17, 2);
		String campaignName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_CAMPAIGN, 114, 2);
		
		javaUtility jUtils=new javaUtility();
		String SalesStartDate = jUtils.generateDateInYYYY_MM_DDFormat();
		
		HomePage home=new HomePage(driver);
		home.clickOnVendorsModule();
		
		
		VendorsPage vendors = new VendorsPage(driver);
		vendors.clickOnVendorsPlusButton();
		
		CreatingNewVendor createVendor = new CreatingNewVendor(driver);
		createVendor.enterVendorName(vendorName);
		createVendor.clickOnSaveButton();
		
		VendorInformationPage vendorInfo = new VendorInformationPage(driver);
		String actualVendorName = vendorInfo.verifyVendorInfo(vendorName);
		
		Assert.assertTrue(actualVendorName.contains(vendorName));
		System.out.println("Pass: The vendor has been created");
		
		home.clickOnProductModule();
		
		ProductPage product=new ProductPage(driver);
		product.clickOnProductPlusButton();
		
		CreatingNewProductPage createProduct=new CreatingNewProductPage(driver);
		createProduct.enterProductName(productName);
		
		createProduct.enterDate(SalesStartDate);
		createProduct.clickOnVendorLookUpButton();
		
		wUtils.switchToWindow(driver, "Vendors&action");
		createProduct.enterInSearchTextBox(vendorName);
		createProduct.clickOnSearchButton();
		createProduct.clickOnVendorNameAfterSearch(vendorName);
		
		wUtils.switchToWindow(driver, "Products");
		createProduct.uploadProductImage("/src/test/resources/xdoc.pdf.pdf");
		
		createProduct.clickOnSaveButton();
		
		ProductInformationPage productInfo=new ProductInformationPage(driver);
		String actualProductName = productInfo.verifyProduct(productName);
		Assert.assertTrue(actualProductName.contains(productName));
		System.out.println("Pass: The product is created");
		
		home.clickOnCampaignOption();
		
		CampaignPage campaign = new CampaignPage(driver);
	campaign.clickOncampaignPlusButoon();
	
	 createNewCampaginPage createcampaign = new createNewCampaginPage(driver);
	 createcampaign.enterCampaignName(campaignName);
	 
	 
	 createcampaign.clickOnuserRadioButton();
	 createcampaign.clickOnVanderNameLookup();
	
	 wUtils.switchToWindow(driver, "Campaign&action");
		createcampaign.enterInSearchTextBox(productName);
		createcampaign.clickOnSearchButton();
		createcampaign.clickOnProductNameAfterSearch(actualProductName);
		
		createcampaign.clickonsavebutton();
		
		ProductInformationPage campaigninfo=new ProductInformationPage(driver);
		String actualCampaign = campaigninfo.verifyProduct(campaignName);
		Assert.assertTrue(actualCampaign.contains(campaignName));
		System.out.println("Pass: The Campaign is created");
	}
	
}
