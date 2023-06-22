package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    private WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    @Test
    public void Getthecopyrighttext()
    {
        driver.get("https://alchemy.hguy.co/crm/");
        String copyRight = driver.findElement(By.xpath("//a[@id='admin_options']")).getText();
        System.out.println("CopyRight Text:- " + copyRight);
        driver.close();
    }
}
