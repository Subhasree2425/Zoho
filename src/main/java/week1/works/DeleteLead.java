package week1.works;

import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

	
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
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("12");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9944004499");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		String capturingID = driver.findElementByXPath("(//a[@class='linktext']) [4]").getText();
		System.out.println(capturingID);
		driver.findElementByXPath("(//a[@class='linktext']) [4]").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(capturingID);
		driver.findElementByXPath("(//button[text()='Find Leads'])").click();
		String verifyMessage = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println( " Verified Message - " + verifyMessage );
		if(verifyMessage.equals("No records to display")) {
			System.out.println("Deletion confirms Successfully");
		}
		else {
			System.out.println("Did not confirm Successful Delition");
	}
		driver.close();
	} 
	

}
