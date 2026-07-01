package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/popups");
		System.out.println("Parent Title of the page is: " + driver.getTitle());
		driver.findElement(By.id("launcher")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("h1.text-center")).getText());
		driver.quit();

	}

}
