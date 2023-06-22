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

public class Activity9 {
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
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("grouptab_0"))).perform();
        Thread.sleep(2000);
        act.click(driver.findElement(By.xpath("(//a[text()='Leads'])[1]"))).perform();
        Thread.sleep(5000);
        List<WebElement> nameList = driver.findElements(By.xpath("//table[@class='list view table-responsive']//b//a"));
        List<WebElement> userList = driver.findElements(By.xpath("//table[@class='list view table-responsive']//td[@field='assigned_user_name']"));

        for(int i=0;i<nameList.size();i++)
        {
            WebElement name = nameList.get(i);
            String text = name.getText();
            System.out.print(text + " :- ");


            for(int j=0;j<userList.size();j++)
            {
                WebElement user = userList.get(i);
                String text2 = user.getText();
                System.out.print(text2 + " ");
                System.out.println();
                if(i>=i)
                {
                    break;
                }

            }




        }





    }
}
