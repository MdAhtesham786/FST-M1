package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net");
        System.out.println("Page Title :- " + driver.getTitle());
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        System.out.println("Page Title :- " + driver.getTitle());

        driver.navigate().to("https://www.training-support.net/selenium/login-form");
        System.out.println("Page Title :- " + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
