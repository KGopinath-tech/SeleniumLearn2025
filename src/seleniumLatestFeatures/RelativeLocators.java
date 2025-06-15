package seleniumLatestFeatures;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/signup");
		
		//above()
		WebElement firstName =driver.findElement(By.id("firstname"));
		String text=driver.findElement(with(By.tagName("h4")).above(firstName)).getText();
		System.out.println(text);
		
		//below()
		String belowText =driver.findElement(with(By.tagName("label")).below(firstName)).getText();
		System.out.println(belowText);
		
		//toLeftOf()
		driver.findElement(By.linkText("Blogs")).click();
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		String contactText = driver.findElement(with(By.tagName("li")).toLeftOf(name)).getText();
		System.out.println(contactText);
		
		//toRightOf
		
		driver.findElement(with(By.tagName("input")).toRightOf(name)).sendKeys(contactText);
		
		//////////////////////////////////////
		name.sendKeys("Gopinath");
	
		WebElement submitBtn =driver.findElement(By.xpath("//button[@class='subscribe btn btn-primary w-100 h-100 waves-effect']"));
		Actions action = new Actions(driver);
		action.moveToElement(submitBtn).click();

	}

}
