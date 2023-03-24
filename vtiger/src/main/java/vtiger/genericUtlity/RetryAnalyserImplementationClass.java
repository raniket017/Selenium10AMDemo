package vtiger.genericUtlity;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplementationClass   implements IRetryAnalyzer{

	 int limit =3;
	 int count =0;
	  public boolean retry(ITestResult result) {
		   while(count<limit )
		   {
			   count++;
			   return true;
		   }		  
		  return false;
	  }
	
	
	
	
	
}
