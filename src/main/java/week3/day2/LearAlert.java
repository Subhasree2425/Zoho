/*https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
 *By using Prompt alert we gonna 
 * click Tryit box
 * pass sendkeys ,
 * hv to accept,
 * hv to check text
 */


package week3.day2;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

public class LearAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Subasree");
		driver.switchTo().alert().accept();
		String alert = driver.findElementById("demo").getText();
		System.out.println(alert);
		
		if(alert.contains("Subasree")) {
			System.out.println("Alert Handled");
		}else {
			System.out.println("Alert not Handled");
		}
		
	}

}
