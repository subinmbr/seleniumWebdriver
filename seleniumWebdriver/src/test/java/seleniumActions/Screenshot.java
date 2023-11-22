package seleniumActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://stqatools.com/demo/DoubleClick.php");
//		driver.manage().window().maximize();
//		
//		
//		TakesScreenshot screen= (TakesScreenshot)driver;
//		
//		File src = screen.getScreenshotAs(OutputType.FILE);
//		
//		String path = System.getProperty("user.dir")+ "/screenshots/FullScreenImg.png";
//		
//		
//		FileUtils.copyFile(src, new File(path));
//		
		
		
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement addButton =driver.findElement(By.xpath("//input[@type='file']"));
		
		
		String path1 = System.getProperty("user.dir")+ "//ImagecreenImg.png";
		
		addButton.sendKeys(path1);
		
		driver.findElement(By.xpath("//span[text()= 'Start upload']")).click();
		
		
		
		

	}

}
