package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title :- " + driver.getTitle());
        WebElement txtField = driver.findElement(By.id("input-text"));
        System.out.println("Text field Enable:- " + txtField.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("Text field Enable:- " + txtField.isEnabled());
        driver.close();



    }
}
