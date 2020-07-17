package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utility.TestUtil;

public class ContactsPageTest extends TestBase {
	
	TestUtil testUtil;
	ContactsPage contactsPage;
	LoginPage loginPage;
	HomePage homePage;
	
	String sheetName = "contacts";
	
	public ContactsPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLinks();
		
	}
	
	/*@Test(priority=1)
	public void verifyContactsLabelTest(){
		
		Assert.assertTrue(contactsPage.verifyContactsLabel(),"Contacts Label is missing");
	}
	
	@Test
	
	public void selectContactsTest(){
		
		contactsPage.selectContacts("Aashiq Limbu");
		
		
	}*/
	
	@DataProvider
	
	public Object[][] getCrmTestData(){
		
		Object data [][] = TestUtil.getTestData(sheetName);
		
		return data;
	}
	
	@Test(dataProvider = "getCrmTestData")
	
	public void validateSearch(String company){
		
		contactsPage.searchCompanyContacts(company);
		
	}
	
	@AfterMethod
	
	public void tierDown(){
		
		driver.quit();
	}
	
	
}
