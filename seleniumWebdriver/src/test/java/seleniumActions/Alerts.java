package seleniumActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
		
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

Alert al =  driver.switchTo().alert();
String alert = al.getText();

System.out.println(alert);

al.accept();

driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();

Alert aler1 =  driver.switchTo().alert();

aler1.dismiss();

driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

Alert aler2 =  driver.switchTo().alert();

System.out.println(aler2.getText());


aler2.sendKeys("Subin S");

aler2.accept();

Thread.sleep(2000);

driver.close();

		

	}

}
