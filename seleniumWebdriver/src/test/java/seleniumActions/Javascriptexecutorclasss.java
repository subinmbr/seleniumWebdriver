package seleniumActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutorclasss {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demo.opencart.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title= (String)js.executeScript("return document.title");
		System.out.println(title);
		
		js.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		
		
		
		
		
		
		
		
		
		
		
	}

}
