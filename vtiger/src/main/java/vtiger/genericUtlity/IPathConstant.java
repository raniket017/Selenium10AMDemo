package vtiger.genericUtlity;

import java.time.Duration;

public interface IPathConstant {

String EXCELFILEPATH = "./src/test/resources/VtigerTestData.xlsx";
	
	int IMPLICITWAIT = 20;
	int EXPLICITWAIT = 20;
	int POLLINGPERIOD = 100;
	
	String SHEET_NAME_FOR_LEAD = "Lead_001";
	String SHEET_NAME_FOR_VENDOR = "Vendor_001";
	String SHEET_NAME_FOR_PRODUCT = "Product_001";
	String SHEET_NAME_FOR_CAMPAIGN = "Sheet6";
}
