package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {
	
	 public Properties property;
	 {
			// TODO Auto-generated method stub
			File src=new File("./config.properties");
			
			try
			{
				FileInputStream fil = new FileInputStream(src);
				property=new Properties();
				property.load(fil);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		public String getUrl()
		{
			String url = property.getProperty("url");
			return url;
		}
		
		public String  getDriver()
		{
			 String driver =property.getProperty("driver");
			 return driver;
		}

		
		
	}



