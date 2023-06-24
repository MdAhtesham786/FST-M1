package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();

        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("Title of the Page:- " + driver.getTitle()) ;

        Actions act=new Actions(driver);
        WebElement Source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        act.dragAndDrop(Source,target).release().perform();

        String verify="Dropped!";

        String text = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
        if(verify.equalsIgnoreCase(text))
        {
            System.out.println("Dropped Successful");
        }
        else
        {
            System.out.println("Dropped Not Successful");
        }

        WebElement target2 = driver.findElement(By.id("dropzone2"));
        act.dragAndDrop(Source,target2).release().perform();

        String text2 = driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        if(verify.equalsIgnoreCase(text2))
        {
            System.out.println("Dropped Successful");
        }
        else
        {
            System.out.println("Dropped Not Successful");
        }

        driver.close();

    }
}
