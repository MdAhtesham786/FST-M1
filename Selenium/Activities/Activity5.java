package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page Title :- " +driver.getTitle());

        Actions act=new Actions(driver);

        act.click().pause(2).perform();
        String text = driver.findElement(By.className("active")).getText();
        System.out.println("Left Click :- " +text);

        act.doubleClick().perform();
        String text2 = driver.findElement(By.className("active")).getText();
        System.out.println("Double Click :- " +text2);

        act.contextClick().perform();
        String text3 = driver.findElement(By.className("active")).getText();
        System.out.println("Right Click :- " +text3);

        driver.close();





    }
}
