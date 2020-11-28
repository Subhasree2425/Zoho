package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateButton {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Button.html");

	}

}
