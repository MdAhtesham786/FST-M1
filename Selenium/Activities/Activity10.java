package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title:- " + driver.getTitle());

        WebElement checkBx=driver.findElement(By.name("toggled"));
        if(checkBx.isDisplayed())
        {
            System.out.println("CheckBox Displayed");
        }
        else {
            System.out.println("CheckBox Not displayed");
        }

        driver.findElement(By.id("toggleCheckbox")).click();

        if(checkBx.isDisplayed())
        {
            System.out.println("CheckBox Displayed");
        }
        else {
            System.out.println("CheckBox Not displayed");
        }

        driver.close();



    }
}
