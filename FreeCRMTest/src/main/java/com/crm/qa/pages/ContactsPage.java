package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactsMsg;
	
	@FindBy(xpath="//input[@type='checkbox' and @name='contact_id'][4]")
	WebElement contactsList;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement companyname;
	
	@FindBy(xpath="//input[@name='addmore']")
	WebElement saveandmore;
	
	@FindBy(xpath="//input[@name='cs_company_name' and @type='text']")
	WebElement companyName;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement searchBtn;
	
	//initializing the page factory
	
	public ContactsPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//actions
	
	public boolean verifyContactsLabel(){
		
		return contactsMsg.isDisplayed();
	}
	
	public void selectContacts(String name){
		
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
	}
	
	public void createNewContact(String title,String fn,String ln,String cn){
		
		Select st = new Select(driver.findElement(By.name("title")));
		
		st.selectByVisibleText(title);
		
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		companyname.sendKeys(cn);
		saveandmore.click();
	}
	
	
	public void searchCompanyContacts(String s){
		
		companyName.sendKeys(s);
		searchBtn.click();
	}

}
