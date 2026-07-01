package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("Title of the page is: " + driver.getTitle());
		Actions act=new Actions(driver);
		WebElement ball=driver.findElement(By.id("ball"));
		WebElement dropzone1=driver.findElement(By.id("dropzone1"));
		WebElement dropzone2=driver.findElement(By.id("dropzone2"));
		act.dragAndDrop(ball, dropzone1).build().perform();
		String dropzone1Text = driver.findElement(By.xpath("//div[@id='dropzone1']/span")).getText();
		if(dropzone1Text.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("Ball Dropped to dropzone1 ");
			
			
		}
		else
		{
			System.out.println("Ball Not Dropped to dropzone1 ");
		}
		
		act.dragAndDrop(ball, dropzone2).build().perform();
		String dropzone2Text = driver.findElement(By.xpath("//div[@id='dropzone2']/span")).getText();
		if(dropzone2Text.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("Ball Dropped to dropzone2");
			
			
		}
		else
		{
			System.out.println("Ball Not Dropped to dropzone2");
		}
		
		driver.quit();
		
		
		
		
		
		
		

	}

}