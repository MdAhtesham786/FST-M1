package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.Message;

public class Activity22 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/popups");
        System.out.println("Page Title :- "  + driver.getTitle());
        WebElement toolTeap = driver.findElement(By.className("orange"));
        Actions act=new Actions(driver);
        act.moveToElement(toolTeap).build().perform();
        String text = toolTeap.getAttribute("data-tooltip");
        System.out.println("Toole Teap Text :- " + text);
        toolTeap.click();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String Message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Confirmation Message :- " + Message);
        driver.close();



    }
}
