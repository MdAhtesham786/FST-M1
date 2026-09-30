package testngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net");
    }

    @Test
    public void testPageTitles() {
        String homePageTitle = driver.getTitle();
        System.out.println("Home Page Title: " + homePageTitle);

        Assert.assertEquals(homePageTitle, "Training Support");

        driver.findElement(By.linkText("About Us")).click();

        String aboutPageTitle = driver.getTitle();
        System.out.println("About Us Page Title: " + aboutPageTitle);

        Assert.assertEquals(aboutPageTitle, "About Training Support");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
