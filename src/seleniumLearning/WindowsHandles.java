package seleniumLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> ids= windows.iterator();
		String parentWindow = ids.next();
	    String childWindow = ids.next();
		driver.switchTo().window(childWindow);
		
		String childText = driver.findElement(By.tagName("h3")).getText();
		System.out.println(childText);
		driver.switchTo().window(parentWindow);
		String parentText = driver.findElement(By.xpath("//div/h3")).getText();
		System.out.println(parentText);
		
		driver.quit();
	}
	
	

}
