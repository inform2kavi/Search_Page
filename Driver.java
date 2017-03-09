package utilityPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Static class to instantiate and closing of browser. Used by base class. It is a singleton class
public class Driver {
	
	//Declaring Instance of WebDriver
	public static WebDriver Instance;
	
	public static void Initialize() throws IOException

	{
		ReadPropertyFile propObj = new ReadPropertyFile();
		//Instantiating the corresponding browser by reading the browser name from configuration file
		if(Instance==null)
		{
			System.out.println("Initiating Driver");
			
			if(ConfigurationFile.Browser.browser.equalsIgnoreCase("firefox"))
			{
				//Initializing firefox browser
			}
			
			else if(ConfigurationFile.Browser.browser.equalsIgnoreCase("chrome"))
			{
				//Initializing firefox browser
				System.setProperty(propObj.ReturnProertyValue("chromedriver", 0), propObj.ReturnProertyValue("chromedriver", 1));
				Instance = new ChromeDriver();
				
			}
			
			else
			{
				System.out.println("Initializing driver browser");
			}
		}
		
		else
		{
			System.out.println("Browser already instantiated");
		}
	}
	
	public static void maximize()
	{
		Instance.manage().window().maximize();
	}
	
	public static void quit()
	{
		Instance.quit();
		Instance = null;
	}
	
	public static void close()
	{
		Instance.close();
		Instance = null;
	}
	

}
