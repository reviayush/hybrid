package reusable;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

	public class WebDriverHelper extends BaseClass {
		public void sendText(By element,String Text)
		{
			driver.findElement(element).sendKeys(Text);
		}
		public void getText(By element)
		{
			driver.findElement(element).getText();
		}
		public void clickButton(By element)
		{
			driver.findElement(element).click();
		}
		public void clickEnter(By element)
		{
			driver.findElement(element).sendKeys(Keys.ENTER);
		}
		public void iframe(By element)
		{
			WebDriverWait wdwait=new WebDriverWait(driver,10);
			wdwait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public void hover(By element)
		{
			Actions action =new Actions(driver);
			action.moveToElement(driver.findElement(element)).perform();
		}
		
		public void backpage()
		{
			driver.navigate().back();
		}
		
		
		

	}



