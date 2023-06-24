package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity14 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tables");
        System.out.println("Page Title:- " + driver.getTitle());

        List<WebElement> row = driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr"));
        System.out.println("Row Count :- " + row.size());
        List<WebElement> col = driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr//td"));
        System.out.println("Column Count :- " + col.size());
        WebElement secondCell = driver.findElement(By.xpath("//table[@id='sortableTable']//tbody//tr[2]//td[2]"));
        System.out.println("Second Column Text :- " + secondCell.getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='sortableTable']//thead//th[text()='Name']")).click();
        System.out.println("Header is clicked");
        WebElement secondCell1 = driver.findElement(By.xpath("//table[@id='sortableTable']//tbody//tr[2]//td[2]"));
        System.out.println("Second Column Text :- " + secondCell1.getText());

        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']//tfoot//tr//th"));
        for(WebElement cell:footer)
        {

            System.out.println(cell.getText());
        }





    }
}
