package seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTopics {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://watir.com/examples/shadow_dom.html");

		
		WebElement shadowhost = driver.findElement(By.xpath("//div[@id='shadow_host']"));
		
		SearchContext context = shadowhost.getShadowRoot();
		
		
		WebElement shadowContent = context.findElement(By.cssSelector("span#shadow_content"));
		
		System.out.println("shadown DOM content is ........"+ shadowContent.getText());
		
		
		
		WebElement innerShadow =  context.findElement(By.cssSelector("div#nested_shadow_host"));
		
		SearchContext innerContext = innerShadow.getShadowRoot();
		
		String innerText = innerContext.findElement(By.cssSelector("div#nested_shadow_content")).getText();
		
		System.out.println("shadown DOM content is ........"+ innerText);
		
		
		

	}

}
