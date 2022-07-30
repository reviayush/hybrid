package pageObject;

import org.apache.logging.log4j.core.Logger;

import reusable.WebDriverHelper;
import uiStore.HomeUI;
import utilities.Logs;

public class HomePage {
	
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public HomePage() {
		helper=new WebDriverHelper();
		logUtil=new Logs();
	
	}
	
	public void navigateHomepage()
	{
		helper.iframe(HomeUI.frame);
		helper.clickButton(HomeUI.close);
	}
	
	
}

