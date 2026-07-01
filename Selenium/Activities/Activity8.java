package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page is: " + driver.getTitle());
		WebElement checkbox=driver.findElement(By.id("checkbox"));
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		checkbox.click();
		driver.quit();

	}

}
