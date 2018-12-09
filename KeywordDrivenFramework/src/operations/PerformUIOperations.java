package operations;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class PerformUIOperations {
	WebDriver driver;

	private By getObject(Properties p, String objectName, String objectType) throws Exception {
		
		Thread.sleep(3000);

		if (objectType.equalsIgnoreCase("XPATH")) {

			return By.xpath(p.getProperty(objectName));
		}
		// find by class
		else if (objectType.equalsIgnoreCase("CLASSNAME")) {

			return By.className(p.getProperty(objectName));

		}
		// find by id
		else if (objectType.equalsIgnoreCase("ID")) {

			return By.id(p.getProperty(objectName));

		}
		// find by name
		else if (objectType.equalsIgnoreCase("NAME")) {

			return By.name(p.getProperty(objectName));

		}
		// Find by css
		else if (objectType.equalsIgnoreCase("CSS")) {

			return By.cssSelector(p.getProperty(objectName));

		}
		// find by link
		else if (objectType.equalsIgnoreCase("LINK")) {

			return By.linkText(p.getProperty(objectName));

		}
		// find by partial link
		else if (objectType.equalsIgnoreCase("PARTIALLINK")) {

			return By.partialLinkText(p.getProperty(objectName));

		} else {
			throw new Exception("Wrong object type");
		}

	}

	public PerformUIOperations(WebDriver driver) {
		this.driver = driver;
	}

	public void performUIActions(Properties p, String operation, String objName, String objType, String value)
			throws Exception {

		switch (operation.toUpperCase()) {
		case "CLICK":
			// perform click
			driver.findElement(this.getObject(p, objName, objType)).click();
			break;
		case "SETTEXT":
			// perform sendkeys
			driver.findElement(this.getObject(p, objName, objType)).sendKeys(value);
			break;
		case "GOTOURL":
			// perform open url
			driver.get(p.getProperty(value));
			break;
		case "DISPLAYED":
			// perform get title
			Thread.sleep(3000);
			boolean bool = driver.findElement(this.getObject(p, objName, objType)).isDisplayed();
			Assert.assertEquals(bool,true);
			break;	
		}
	}

}
