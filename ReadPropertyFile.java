package utilityPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	Properties propobj = new Properties();
	
	public ReadPropertyFile() throws IOException
	{
		FileInputStream FIS = new FileInputStream("./Resources/homeImprovement.properties");
		propobj.load(FIS);
	}
	
	public String ReturnPropertyValue(String Key)
	{
		
		return propobj.getProperty(Key);
			

	}
	
	public String ReturnProertyValue(String Key, int whichfield)
	{
		
		return propobj.getProperty(Key).split(":")[whichfield];
		
	}
 
}
