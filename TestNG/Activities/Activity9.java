package testngActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        Reporter.log("Starting Test |", true);

        driver.get("https://training-support.net/webelements/alerts");
        Reporter.log("Opened Browser |", true);
        Reporter.log("Page title is: " + driver.getTitle() + " |", true);
    }

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("Test Case Setup started |", true);
        driver.switchTo().defaultContent();
    }

    @Test(priority = 1)
    public void simpleAlertTestCase() {
        Reporter.log("simpleAlertTestCase() started |", true);

        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();

        String alertText = simpleAlert.getText();
        System.out.println("Simple Alert Text: " + alertText);
        Reporter.log("Alert text is: " + alertText + " |", true);

        Assert.assertEquals(alertText, "You've just triggered a simple alert!");

        simpleAlert.accept();
        Reporter.log("Simple alert accepted |", true);
    }

    @Test(priority = 2)
    public void confirmAlertTestCase() {
        Reporter.log("confirmAlertTestCase() started |", true);

        driver.findElement(By.id("confirmation")).click();
        Alert confirmAlert = driver.switchTo().alert();

        String alertText = confirmAlert.getText();
        System.out.println("Confirmation Alert Text: " + alertText);
        Reporter.log("Alert text is: " + alertText + " |", true);

        Assert.assertEquals(alertText, "You've just triggered a confirmation alert!");

        confirmAlert.dismiss();
        Reporter.log("Confirmation alert dismissed |", true);
    }

    @Test(priority = 3)
    public void promptAlertTestCase() {
        Reporter.log("promptAlertTestCase() started |", true);

        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();

        String alertText = promptAlert.getText();
        System.out.println("Prompt Alert Text: " + alertText);
        Reporter.log("Alert text is: " + alertText + " |", true);

        Assert.assertEquals(alertText, "I'm a Prompt! Type something into me!");

        promptAlert.sendKeys("Awesome!");
        Reporter.log("Text entered in prompt alert |", true);

        promptAlert.accept();
        Reporter.log("Prompt alert accepted |", true);
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("Ending Test |", true);
        driver.close();
    }
}
