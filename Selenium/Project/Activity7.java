package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void Readingadditionalinformation() throws InterruptedException {
        driver.get("https://alchemy.hguy.co/crm/");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.id("grouptab_0"))).perform();
        act.click(driver.findElement(By.xpath("(//a[text()='Leads'])[1]"))).perform();
        Thread.sleep(5000);
        List<WebElement> details = driver.findElements(By.xpath("//span[@title='Additional Details']"));

        WebElement det = details.get(details.size()-1);
        det.click();
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//span[@class='phone']")).getText();
        System.out.println("Phone Number:- " + text);
        driver.close();









    }
}
