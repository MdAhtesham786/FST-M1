package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        driver.findElement(By.xpath("//input[starts-with(@name,'name-') and (contains(@class,'username-'))]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@name,'name-') and (contains(@class,'password-'))]")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String text = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message:- " + text);
        driver.close();

    }
}
