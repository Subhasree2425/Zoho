package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class EditField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/')]").click();
		
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
      
	    driver.findElementByXPath("//input[@style='width: 212px;' and @name='firstName']").sendKeys("Subasree");
	    driver.findElementByXPath("//button[text()='Find Leads']").click();
	
		
	    Thread.sleep(3000);
	    driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	    
	    //for to verify the title
		
		  String title=driver.getTitle(); 
		  
		  if(title.contains("View Lead")) 
		  {
			  
		  System.out.println("Title of the page is verified");
		  
		  } 
		  else 
		  {
			  
		  System.out.println("Title of the page is not verified"); 
		  }
		  
		  driver.findElementByXPath("//a[text()='Edit']").click(); 
		  driver.findElementByXPath("(//input[@class='inputBox' and @name='companyName'])").clear();
		  driver.findElementByXPath("(//input[@class='inputBox' and @name='companyName'])").sendKeys("Capgemini");
		  driver.findElementByXPath("//input[@value='Update']").click();
		  
		  String confirmChngName=driver.findElementById("viewLead_companyName_sp").getText();
		  if(confirmChngName.contains("Capgemini")) {
			  System.out.println("Changed Company Name is verified");
		  }
		  else
		  {
		  System.out.println("Changed Company Name is not verified");
		  }  
		  driver.close();  
	}
}
