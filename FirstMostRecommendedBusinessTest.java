package homeImprovement;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.SearchPageObject;
import utilityPack.ConfigurationFile;
import utilityPack.Driver;


public class FirstMostRecommendedBusinessTest extends BaseClass {
	

  
  @Test
  public void findMostRecommendedBusiness() {
	  //Instatiating logger file
	  logger = report.startTest("Find the popular business name with its count");
	  
	  //Navigating browser to the homepage 
	  logger.log(LogStatus.INFO, "Navigating the home page "+ConfigurationFile.URL.app_url);
	  Driver.Instance.navigate().to(ConfigurationFile.URL.app_url);
	  
	 
	  
	  //Creating object for Search Page Object
	  SearchPageObject spObj = new SearchPageObject();
	  
	  //Calling method to display Most recommended business with highest recommendations
	  logger.log(LogStatus.INFO, spObj.ShowMostRecommendedBuisnessName(Driver.Instance));
	  
  }
  
  

 

}
