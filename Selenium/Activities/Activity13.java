package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity13 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Title of the page is: " + driver.getTitle());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'w-full')]/tbody/tr"));
		System.out.println("Number Of Row's :- " +row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[contains(@class, 'w-full')]/thead/tr/th"));
		System.out.println("Number Of Col :- " +col.size());
		
		List<WebElement> Thirdrow = driver.findElements(By.xpath("//table[contains(@class, 'w-full')]/tbody/tr[3]/td"));
		
		for (WebElement webElement : Thirdrow) {
			System.out.println(webElement.getText());
			
		}
		
		 WebElement CellValue = driver.findElement(By.xpath("//table[contains(@class, 'w-full')]/tbody/tr[2]/td[2]"));
		 System.out.println("second row second column :-  " +CellValue.getText());
		 
		 driver.quit();
		
		

	}

}
