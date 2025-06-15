package seleniumLatestFeatures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://phptravels.net/signup");
		WebElement firstName = driver.findElement(By.id("firstname"));
		firstName.sendKeys("Gopinath");
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("K");
		driver.findElement(By.xpath("//div[@class='filter-option-inner-inner']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("india");
		List<WebElement> countryList =driver.findElements(By.xpath("//*[@id='bs-select-1']/ul/li"));

		for(int i=0;i<countryList.size();i++) {
			if(countryList.equals("India")) {
				countryList.get(i).click();
			}
		}
		
		WebElement container=driver.findElement(By.xpath("//div[@class='content mb-0 p-3 p-md-4 card rounded-4']"));
		File file =container.getScreenshotAs(OutputType.FILE); //getScreenShotAs is specific for WebElement
		FileUtils.copyFile(file, new File("C:/Users/gopin/eclipse-workspace/seleniumLearning/screenshot.png"));
	}

}
