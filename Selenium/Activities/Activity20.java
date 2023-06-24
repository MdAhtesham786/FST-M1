package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/javascript-alerts");
        System.out.println("Page Title :- " + driver.getTitle());
        driver.findElement(By.id("prompt")).click();
        Alert alrt = driver.switchTo().alert();
        System.out.println(alrt.getText());
        alrt.sendKeys("Awesome!");
        alrt.accept();


    }
}
