package vtiger.genericUtlity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is used to store a generic method to fetch data from property file
 * @author Amit
 *
 */
public class FileUtility {

	/**
	 * This method is used fetch data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/main/resources/propertyData.properties");
		Properties property = new Properties();
		property.load(fis);
		
		return property.getProperty(key);	
	}
	
}
