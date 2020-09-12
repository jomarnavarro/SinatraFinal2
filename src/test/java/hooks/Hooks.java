package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sitios.SinatraSite;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public WebDriver driver;

    public SinatraSite sinatraSite;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);

        sinatraSite = new SinatraSite(driver);
    }

    @After
    public void after() {
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public SinatraSite getSinatraSite() {
        return sinatraSite;
    }
}
