package vtiger.genericUtlity;

import java.util.Date;

public class javaUtility {
	public String generateSystemDataAndTime() {
		Date date=new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
}
}