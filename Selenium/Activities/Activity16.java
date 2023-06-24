package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        driver.findElement(By.xpath("//div[@id='dynamic-attributes-form']//div[text()='Sign Up!']/ancestor::div[@class='ui form segment']//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//div[@id='dynamic-attributes-form']//div[text()='Sign Up!']/ancestor::div[@class='ui form segment']//label[text()='Password']/following-sibling::input")).sendKeys("password");
        driver.findElement(By.xpath("//div[@id='dynamic-attributes-form']//div[text()='Sign Up!']/ancestor::div[@class='ui form segment']//label[text()='Confirm Password']/following-sibling::input")).sendKeys("password");
        driver.findElement(By.xpath("//div[@id='dynamic-attributes-form']//div[text()='Sign Up!']/ancestor::div[@class='ui form segment']//label[text()='Email']/following-sibling::input")).sendKeys("sanu@gmail.com");
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        driver.close();

    }
}
