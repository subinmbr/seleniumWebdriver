package seleniumActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://stqatools.com/demo/Windows.php");
	
String ParentWinHandle = driver.getWindowHandle();
System.out.println("current Parent wndw handle is --------" + ParentWinHandle);

driver.findElement(By.linkText("Click to open new Tab")).click();


Set<String> WindHandles= driver.getWindowHandles();
System.out.println("no of window tabs is " + WindHandles.size());




for (String child:WindHandles )
{
System.out.println("windows handle ID's are "  + child);	

if(!child.equalsIgnoreCase(ParentWinHandle))      // if both are not equal
{
driver.switchTo().window(child)	;

System.out.println("Child window title is     "+ driver.getTitle());

driver.findElement(By.linkText("TestNG")).click();


}
}

driver.close();

driver.switchTo().window(ParentWinHandle);

System.out.println("current title is - - - - - - " +driver.getTitle());


driver.findElement(By.linkText("Click to open new Window")).click();

Set<String> WindHandles2= driver.getWindowHandles();


for (String child2:WindHandles2 )
{
System.out.println("windows handle ID's are "  + child2);	

if(!child2.equalsIgnoreCase(ParentWinHandle))      // if both are not equal
{
driver.switchTo().window(child2)	;

System.out.println("Child window 2 title is     "+ driver.getTitle());

driver.manage().window().maximize();


driver.findElement(By.linkText("New Message Window")).click();
 



}



}

driver.switchTo().window(ParentWinHandle);

driver.switchTo().newWindow(WindowType.WINDOW);

driver.navigate().to("https://www.google.com/");


	
//driver.quit();


	}
}

