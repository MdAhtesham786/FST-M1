package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page is: " + driver.getTitle());
		
		WebElement checkbox=driver.findElement(By.id("checkbox"));
		System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
		driver.quit();
		

	}

}
