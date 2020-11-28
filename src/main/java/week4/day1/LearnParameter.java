package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import week3.day3.BaseClassTestNG;

public class LearnParameter extends BaseClassTestNG{
	 
	
	public void login() {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main/");
	driver.manage().window().maximize();
	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
	driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	driver.findElementByXPath("//a[contains(text(),'CRM/')]").click();
	
	
}
}