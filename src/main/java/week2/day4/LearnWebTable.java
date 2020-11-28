/*1 Launch the chrome browser and load https://erail.in/
2 Clear, Enter and Tab on From Station (MAS)
3 Clear, Enter and Tab on To Station (NMKL)
4 Click on Sort on Date
5 Find the number of trains listed
6 print all the train numbers and train names*/


package week2.day4;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
	    driver.findElementById("txtStationFrom").clear();
	    driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		
	    driver.findElementById("txtStationTo").clear();
	    driver.findElementById("txtStationTo").sendKeys("NMKL",Keys.TAB);
	    
	    driver.findElementById("chkSelectDateOnly").click();
	    Thread.sleep(3000);
		   List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
	       int rowSize=rows.size();
	       System.out.println(rowSize);
	       
	       for(int i=1; i<=rowSize; i++) {
	    	   
	    	   for(int j=1; j<=2; j++) {
	    		   
	    		   String trainNumbers  = driver.findElementByXPath(
	    				   "//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[" + j + "]/a").getText();
	    		   
	    		   System.out.println(trainNumbers);
	    	   }
	    	   
	       }
		   
		   
		  
		   
	}

}
