package org.jobboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity2{
public static void main(String[] args) {
    // Set up Firefox driver
    WebDriverManager.firefoxdriver().setup();
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    // Create the Wait object
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Open the page
    driver.get("https://alchemy.hguy.co/jobs/");

    WebElement heading = driver.findElement(By.xpath("//h1[@class=\"entry-title\"]"));


    Assert.assertEquals(heading.getText(),"Welcome to Alchemy Jobs");

    driver.quit();

}
}
