package seleniumLatestFeatures;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMutlipeTabUsingSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/blogs");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);  //opening new tab using Selenium 
		//driver.switchTo().newWindow(WindowType.WINDOW);  // in case of opening new window
		
		Set<String> windows=driver.getWindowHandles();   //Storing all windows/tabs which is opened by webdriver
		Iterator<String> it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		//switching to child window
		driver.switchTo().window(childWindow);
		driver.get("https://phptravels.net/page/contact-us");
		String mailID=driver.findElement(By.xpath("//p[contains(text(),'email')]")).getText();
		
		//Switch to parent window
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mailID);
		
		driver.quit();

	}

}
