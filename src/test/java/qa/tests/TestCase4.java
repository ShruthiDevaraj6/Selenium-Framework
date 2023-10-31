package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.ContactsPage;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import pageEvents.SignOut;
import utils.ElementFetch;

public class TestCase4 extends BaseTest {
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
	ContactsPage contactsPage = new ContactsPage();
	SignOut signOut = new SignOut();
  @Test
  public void sampleMethodForSignOut() {
	  homePage.signInButton();
	  loginPage.enterCredentials();
	  signOut.signOut();
  }
}
