package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;
    //elementos
    @FindBy(css="[href='/login']")
    WebElement linkLogin;

    @FindBy(css= "[alt='Frank Sinatra']")
    WebElement imagenSinatra;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//metodos

    public void navegarSition(String url) {
        driver.get(url);
    }

    public void clickLogin() {
        linkLogin.click();
    }
}
