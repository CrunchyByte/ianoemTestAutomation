package me.ianoem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By messageField = By.id("message");
    private By submitButton = By.xpath("//input[@type='submit']");

    private void enterText(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    private void clickElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
    }

    public void enterName(String name) {
        enterText(nameField, name);
    }

    public void enterEmail(String email) {
        enterText(emailField, email);
    }

    public void enterMessage(String message) {
        enterText(messageField, message);
    }

    public void clickSendMessageButton() {
        clickElement(submitButton);
    }

}
