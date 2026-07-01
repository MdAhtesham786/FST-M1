package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page is: " + driver.getTitle());
		 WebElement textInput = driver.findElement(By.id("textInput"));
		 System.out.println("Text input is enabled: " + textInput.isEnabled());
		 driver.findElement(By.id("textInputButton")).click();
		 System.out.println("Text input is enabled: " + textInput.isEnabled());
		driver.quit();

	}

}
