package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//OR
	
	@FindBy(xpath="//td[contains(text(),'User: Demo User')]")
	WebElement userName;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deals;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasks;
	
	@FindBy(linkText="New Contact")
	WebElement newContactsLink;
	
	
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	
	
	public String validateHomePagetitle(){
		
		return driver.getTitle();
	}
	
	
	
	public DealsPage clickOnDealsLink(){
		deals.click();
		
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksPage(){
		
		tasks.click();
		
		return new TasksPage();
	}
	
	public boolean verifyUserName(){
		
		return userName.isDisplayed();
		
	}
	
public ContactsPage clickOnContactsLinks(){
		
		contacts.click();
		
		return new ContactsPage();
		
	}
	

public ContactsPage clickOnNewContactsPageLink() throws InterruptedException{
	
	Thread.sleep(5000);
	
	Actions ac = new Actions(driver);
	
	ac.moveToElement(contacts).build().perform();
	ac.moveToElement(newContactsLink).click().build().perform();
	/*List<WebElement	> list = driver.findElements(By.xpath("//ul[contains(@style,'width: 110px')]//li//a[@title='New Contact']"));
	
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++){
		
		System.out.println(list.get(i).getText());
		if(list.size()==4){
			list.get(i).click();
			break;
		}
		
	}*/
	
	
	
	return new ContactsPage();
}
	

}
	
	


