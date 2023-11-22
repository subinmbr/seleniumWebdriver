package seleniumActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewFeatures {

	public static void main(String[] args) throws InterruptedException {
ChromeOptions option = new ChromeOptions();
		
		//option.setBrowserVersion("115"); -  -  version setting

		//option.addArguments("--headless");  - - - headlesss mode


option.addArguments("--blink-settings=imagesEnabled=false");    // - disable images -- one more is there some experimental thing


		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://demo.opencart.com/");
		
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		
		driver.quit();
		

	}

}
