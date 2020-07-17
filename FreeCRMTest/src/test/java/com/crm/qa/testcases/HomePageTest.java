package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.utility.TestUtil;

public class HomePageTest extends TestBase {
	
	public HomePageTest(){
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	TasksPage tasksPage;
	
	TestUtil testUtil;
	
@BeforeMethod
	
	public void setUp(){
		
		initialization();
		testUtil = new TestUtil();
		loginPage= new LoginPage();
		contactsPage = new ContactsPage();
		dealsPage = new DealsPage();
		tasksPage = new TasksPage();
		homePage = new HomePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

@Test(priority=1)

public void homePageTitleTest(){
	
	String homePageTitle = homePage.validateHomePagetitle();
	Assert.assertEquals(homePageTitle, "CRMPRO","Home page title is not matched");
}

@Test(priority=2)
public void verifyUserNameTest(){
	
	testUtil.switchToFrame();
	
	Assert.assertTrue(homePage.verifyUserName());
	
}

@Test(priority=3)

public void verifyContactsPageLinkTest(){
	
	testUtil.switchToFrame();
	contactsPage = homePage.clickOnContactsLinks();
}

@Test(priority=4)

public void verifyDealsPageLinkTest(){
	
	testUtil.switchToFrame();
	dealsPage = homePage.clickOnDealsLink();
}

@Test(priority=5)

public void VeriryTasksPageLinkTest(){
	testUtil.switchToFrame();
	tasksPage = homePage.clickOnTasksPage();
}
@AfterMethod

public void tierDown(){
	
	driver.quit();
}

}
