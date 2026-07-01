package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity14 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Title of the page is: " + driver.getTitle());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'w-full')]/tbody/tr"));
		System.out.println("Number Of Row's :- " +row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[contains(@class, 'w-full')]/thead/tr/th"));
		System.out.println("Number Of Col :- " +col.size());
		
		WebElement BookName = driver.findElement(By.xpath("//table[contains(@class, 'w-full')]/tbody/tr[5]/td[2]"));
		System.out.println("BookName :- " +BookName.getText());
		
		driver.findElement(By.xpath("//table[contains(@class, 'w-full')]/thead/tr/th[5]")).click();
		BookName = driver.findElement(By.xpath("//table[contains(@class, 'w-full')]/tbody/tr[5]/td[2]"));
		
		System.out.println("BookName After Sorting :- " +BookName.getText());
		driver.quit();
		
	}

}
