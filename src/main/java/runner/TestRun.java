package runner;

import org.junit.Test;
import org.testng.annotations.AfterMethod;

import pageObject.HomePage;
import utilities.BaseClass;

public class TestRun extends BaseClass{
		BaseClass base;
		HomePage homepage;
		
		
		

		@Test
		public void beforeMethod() {
			base=new BaseClass();
			base.setup();
			homepage=new HomePage();
			homepage.navigateHomepage();
			
		}
		
		@AfterMethod
		
			public void afterMethod() {
				base.teraDown();
				
			}
		
		}




