package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net/selenium/target-practice");
        System.out.println("Page Title :- " + driver.getTitle());
        System.out.println("Therd Header :-" + driver.findElement(By.xpath("//h3[@id='third-header']")).getText());

        System.out.println("Fift Header color :-" + driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color"));

        String attribute = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println("Attribute:- " + attribute);

        String text = driver.findElement(By.xpath("//button[@class='ui grey button']")).getText();
        System.out.println("Button Text:- " + text);
        driver.close();
    }
}
