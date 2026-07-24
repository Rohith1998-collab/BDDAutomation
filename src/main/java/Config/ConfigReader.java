package Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	public Properties getConfig()
	{
		Properties prop= new Properties();
		InputStream input=ConfigReader.class.getClassLoader().getResourceAsStream("data.properties");
		if (input == null) {
		    throw new RuntimeException("data.properties not found");
		}
		try
		{
			
			prop.load(input);
		} catch(IOException e) 
		
		{
			throw new RuntimeException("Unable to load configuration", e);
			
		}
		return prop;
	}

}
