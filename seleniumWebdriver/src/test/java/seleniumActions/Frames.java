package seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.getTitle();
		System.out.println(driver.findElement(By.xpath("//label[@style='font-size:40px;']")).getText());
		
		
		
	driver.switchTo().frame("frame1");
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello there");
	 
	
	
	driver.switchTo().frame("frame3");	
	
	driver.findElement(By.xpath("//input[@id='a']")).click();
	
	System.out.println(driver.findElement(By.xpath("//input[@id='a']")).isSelected());
	
	
	//driver.switchTo().frame("frame1");   // cant access like this.. so switch to immediate parent frame first- --  which will be  frame 1
	
	
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
	 
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@type='text']")).clear();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
	
	///to go to the main page frame
	//----------------------------
	
	
	driver.switchTo().defaultContent();//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>SEE THIS 
	
	System.out.println(driver.findElement(By.xpath("//label//span")).getText());
	
	
	driver.switchTo().frame("frame2");	
	
	
	WebElement animal = driver.findElement(By.id("animals"));
	
	Select objSelect =new Select(animal);
	objSelect.selectByVisibleText("Avatar");
	
	
	

	}

}
