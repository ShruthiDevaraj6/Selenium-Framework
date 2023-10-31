package qa.tests;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.ContactsPage;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import pageEvents.SignOut;
import utils.ElementFetch;


public class TestCase5 extends BaseTest {
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
	ContactsPage contactsPage = new ContactsPage();
  @Test
  public void sampleMethodForEditContact() {
	  homePage.signInButton();
	  loginPage.enterCredentials();
	  contactsPage.verifyIfContactPageIsLoaded();
	  contactsPage.editContact();
  }
}
