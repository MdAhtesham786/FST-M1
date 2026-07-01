package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-content");
		System.out.println("Title of the page is: " + driver.getTitle());
		driver.findElement(By.id("genButton")).click();
		WebElement word = driver.findElement(By.id("word"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(word, "release"));
		System.out.println("Word is: " + word.getText());
		driver.quit();
		

	}

}
