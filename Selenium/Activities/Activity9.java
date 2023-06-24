package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();

        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Page Title:- " + driver.getTitle());
        driver.findElement(By.xpath("//button[text()='Change Content']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajax-content']//h1")));
        System.out.println(driver.findElement(By.xpath("//div[@id='ajax-content']//h1")).getText());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"I'm late!\"]")));
        System.out.println(driver.findElement(By.xpath("//h3[text()=\"I'm late!\"]")).getText());


        }
}
