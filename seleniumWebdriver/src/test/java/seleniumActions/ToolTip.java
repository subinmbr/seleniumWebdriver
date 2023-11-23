package seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://jqueryui.com/tooltip/");
		
		
		WebElement ageFrame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(ageFrame);
		
		
		WebElement age= driver.findElement(By.id("age"));
		
		//age.sendKeys("12");
		
		
		
		Actions action  =new Actions( driver);
		

		
		action.moveToElement(age).perform();
		
		
		System.out.println(driver.findElement(By.className("ui-tooltip-content")).getText());
		
		
		
		
	}

}
