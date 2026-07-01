package example;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Title of the page is: " + driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@name,'full-name-')]")).sendKeys("Ahtesham");
		driver.findElement(By.xpath("//input[contains(@name,'-email')]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'-event-date-')]")).sendKeys("25062026");
		driver.findElement(By.xpath("//textarea[contains(@name,'-additional-details-')]")).sendKeys("Example");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebElement confirmation = driver.findElement(By.id("action-confirmation"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10));
		wait.until(ExpectedConditions.visibilityOf(confirmation));
		System.out.println(confirmation.getText());
		
		
	}

}
