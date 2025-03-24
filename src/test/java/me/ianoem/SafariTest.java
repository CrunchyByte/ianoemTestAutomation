package me.ianoem;

import me.ianoem.HomePage;
import org.testng.annotations.Test;

public class SafariTest extends MainTest {

    @Test
    public void sampleTest() {
        System.out.println(("Title: " + driver.getTitle()));
    }

    @Test
    public void testEnterName() {
        System.out.println(("Running Test User name"));
        homePage.enterName("Emilio Pulmano");
        homePage.enterEmail("Ianoemilio@outlook.com");
        homePage.enterMessage("It's time to duel!");
        homePage.clickSendMessageButton();
        System.out.println(("Ran Successfully"));
    }

}
