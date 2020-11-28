package steps;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSpecificMethods {
	
	public static ChromeDriver driver ;
	
	public void openLeafTapsApp() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main/");
	    driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
	    
	}
	
	
	public void closeBrowser() {
		
		driver.close();
	}

}
