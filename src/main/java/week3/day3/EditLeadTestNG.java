package week3.day3;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class EditLeadTestNG {


	@Test
	public void EditTestNG() throws InterruptedException {

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

		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Subasree");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		if(driver.getTitle().contains("View Lead")) {
			System.out.println("The title page is verified");
		}
		else
		{
			System.out.println("The title is not verified");
		}

		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName' ]").clear();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName' ]").sendKeys("Capgemini");
		driver.findElementByXPath("(//input[@name='submitButton' ])[1]").click();


		String chngName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(chngName);

		if(chngName.contains("Capgemini")) {

			System.out.println("Changed Name Confirmed");
		} 
		else {
			System.out.println("Changed Name not Confirmed");
		}
		driver.close();
	}
}