package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class activity2 {

    private WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    @Test
    public void Gettheurloftheheaderimage()
    {
        driver.get("https://alchemy.hguy.co/crm/");
        String url = driver.findElement(By.xpath("//div[@class='companylogo']//img")).getAttribute("src");
        System.out.println("Header Image URL:- " + url);
        driver.close();

    }
}
