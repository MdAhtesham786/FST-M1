package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Activity21 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Page Title:- " + driver.getTitle());
        driver.findElement(By.id("launcher")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> itr = window.iterator();
        List<String> list=new ArrayList<String>();

        while(itr.hasNext())
        {

            list.add(itr.next());

        }

        String wind = list.get(list.size() - 1);
        driver.switchTo().window(wind);
        Thread.sleep(2000);
        System.out.println("New Window Title :- " + driver.getTitle());
        String text = driver.findElement(By.className("content")).getText();
        System.out.println("New Window Header :- " + text);

        driver.findElement(By.id("actionButton")).click();

         window = driver.getWindowHandles();
        Iterator<String> itr2 = window.iterator();
        while(itr2.hasNext())
        {

            list.add(itr2.next());

        }

        String wind1 = list.get(list.size() - 1);
        driver.switchTo().window(wind1);
        Thread.sleep(2000);
        System.out.println("New Window Title :- " + driver.getTitle());
        String text2 = driver.findElement(By.className("content")).getText();
        System.out.println("New Window Header :- " + text2);
        driver.quit();




        


    }
}
