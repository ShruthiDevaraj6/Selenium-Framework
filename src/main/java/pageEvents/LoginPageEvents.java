package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch ele = new ElementFetch();
	public void verifyIfLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Element not found");
	}
	
	public void enterCredentials() {
		ele.getWebElement("XPATH", LoginPageElements.emailText).sendKeys("d.shruthi1@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.pwdText).sendKeys("Finland@1234");
		ele.getWebElement("XPATH", LoginPageElements.loginText).click();
		
		
	}
	
	


}
