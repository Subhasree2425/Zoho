/*1. Launch URL: https://acme-test.uipath.com/account/login
 *2. Enter UserName: (kumar.testleaf@gmail.com)and TAB(,Keys.Tab)
 *3. Enter password(leaf@12)
 *4. Click Login
 *5. Click on Vendors
 *6. Click Search Vendor
 *7. Enter Vendor Name(Blue
 */








package week1.works;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://acme-test.uipath.com/account/login");

	}
;
}
