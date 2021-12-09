package SwagLabs;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwagGlobalSettings {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.out.println("test start");
        System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options.addArguments("--headless"));
        driver.get("https://www.saucedemo.com");
    }

    @After
    public void close() {
        driver.quit();
        System.out.println("test close");
    }

}