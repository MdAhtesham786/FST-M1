package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity19 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Title of the page is: " + driver.getTitle());
		driver.findElement(By.id("confirmation")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.id("confirmation")).click();
		alert.dismiss();
		driver.quit();
		
		
		
	}

}
