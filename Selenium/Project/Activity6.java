package org.jobboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity6 {
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

        WebElement search=driver.findElement(By.xpath("//input[@id=\"search_keywords\"]"));


       search.sendKeys("Banking");

        WebElement searchBtn=driver.findElement(By.xpath(" //input[@value=\"Search Jobs\"]"));

        searchBtn.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class=\"job_listings\"]/li[1]/a")));


       WebElement item=driver.findElement(By.xpath("//ul[@class=\"job_listings\"]/li[1]/a"));
       item.click();

        WebDriverWait waitApplyBtn = new WebDriverWait(driver, Duration.ofSeconds(20));

        waitApplyBtn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"Apply for job\"]")));


        WebElement applyBtn=driver.findElement(By.xpath("//input[@value=\"Apply for job\"]"));
        applyBtn.click();


        WebElement emailTxt=driver.findElement(By.xpath("//a[@class=\"job_application_email\"]"));


        System.out.println("Email"+emailTxt.getText());
        driver.quit();

    }

}
