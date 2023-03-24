package POMrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadInformationPage {

WebDriver driver;
	
	public LeadInformationPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public String verifyLeadInfo(String leadName) {
		return driver.findElement(By.xpath("//span[contains(text(), '"+leadName+"')]")).getText();
	}
}
