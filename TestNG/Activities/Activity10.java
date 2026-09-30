package testngActivities;

import java.io.FileReader;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class Activity10 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/simple-form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @DataProvider(name = "csvDataProvider")
    public Object[][] readCsv() throws Exception {
        CSVReader reader = new CSVReader(
                new FileReader("src/test/resources/input.csv"));

        reader.skip(1);
        List<String[]> allRows = reader.readAll();
        reader.close();

        Object[][] data = new Object[allRows.size()][];

        for (int i = 0; i < allRows.size(); i++) {
            data[i] = allRows.get(i);
        }

        return data;
    }

    @Test(dataProvider = "csvDataProvider")
    public void testForm(String fullName, String email,
                         String date, String details) {

        WebElement fullNameField = driver.findElement(By.id("full-name"));
        fullNameField.sendKeys(fullName);

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.name("event-date")).sendKeys(date);
        driver.findElement(By.id("additional-details")).sendKeys(details);

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        String message = driver.findElement(
                By.id("action-confirmation")).getText();

        System.out.println("Confirmation Message: " + message);

        Assert.assertEquals(message, "Your event has been scheduled!");

        driver.navigate().refresh();
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
