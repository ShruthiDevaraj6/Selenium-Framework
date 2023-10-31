package qa.tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pageEvents.ContactsPage;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase6 extends BaseTest {
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
	ContactsPage contactsPage = new ContactsPage();
  @Test
  public void sampleMethodForDeleteContact() {
	  homePage.signInButton();
	  loginPage.enterCredentials();
	  contactsPage.verifyIfContactPageIsLoaded();
	  contactsPage.deleteContact();
  }
}
