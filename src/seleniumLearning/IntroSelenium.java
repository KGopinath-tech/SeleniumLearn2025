
package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IntroSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoking browser
		
	//	System.setProperty("webdriver.chrome.driver", "C:/Users/gopin/Downloads/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		//driver.quit();
		
	}

}


