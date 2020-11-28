package weekend.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccountLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com", Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		Thread.sleep(2000);
		
		WebElement mouseOver= driver.findElementByXPath("(//button[@type='button'])[7]");
		Actions action=new Actions(driver);
		action.moveToElement(mouseOver).click().perform();
		
		driver.findElementByLinkText("Search for Invoice").click();
		driver.findElementById("vendorTaxID").sendKeys("DE763212");
		driver.findElementById("buttonSearch").click();
		
		Thread.sleep(2000);
		List<WebElement> rows=driver.findElementsByXPath("//tr/td[text()='IT Support']/preceding-sibling::td[2]");
		
	for (WebElement rowIT : rows) {
		
		System.out.println(rowIT);
		
	}
		driver.findElementByLinkText("Log Out").click();
	driver.close();

		
	}

}


		  