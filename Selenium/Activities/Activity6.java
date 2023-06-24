package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/input-events");
        System.out.println("Page Title:- " + driver.getTitle());

        Actions act=new Actions(driver);
        act.sendKeys(Keys.SHIFT).sendKeys("s").perform();

//        act.sendKeys(Keys.CONTROL+"a").sendKeys(Keys.CONTROL+"c").build().perform();
        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        System.out.println(driver.findElement(By.id("keyPressed")).getText());

        driver.close();


    }
}
