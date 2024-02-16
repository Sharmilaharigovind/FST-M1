package org.jobboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity5 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://alchemy.hguy.co/jobs/");

        WebElement jobheading = driver.findElement(By.xpath("//ul/li[1]/a"));

        jobheading.click();

        WebElement jobTitle=driver.findElement(By.xpath("//header/h1"));


        Assert.assertEquals(jobTitle.getText(),"Jobs");

        driver.quit();

    }


}
