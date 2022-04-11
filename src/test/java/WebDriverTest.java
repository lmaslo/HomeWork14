import config.WebDriverProveder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WebDriverTest {

    private  WebDriver driver;

    @BeforeEach
    public void startDriver(){
        driver = new WebDriverProveder().get();
    }

    @Test
    public void testGitHubTitle() {
        assertEquals(driver.getTitle(), "GitHub: Where the world builds software · GitHub");

    }

    @AfterEach
    public void stopDriver(){
        driver.quit();
    }



}
