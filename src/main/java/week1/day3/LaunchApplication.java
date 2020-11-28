package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;



	public class LaunchApplication {
	
			public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				Thread.sleep(3000);
				driver.close();

			}

		}
