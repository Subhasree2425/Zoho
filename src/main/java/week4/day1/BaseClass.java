package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	
	public void logins() {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main/");
	driver.manage().window().maximize();
	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
	driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	driver.findElementByXPath("//a[contains(text(),'CRM/')]").click();
	
}
	@AfterMethod
	
	public void closeBrowser() {
		driver.close();
	}
}