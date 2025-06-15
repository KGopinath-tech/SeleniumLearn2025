package javaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterValidationUsingStream {

	public static void main(String[] args) {
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencart/upload/");
		driver.manage().window().maximize();
		
		//Searching Necessary items using search or filter option
		driver.findElement(By.xpath("//div[@id='search']/input")).sendKeys("Mac");
		driver.findElement(By.xpath("//div[@id='search']/button")).click();
		
		//Get all items which is filtered or searched 
		List<WebElement> searchList = driver.findElements(By.xpath("//div[@id='product-list']//h4"));
		
		//Will check search or filter word is present or not using stream
		List<WebElement> resultList = searchList.stream().filter(list->list.getText().contains("Mac")).collect(Collectors.toList());
		
		//if Both searchlist and resultList are have same size then filter/search is working fine
		
		Assert.assertEquals(searchList.size(), resultList.size());
	}

}
