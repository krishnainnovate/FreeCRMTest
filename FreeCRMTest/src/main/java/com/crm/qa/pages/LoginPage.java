package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page factory or Object repository OR
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;

	@FindBy(xpath="//img[@class='img-responsive'][1]")
	WebElement crmLogo;
	
	//Initiolizing the page objects
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String validateLoginPageTitle(){
		
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		
		return crmLogo.isDisplayed();
		
	}
	
	public HomePage login(String un,String ps){
		
		username.sendKeys(un);
		password.sendKeys(ps);
		login.click();
		
		
		
		return new HomePage();
	}
	
}
