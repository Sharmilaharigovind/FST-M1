package org.jobboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://alchemy.hguy.co/jobs/");

        //Post Job link
        WebElement postjob = driver.findElement(By.xpath("//ul/li[3]/a"));

        postjob.click();



        WebElement email = driver.findElement(By.xpath("//input[@id=\"create_account_email\"]"));
        email.sendKeys("ss@gmail.com");

        WebElement jobtitle = driver.findElement(By.xpath("//input[@id=\"job_title\"]"));
        jobtitle.sendKeys("Engineer");

        WebElement location = driver.findElement(By.xpath("//input[@id=\"job_location\"]"));
        location.sendKeys("Kochi");

        Select dropdown = new Select(driver.findElement(By.id("job_type")));
        dropdown.selectByIndex(0);

        WebElement application = driver.findElement(By.xpath("//input[@id=\"application\"]"));
        application.sendKeys("sapp@gmil.com");


        WebElement company_name = driver.findElement(By.xpath("//input[@id=\"company_name\"]"));

        company_name.sendKeys("Test Company");


        driver.switchTo().frame("job_description_ifr");
        WebElement element = driver.findElement(By.cssSelector("body"));
        ( (JavascriptExecutor)driver).executeScript("arguments[0].innerHTML = 'text message'", element);


        WebElement company_twitter = driver.findElement(By.xpath("//input[@name=\"company_twitter\"]"));
        company_twitter.click();


        WebElement submit_job = driver.findElement(By.xpath("//input[@name=\"submit_job\"]"));
        submit_job.click();

        driver.quit();
    }



}
