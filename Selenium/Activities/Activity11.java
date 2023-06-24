package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title:- " + driver.getTitle());
       WebElement checkBx=driver.findElement(By.name("toggled"));

        System.out.println("Check Selected :- " + checkBx.isSelected());
        checkBx.click();
        System.out.println("Check Selected :- " + checkBx.isSelected());
        driver.close();



    }
}
