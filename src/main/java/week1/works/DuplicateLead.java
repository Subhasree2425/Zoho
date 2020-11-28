package week1.works;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("mail2sri@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		String capturingLeadName = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		System.out.println(capturingLeadName);

		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		String title=driver.getTitle(); 
		  
		  if(title.contains("Duplicate Lead")) 
		  {
			  
		  System.out.println("Title as verified"); 
		  
		  } 
		  else 
		  {
			  
		  System.out.println("Title not verified"); 
		  }
		
		
		  driver.findElementByXPath("//input[@value='Create Lead']").click();
		  
		  Thread.sleep(3000);
          String verifyFirstName=driver.findElementById("viewLead_firstName_sp").getText();
		  System.out.println("Name is-"   + verifyFirstName);
		  
		  
		  if(capturingLeadName.equals(verifyFirstName)) {
			  System.out.println("Duplicate Lead name is same as captured name");
		  }
		  else	  
		  {
			  System.out.println("Duplicate Lead name is not same as captured name");
		  }
		  
	}

}
