package pageEvents;

import java.util.List;
import java.util.concurrent.TimeUnit;
import base.BaseTest;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePageElements;
import pageObjects.LoginPageElements;
import pageObjects.ContactPageElements;
import utils.ElementFetch;

public class ContactsPage extends BaseTest{
	ElementFetch ele = new ElementFetch();
	public void verifyIfContactPageIsLoaded() {
		ele.getWebElement("XPATH", ContactPageElements.contactsMenu).click();
		Assert.assertTrue(ele.getWebElements("XPATH", ContactPageElements.contactsText).size()>0, "Element not found");
		
	}
	
	
	public void createNewContact() {
		ele.getWebElement("XPATH", ContactPageElements.createContactsTab).click();
		ele.getWebElement("XPATH", ContactPageElements.firstNameTab).sendKeys("Santhosh");
		ele.getWebElement("XPATH", ContactPageElements.lastNameTab).sendKeys("Shetty");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		ele.getWebElement("XPATH", ContactPageElements.contactSave).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(ele.getWebElements("XPATH", ContactPageElements.newContactSavedPageTitle).size()>0, "Element not found");	
		
	}
	
	public void editContact() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ele.getWebElement("XPATH", ContactPageElements.contactEditButton).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ele.getWebElement("XPATH", ContactPageElements.companyName).sendKeys("mediamonks");
		WebDriverWait wait = new WebDriverWait(driver,30);
		ele.getWebElement("XPATH", ContactPageElements.companyNameDropdown).click();
		ele.getWebElement("XPATH", ContactPageElements.contactSave).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(ele.getWebElements("XPATH", ContactPageElements.contactUpdated).size()>0, "Element not found");
		
	}
	
	public void deleteContact() {
		ele.getWebElement("XPATH", ContactPageElements.deleteContact).click();	
		ele.getWebElement("XPATH", ContactPageElements.deleteConfbutton).click();	
		
	}

}
