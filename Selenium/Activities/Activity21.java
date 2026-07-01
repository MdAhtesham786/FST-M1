package example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity21 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://training-support.net/webelements/tabs");
		System.out.println("Parent Title of the page is: " + driver.getTitle());

		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow id: " + parentWindow);


		driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();

		// Switch to first child
		String firstChild = null;

		for (String window : driver.getWindowHandles()) {
		    if (!window.equals(parentWindow)) {
		        firstChild = window;
		        driver.switchTo().window(firstChild);
		        break;
		    }
		}

		System.out.println("First child title: " + driver.getTitle());
		System.out.println("First child window id: " + firstChild);

		// Store windows before opening third window
		Set<String> oldWindows = driver.getWindowHandles();

		driver.findElement(By.xpath("//button[text()='Open Another One']")).click();

		// Get third window
		String thirdWindow = null;

		for (String window : driver.getWindowHandles()) {
		    if (!oldWindows.contains(window)) {
		        thirdWindow = window;
		        driver.switchTo().window(thirdWindow);
		        break;
		    }
		}

		System.out.println("Third window title: " + driver.getTitle());
		System.out.println("Third window id: " + thirdWindow);
		
		driver.quit();
		
		
		
		
		
		
	}

}
