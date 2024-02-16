package org.jobboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
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


        Assert.assertEquals(driver.getTitle(),"Dashboard ‹ Alchemy Jobs — WordPress");

        driver.quit();

    }


}
