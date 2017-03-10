package homeImprovement;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilityPack.Driver;
import utils.CaptureScreenShot;
//This class will be extended by all the test classes
public class BaseClass {
	
	//Global variable for reports and log file
	ExtentTest logger = null;
	ExtentReports report = null;
	
	//Common before class method to be used by all the test classes
	@BeforeClass
	public void setup() throws IOException
	{
		//Calling the static method of the Driver class
		Driver.Initialize();
		
		//Instatiating report 
		report = new ExtentReports("./Reports/"+this.getClass().getSimpleName()+".html");
		
		
	}
	
	@AfterMethod
	public void printResult(ITestResult result) throws IOException
	{
		//For passed test
		if(result.isSuccess())
		{
			logger.log(LogStatus.PASS, result.getName()+" is passed");
			System.out.println("The test "+result.getName()+" is passed");
		}
		
		//For failed scenario's
		else
		{
			logger.log(LogStatus.FAIL, result.getName()+" is failed");
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			result.getThrowable().printStackTrace(pw);
			logger.log(LogStatus.INFO, "The detailed error message is" +sw.toString());
			logger.log(LogStatus.INFO, "Please find attached Screenshot");
			String pathname = CaptureScreenShot.returnCaptureScreen(Driver.Instance, result.getName());
			logger.log(LogStatus.INFO, logger.addScreenCapture(pathname));
			
		}
		
		report.endTest(logger);
		report.flush();
	}
	
	//Common after class method
	@AfterClass
	public void cleanup()
	{
		//Calling static method of Driver class
		Driver.close();
	}

}
