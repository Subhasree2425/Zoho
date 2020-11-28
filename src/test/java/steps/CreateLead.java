package steps;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateLead extends ProjectSpecificMethods {
	
	
	
@When("Click on Leads")
	
	public void clickLead() {
		driver.findElementByLinkText("Leads").click();
	}


@When("Click on Create Lead")
	
	public void clickCreateLead() {
	driver.findElementByLinkText("Create Lead").click();
	}
	
@Given("Company Name")

public void enterCname() {
	driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
}
	
	
@Given("Enter First Name")

public void enterFname() {
	driver.findElementById("createLeadForm_firstName").sendKeys("Subasree");
}
	
@Given("Enter Last Name")

public void enterLname() {
	driver.findElementById("createLeadForm_lastName").sendKeys("Ramalingam");
}
	
@When("Click on CreateLead Link")

public void clickCreateLeadLink() {
	driver.findElementByClassName("smallSubmit").click();
}	
	
}
