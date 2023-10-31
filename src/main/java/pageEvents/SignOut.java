package pageEvents;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import base.BaseTest;
import pageObjects.LoginPageElements;
import pageObjects.SignOutPageElements;
import utils.ElementFetch;

public class SignOut extends BaseTest {
	ElementFetch ele = new ElementFetch();
	
	public void signOut() {
		ele.getWebElement("XPATH", SignOutPageElements.logOutTab).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		ele.getWebElement("XPATH", SignOutPageElements.logOutButton).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Element not found");
	}

}
