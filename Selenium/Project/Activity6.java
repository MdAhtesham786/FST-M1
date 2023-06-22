package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
    private WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    @Test
    public void Menuchecking()

    {
        driver.get("https://alchemy.hguy.co/crm/");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        boolean flag = driver.findElement(By.xpath("//a[text()='Activities']")).isDisplayed();

        if(flag)
        {
            System.out.println("Activitis Menue is present");
        }
        else {
            System.out.println("Activitis Menue is Not present");
        }

        driver.close();


    }
}
