package seleniumActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		driver.get("http://uitestingplayground.com/");
		driver.findElement(By.linkText("Load Delay")).click();
		
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
		System.out.println(driver.findElement(By.cssSelector("button.btn.btn-primary")).getText());
		
		
		driver.close();
		
		
		
		
	}

}
