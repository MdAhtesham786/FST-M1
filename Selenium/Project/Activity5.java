package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    private WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    @Test
    public void Gettingcolors()
    {
        driver.get("https://alchemy.hguy.co/crm/");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        String color=driver.findElement(By.id("toolbar")).getCssValue("color");
        System.out.println("ToolBar color :- " + color);
        driver.close();


    }
}
