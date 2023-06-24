package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        System.out.println("Page Title:- " + driver.getTitle());
        List<WebElement> row = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tr"));
        List<WebElement> cell = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tr//td"));

        int rowCount=0;
        int cellCount=0;
        for (int i=0;i<row.size();i++)
        {
            rowCount++;
        }
        for(int i=0;i<cell.size();i++)
        {
            cellCount++;
        }
        System.out.println("Row Count:- " + rowCount);
        System.out.println("Row Count:- " + cellCount);

        List<WebElement> thrdRow = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tr[3]//td"));
        for (WebElement cell2:thrdRow) {

            System.out.print(cell2.getText() + " , ");
        }
        WebElement SecondCell = driver.findElement(By.xpath("//table[@class='ui celled striped table']//tr[2]//td[2]"));
        System.out.println( "\r\n" +"Second cell value:- " + SecondCell.getText());

        driver.close();



            

    }
}
