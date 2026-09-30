package testngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");
    }

    @Test
    public void testPageTitle() {
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        Assert.assertEquals(pageTitle, "Selenium: Target Practice");
    }

    @Test
    public void incorrectAssertion() {
        String blackButtonText = driver.findElement(
                By.xpath("//button[contains(@class,'bg-black')]")
        ).getText();

        Assert.assertEquals(blackButtonText, "Incorrect Text");
    }

    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("This test will not run.");
    }

    @Test
    public void skippedTest() {
        throw new SkipException("Skipping this test using SkipException.");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
