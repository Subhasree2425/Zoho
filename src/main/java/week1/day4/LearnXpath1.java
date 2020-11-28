/*Launch the application
 * login
 * Navigate all the way to Find Leads
 * Click on phone tab
 * enter the value as 12 in Phone Number field
 * Click on the first resulting Lead/Record
 */




package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main/");
			//driver.findElementById("username").sendKeys("demosalesmanager");
			//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			//driver.findElementByClassName("decorativeSubmit").click();
			//driver.findElementByLinkText("CRM/SFA").click();
			//driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//input)[1]").sendKeys("demosalesmanager");
		driver.findElementByXPath("(//input)[2]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[@style='color: black;']").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
        driver.findElementByXPath("//span[text()='Phone']").click();
        driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9000456323");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

}
