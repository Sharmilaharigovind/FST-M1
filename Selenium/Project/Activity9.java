package org.jobboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().

                setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        WebElement username = driver.findElement(By.xpath("//input[@id=\"user_login\"]"));
        username.sendKeys("root");
        WebElement password = driver.findElement(By.xpath("//input[@id=\"user_pass\"]"));
        password.sendKeys("pa$$w0rd");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@value=\"Log In\"]"));

        btnLogin.click();

        driver.findElement(By.xpath("//div[contains(text(),\"Job Listings \")]")).click();

        driver.findElement(By.xpath("//a[@class=\"page-title-action\"]")).click();


        driver.findElement(By.xpath("//button[@aria-label=\"Close dialog\"]")).click();


        driver.findElement(By.xpath("//textarea[@id=\"post-title-0\"]")).sendKeys("TEST-PUBLISH");


        driver.findElement(By.xpath("//button[text()=\"Publish…\"]")).click();

        driver.findElement(By.xpath("//button[text()=\"Publish\"]")).click();


        driver.navigate().back();

        driver.navigate().refresh();

        //GEt the first elemt

        String rowVal = driver.findElement(By.xpath("//tr[1]/td[1]/div/a")).getText();

        Assert.assertEquals(rowVal, "TEST-PUBLISH");

        driver.quit();
    }
}


