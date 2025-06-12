package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBox =driver.findElement(By.id("checkBoxOption1"));
		checkBox.click();
		String textValue = checkBox.getAttribute("value");
		System.out.println(textValue);
		
		
		WebElement selectDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(selectDropdown);
		select.selectByValue(textValue);
		
		driver.findElement(By.id("name")).sendKeys(textValue);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		
		String expectedText = alertText.split(",")[0].split(" ")[1];
		System.out.println(expectedText);
		//Assert.assertEquals(textValue, expectedText);

		if (alertText.contains(textValue)) {
			System.out.println(textValue +" Text is present in the alert message");
		}else {
			System.out.println("Text is not present in alert message");
		}
			
		driver.close();
	}

}
