package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	WebDriver driver=BaseClass.driver;
	
	public String takeSnapShot(String name) {
		TakesScreenshot scrnshot=(TakesScreenshot)driver;
		File src=scrnshot.getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy/HH/mm/ss");
		String date=sdf.format(d);
		String timestamp="./ScreenShot/"+date.replaceAll("/","_"+date);
		return timestamp;
	
	}
}
