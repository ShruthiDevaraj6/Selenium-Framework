package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class MouseHoverDropdowns {
	ElementFetch ele = new ElementFetch();
	
	public void verifyIfCrmHoverIsPerformed() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.automotiveCrmPage).size()>0, "Element not found");
	}

}
