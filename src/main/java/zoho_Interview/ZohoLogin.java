package zoho_Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ZohoLogin{
	
	@Test public void loginApplication() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zoho.com/show/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByClassName("zgh-login").click();
		driver.findElementById("login_id").sendKeys("subhasree.r94@gmail.com");
		driver.findElementById("nextbtn").click();
		Thread.sleep(4000);
		driver.findElementById("password").sendKeys("Qwerty@1234!");
		driver.findElementById("nextbtn").click();

/*Listing Page
		1.Listing Presentation-Grid & List view
		2.Make a Copy*/
		
		Thread.sleep(4000);
		driver.findElementById("list").click();
		Thread.sleep(4000);
		driver.findElementById("grid").click();
		
		WebElement mouseover=driver.findElementById("zs_imgCont");
		Actions actions=new Actions(driver);
		actions.moveToElement(mouseover).perform();
		
		Thread.sleep(3000);
		driver.findElementByClassName("ui-show-vmore").click();
		Thread.sleep(3000);
		driver.findElementByClassName("zmenu__item").click(); 
		WebElement dd = driver.findElement(By.linkText("Make a Copy")); 
		dd.click();
		
/*Renaming Custom Slide*/
		
		driver.findElementById("zs_imgCont").click();
		Thread.sleep(3000);
		driver.findElementByClassName("ui-slideshow-button").click();
		
		 //driver.findElementByXpath("//*[@id=\"slideshowplaysetup\"]/button/svg").Click();
		 driver.findElementByXPath("//a[text()='Custom Slideshow']").click(); 
		//driver.findElementById("Custom Slideshow").click();
		 //String reName = driver.findElementByXPath("[@id='customshowname']").getText();
			//System.out.println(reName);

		driver.findElementById("customshowname").sendKeys("TEST");
		driver.close();
		
/*Duplicate Slide*/
		
		driver.findElementById("zs_imgCont").click();
		Actions rightClick= new Actions(driver);
		rightClick.moveToElement(dd);
		rightClick.contextClick().build().perform();
		WebElement elementOpen=driver.findElementByLinkText("Duplicate Slide");
		elementOpen.click();
	
		
/*Change Layout*/
		
		driver.findElementById("zs_imgCont").click();
		Actions rightClick1= new Actions(driver);
		rightClick1.moveToElement(dd);
		rightClick1.contextClick().build().perform();
		WebElement elementOpen1=driver.findElementByLinkText("Change Layout");
		driver.findElementByClassName("ui-icon ui-zmenu-icon-inner ui-zmenu-icon-placeholder ui-zmenu-no-icon").click();
		elementOpen1.click();
		
}
}