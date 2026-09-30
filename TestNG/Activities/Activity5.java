package testngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test
    public void pageTitleTest() {
        Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
    }

    @Test(groups = {"HeaderTests"})
    public void thirdHeaderTest() {
        WebElement thirdHeader = driver.findElement(By.tagName("h3"));
        Assert.assertEquals(thirdHeader.getText(), "Heading #3");
    }

    @Test(groups = {"HeaderTests"})
    public void fifthHeaderColorTest() {
        WebElement fifthHeader = driver.findElement(By.tagName("h5"));
        Assert.assertEquals(fifthHeader.getCssValue("color"), "rgb(147, 51, 234)");
    }

    @Test(groups = {"ButtonTests"})
    public void emeraldButtonTest() {
        WebElement emeraldButton = driver.findElement(By.xpath("//button[contains(@class,'emerald')]"));
        Assert.assertEquals(emeraldButton.getText(), "Emerald");
    }

    @Test(groups = {"ButtonTests"})
    public void firstButtonThirdRowColorTest() {
        WebElement firstButtonThirdRow = driver.findElement(By.xpath("(//div[contains(@class,'grid')]//button)[5]"));
        Assert.assertEquals(firstButtonThirdRow.getCssValue("background-color"), "rgb(71, 85, 105)");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
