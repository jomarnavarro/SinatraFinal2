package sitios;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SongsPage;

public class SinatraSite {

    private final WebDriver driver;
    private HomePage home;
    private LoginPage login;
    private SongsPage songs;

    public SinatraSite(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public LoginPage getLogin() {
        return new LoginPage(driver);
    }

    public SongsPage getSongs() {
        return new SongsPage(driver);
    }




}
