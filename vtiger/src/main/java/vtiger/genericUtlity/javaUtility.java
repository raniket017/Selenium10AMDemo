package vtiger.genericUtlity;

import java.time.LocalDateTime;
import java.util.Date;

public class javaUtility {
	public String generateSystemDataAndTime() {
		Date date=new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
	}
	
	public String generateDateInYYYY_MM_DDFormat() {
		LocalDateTime date = LocalDateTime.now();
		
		String month = "0"+date.getMonthValue();
		
		int day = date.getDayOfMonth();
		
		int year = date.getYear();
		
		return year+"-"+month+"-"+day;
		
	}
}