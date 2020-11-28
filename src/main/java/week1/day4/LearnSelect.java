/*go to Create Lead
*Use SelectByIndex for source
*Use  SelectByValue for Marketing Campaign
*Use  SelectByVisibleText.for Industry
*/


package week1.day4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Capgemini");
		driver.findElementById("createLeadForm_firstName").sendKeys("Subasree");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramalingam");
		
		WebElement sourcedd = driver.findElementById("createLeadForm_dataSourceId");
		Select srcdropDown = new Select(sourcedd);
	    srcdropDown.selectByIndex(3);
	    
	    WebElement mcdd = driver.findElementById("createLeadForm_marketingCampaignId");
	    Select mcdropDown = new Select(mcdd);
	    mcdropDown.selectByValue("CATRQ_CAMPAIGNS");
	    
	    WebElement indd = driver.findElementById("createLeadForm_industryEnumId");
	    Select industrydropDown = new Select(indd);
	    industrydropDown.selectByVisibleText("Computer Hardware");
	    
	   
	}

}
