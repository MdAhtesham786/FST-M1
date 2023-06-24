package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Page Title :- " + driver.getTitle());
        Select sel=new Select(driver.findElement(By.id("single-select")));
        sel.selectByVisibleText("Option 2");
        sel.selectByIndex(2);
        sel.selectByValue("4");
        List<WebElement> opt = sel.getOptions();
        for(WebElement opt1:opt)
        {
            System.out.println(opt1.getText());
        }

        driver.close();

    }
}
