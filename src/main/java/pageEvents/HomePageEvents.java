package pageEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents extends BaseTest {
	
	ElementFetch ele = new ElementFetch();
	public void signInButton() {
		ele.getWebElement("XPATH", HomePageElements.signInButtonText).click();
	}
	
	public void crmHover() {
		WebElement hoverEle = ele.getWebElement("XPATH", HomePageElements.crmHover);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Actions(driver).moveToElement(hoverEle).perform();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		ele.getWebElement("XPATH", HomePageElements.automotiveCrmHover).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

}
