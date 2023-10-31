package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {
	
	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch(identifierType) {
		
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
			
		case "CSS":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
			
		case "ID":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
			
		case "NAME":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
			
		case "TAGNAME":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
			
			default:
			return null;	
		}
	}
	
	public List<WebElement> getWebElements(String identifierType, String identifierValue) {
		switch(identifierType) {
		
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
			
		case "CSS":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
			
		case "ID":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
			
		case "NAME":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
			
		case "TAGNAME":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
			
			default:
			return null;	
		}
	}

}
