package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
		
		ConfigRead rd= new ConfigRead();
		public String url=rd.getUrl();
		public static WebDriver driver;
		
		public void setup()
		{
			System.setProperty("webdriver.gecko.driver",rd.getDriver());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		
		}
		
		public void teraDown()
		{
			driver.close();
		}

	}



