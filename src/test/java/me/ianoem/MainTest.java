package me.ianoem;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MainTest extends BaseTest {

    @BeforeTest
    public void setUp() {
        System.out.println(("Initializing driver"));
        initializeDriver();
    }

    @AfterTest
    public void tearDown() {
        System.out.println(("Quitting Driver"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        quitDriver();
    }
}
