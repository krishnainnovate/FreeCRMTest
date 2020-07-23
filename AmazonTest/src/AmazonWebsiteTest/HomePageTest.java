package AmazonWebsiteTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePageTest {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		/* System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AmazonTest\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        
        driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("1000");
        
        driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("5000");
        
        driver.findElement(By.xpath("//input[@class='a-button-input' and @value='Go']")).click();
        
        driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
        
       // driver.findElement(By.xpath("//a[@class='a-dropdown-link a-active']")).click();
        List<WebElement> list =driver.findElements(By.xpath("//ul[contains(@class,'a-nostyle a-list-link')]//li//a"));
        
        for(int i=0;i<list.size();i++){
        	
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().contains("Newest Arrivals")){
        		
        		list.get(i).click();
        		break;
        	}
        }
        
        List<WebElement> list1= driver.findElements(By.xpath("//div[@class='a-section a-spacing-none']//h2//a//span"));
        
        for(int i =0;i<list1.size();i++){
        	
        	System.out.println(list1.get(i).getText());
        	
        }
        
        List<WebElement> list2= driver.findElements(By.xpath("//div[@class='a-row']//a//span//span"));
        
        for(int i =0;i<list2.size();i++){
        	
        	System.out.println(list2.get(i).getText());
        	
        }
*/        	 
        	 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AmazonTest\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://classic.freecrm.com/");
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		  	 
       
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		Actions obj = new Actions(driver);
		
		obj.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		
		Thread.sleep(7000);
		
	driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	
		
	//driver.findElement(By.linkText("//a[@title='New Contact']")).click();
	
		
		/*List<WebElement> list =driver.findElements(By.xpath("//ul[@style='width: 110px; margin-top: 1px; opacity: 0; visibility: hidden; filter: none;']//li//descendant::a"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++){
			
			String s = list.get(i).getText();
			
			System.out.println(s);
		}*/
			
			
	}

}
