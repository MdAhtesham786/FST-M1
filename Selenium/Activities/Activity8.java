package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page title :- " + driver.getTitle());

        WebElement toggleCheckbox = driver.findElement(By.id("toggleCheckbox"));
        toggleCheckbox.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Add Checkbox']")));
        System.out.println(toggleCheckbox.isDisplayed());
        driver.findElement(By.xpath("//button[text()='Add Checkbox']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Remove Checkbox']")));
        System.out.println(driver.findElement(By.xpath("//button[text()='Remove Checkbox']")).isDisplayed());
        driver.close();

    }
}
