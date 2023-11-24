package seleniumActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {

	public static void main(String[] args) {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://uitestingplayground.com/ajax");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.cssSelector("#APjFqb")).sendKeys("java tutorial");
		WebDriverWait waitElement = new WebDriverWait( driver, Duration.ofSeconds(20));
		
		WebElement ajax = driver.findElement(By.id("ajaxButton"));
		
		
		waitElement.until(ExpectedConditions.elementToBeClickable(ajax));
		
		ajax.click();
		
		
		
		
		
		waitElement.until(ExpectedConditions.textToBePresentInElement
				(driver.findElement(By.cssSelector("div#content")),"Data loaded with AJAX get request."));
		
		
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		
	
		
	driver.close();
	
	
	
	
	}

}
