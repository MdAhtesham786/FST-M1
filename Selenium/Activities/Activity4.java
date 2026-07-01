package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Title of the page is: " + driver.getTitle());
		String headerText=driver.findElement(By.xpath("(//div[@data-svelte-h='svelte-npqekv']/h3)[1]")).getText();
		System.out.println("Header text is: " + headerText);
		  Color color = Color.fromString(driver.findElement(By.xpath("(//div[@data-svelte-h='svelte-npqekv']/h5)[1]")).getCssValue("color"));
		System.out.println("Color of the header is: " + color);
		System.out.println("Color as RGB: " + color.asRgb());
        System.out.println("Color as hexcode: " + color.asHex());
        
        
		String attributeValue = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
		System.out.println("Class attribute value of the button is: " + attributeValue);
		
		String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
		System.out.println("Text of the button is: " + slateButtonText);
		

	}

}
