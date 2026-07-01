package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Title of the page is: " + driver.getTitle());
		WebElement ele = driver.findElement(By.xpath("//select [contains(@class,'h-80')]"));
		Select select=new Select(ele);
		select.selectByVisibleText("HTML");
		select.selectByIndex(4);
		select.selectByIndex(5);
		select.selectByIndex(6);
		select.selectByValue("nodejs");
		select.deselectByIndex(5);
		driver.quit();

	}

}
