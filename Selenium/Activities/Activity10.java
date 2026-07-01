package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Activity10 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("Title of the page is: " + driver.getTitle());
		
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement src = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement target = driver.findElement(By.xpath("//h1[text()='target']"));
		
        Actions action = new Actions(driver);
		action.click(cargoLock).pause(1000).moveToElement(cargoToml).pause(1000).click().build().perform();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println("Text after clicking Cargo.toml: " + text);
		action.doubleClick(src).build().perform();
		action.contextClick(target).build().perform();
		
		action.click(driver.findElement(By.xpath("//span[text()='Open']"))).build().perform();
		String Message = driver.findElement(By.id("result")).getText();
        System.out.println(Message);
        driver.quit();
		
		
	}

}
