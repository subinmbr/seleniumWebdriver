package seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		Actions actions = new Actions(driver);
		
		WebElement component= driver.findElement(By.xpath("//li[@class=\"nav-item dropdown\"][3]"));
		
		
		actions.moveToElement(component).perform();
		
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.linkText("Web Cameras")).click();
		
		*/
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		driver.manage().window().maximize();
		
		
		Actions actions = new Actions(driver);
		
		WebElement component= driver.findElement(By.xpath("//button[text() = 'Click Me / Double Click Me!']"));
		
		Thread.sleep(3000);
		
		actions.doubleClick(component);
		
		//actions.doubleClick(component).doubleClick(component).build().perform();
		
		

		
		
		driver.close();
		
		
		
	
		
		
		
		//driver.findElement(By.linkText("Web Cameras")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
//	actions.contextClick(component).perform();
		
		
		
		//scroll to eleement
		//--------------------
		
		
	
	
	// scroll to see the images down
		
		
	
	
		

	}

}
