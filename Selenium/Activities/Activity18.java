package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Page Title :- " + driver.getTitle());
        Select sel=new Select(driver.findElement(By.id("multi-select")));
        sel.selectByVisibleText("Javascript");
        sel.selectByIndex(4);
        sel.selectByIndex(5);
        sel.selectByIndex(6);
        sel.selectByValue("node");
        sel.deselectByIndex(5);


        driver.close();

    }
}
