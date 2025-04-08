package me.ianoem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    public void initializeDriver() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://www.ianoem.me");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}