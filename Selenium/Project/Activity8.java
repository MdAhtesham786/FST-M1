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

public class Activity8 {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void Traversingtables() throws InterruptedException {
        driver.get("https://alchemy.hguy.co/crm/");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.id("grouptab_0"))).perform();
        Thread.sleep(2000);
        act.click(driver.findElement(By.xpath("(//a[text()='Accounts'])[1]"))).build().perform();
        Thread.sleep(5000);
        List<WebElement> list = driver.findElements(By.xpath("//table[@class='list view table-responsive']//b//a"));

        for(int i=0;i<=list.size();)
        {


            WebElement ele = list.get(i);
            String text = ele.getText();
            System.out.println(text);
            if(i>3)
            {
                break;
            }
            i=i+2;
        }



    }
}
