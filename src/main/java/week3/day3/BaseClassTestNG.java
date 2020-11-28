
  package week3.day3;
  
  
  
  //create all the annotations for create lead, edit lead, duplicate lead
  
  import java.util.concurrent.TimeUnit;
  
  import org.openqa.selenium.chrome.ChromeDriver; 
  import org.testng.annotations.AfterClass; 
  import org.testng.annotations.AfterMethod;
  import org.testng.annotations.AfterSuite;
  //import org.testng.annotations.BeforeClass; 
  import org.testng.annotations.BeforeMethod; 
  //org.testng.annotations.BeforeSuite;
  
  
  public class BaseClassTestNG { ChromeDriver driver;
  
  
  @BeforeMethod public void loginApplication() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver(); driver.manage().window().maximize(); 
       driver.get("http://leaftaps.com/opentaps/control/main/");
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
  
  
  driver.findElementById("username").sendKeys("demosalesmanager");
  driver.findElementById("password").sendKeys("crmsfa");
  driver.findElementByClassName("decorativeSubmit").click(); }
  
  @AfterMethod public void logoutApplication() throws InterruptedException {
  Thread.sleep(20000);
  driver.findElementByXPath("//a[text()='Logout']").click(); }
  
  @AfterClass public void closeBowser() {
  
  driver.close(); }
  
  @AfterSuite public void closeDB() {
  System.out.println("After suite method executed"); }
  
  
  
  }
  
  
 