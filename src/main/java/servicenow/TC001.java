package servicenow;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TC001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev69221.service-now.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@class='form-control']").sendKeys("admin");
		
		
		driver.findElementByName("user_password").sendKeys("India@123");
		driver.findElementByXPath("//button[text()='Login']").click();
		
		Thread.sleep(3000);
		driver.findElementById("filter").sendKeys("incident");
		
		driver.findElementByLinkText("Create New").click();
		driver.findElementById("lookup.incident.caller_id").click();
		
		
		WebElement callerdd= driver.findElementById("lookup.incident.caller_id");
		 Select predropDown = new Select(callerdd);
		    predropDown.selectByIndex(5);
		    
		/*
		 * WebElement resocodedd = driver.findElementById("incident.short_description");
		 * Select prefdropDown = new Select(resocodedd);
		 * prefdropDown.selectByVisibleText("Solved (Permanently)");
		 */
	    driver.findElementById("incident.close_notes").sendKeys("Software Issue");
		
		
		driver.findElementById("incident.short_description").sendKeys("Nil");
		driver.findElementByName("incident.close_code");
		driver.findElementByLinkText("Submit").click();
		
		//driver.findElementByClassName("form-control").click();
		//WebElement gotodd =driver.findElementByClassName("form-control");
	    //Select dd = new Select(gotodd);
	    //dd.selectByVisibleText("Number");
	    //driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys("INC0010439");
	   
	    
		  
		  if(driver.getPageSource().contains("INC0010439"))
		  {	  
		  System.out.println("ID is True");
		 } 
		  
		  else {
		  System.out.println("ID is False"); 
		  } 
		  Thread.sleep(2000);
driver.close();
	}
	

}
