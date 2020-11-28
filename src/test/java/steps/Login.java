package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends ProjectSpecificMethods {
	

	
	@Given("Open Chrome Browser")
	public void openBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@Given("launch Url")
	public void launchurl() {
		driver.get("http://leaftaps.com/opentaps/control/main/");
		
	}
	
	
	@Given("Enter Username as (.*)")
	public void uname(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}	
	
	@Given("Enter Password as (.*)")
	public void enterPasswordAsCrmsfa(String pName) {
		driver.findElementByName("PASSWORD").sendKeys(pName);
	    
	}

	@When("Click on Login Button")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify Homepage is Displayed")
	public void verifyHomepageIsDisplayed() {
		driver.findElementByLinkText("CRM/SFA").click();
	}


	
}
