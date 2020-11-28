/*launch Leafground.com
 *select drop down items from select your program field

*/





package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSelectDropdown {
	
	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[1]").click();
		
		
		
		

	
	}

	}
