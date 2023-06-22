package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {

    private WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    @Test
    public void Loggingintothesite()
    {
        driver.get("https://alchemy.hguy.co/crm/");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        String sales = driver.findElement(By.xpath("//a[@id='grouptab_0']")).getText();
        Assert.assertEquals(sales,"SALES");
        System.out.println("Home Page verified");
        driver.close();


    }

}
