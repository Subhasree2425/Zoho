package week1.works;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {


	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/')]").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
	    driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("IP Soft");
	    driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Subasree");
	    driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ramalingam");
	driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("Suba");
	driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("R");
	driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("Ms");
	
	WebElement sourcedd = driver.findElementById("createLeadForm_dataSourceId");
	Select srcdropDown = new Select(sourcedd);
    srcdropDown.selectByIndex(3);
   
    driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Prof");
    driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("25000000");
    
    WebElement indd = driver.findElementById("createLeadForm_industryEnumId");
    Select industrydropDown = new Select(indd);
    industrydropDown.selectByIndex(3);
    
    WebElement ownerdd = driver.findElementById("createLeadForm_ownershipEnumId");
    Select ownershipdropDown = new Select(ownerdd); 
    ownershipdropDown.selectByVisibleText("Public Corporation");
    
    driver.findElementByXPath("//input[@id='createLeadForm_sicCode']").sendKeys("2425");
    driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys(" Key Skills");
    driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("Automation");
    
    WebElement currencydd = driver.findElementById("createLeadForm_currencyUomId");
    Select prefcurdropDown = new Select(currencydd);
    prefcurdropDown.selectByVisibleText("INR - Indian Rupee");
    
    driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("1");
    driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("12");
    driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9944004499");    
    driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("Project");    
    driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("200");    
    driver.findElementByXPath("//input[@id='createLeadForm_tickerSymbol']").sendKeys("x");
    driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAskForName']").sendKeys("yyy");
    driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("www.xyz.com");
    driver.findElementByXPath("//input[@id='createLeadForm_generalToName']").sendKeys("Subasri Sarath");
    driver.findElementByXPath("//input[@id='createLeadForm_generalAddress1']").sendKeys("No.13");
    driver.findElementByXPath("//input[@id='createLeadForm_generalAddress2']").sendKeys("No.13");
    driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("Banglore");
    
    WebElement statedd = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
    Select StatedropDown = new Select(statedd);
    StatedropDown.selectByVisibleText("Indiana");
    
    
    WebElement countrydd = driver.findElementById("createLeadForm_generalCountryGeoId");
    Select contdropDown = new Select(countrydd);
    contdropDown.selectByVisibleText("India");
    
    driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("600456");
    driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("4561");
    
    WebElement mcdd = driver.findElementById("createLeadForm_marketingCampaignId");
    Select marcdropDown = new Select(mcdd);
    marcdropDown.selectByVisibleText("Demo Marketing Campaign");
    
    driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("mail2sri@gmail.com");
    
    driver.findElementByXPath("//input[@type='submit']").click();
    
		
		  String verifyFirstName=driver.findElementById("viewLead_firstName_sp").getText();
		  
		  if(verifyFirstName.contains("Subasree"))
		  {	  
		  System.out.println("First Name is verified");
		 } 
		  
		  else {
		  System.out.println("First Name is not verified"); 
		  } 
		  Thread.sleep(2000);
driver.close();
	}

}
