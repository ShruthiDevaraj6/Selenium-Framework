package pageObjects;

public interface ContactPageElements {
	String contactsMenu = "//span[contains(text(),'Contacts')]";
	String contactsText = "//span[contains(@class,'selectable')]";
	String createContactsTab = "//i[@class='edit icon']";
	String firstNameTab = "//input[@name='first_name']";
	String lastNameTab = "//input[@name='last_name']";
	String contactSave = "//i[@class='save icon']";
	String newContactSavedPageTitle = "//span[@class='selectable ']";
	String contactCheckbox = "//input[@type='checkbox']";
	String contactEditButton = "//button[@class='ui icon button']//i[@class='edit icon']";
	String companyName = "//div[@name='company']//input[@type='text']";
	String contactUpdated = "//div[@class='shortlen-container className']";
	String companyNameDropdown = "//div[@class='selected item']//span[@class='text'][normalize-space()='MediaMonks']";
	String deleteContact = "//tr[9]//button[@class='ui button icon']//i[@class='trash icon']";//deleting 9th record
	String deleteConfbutton = "//i[@class='remove icon']";
}


