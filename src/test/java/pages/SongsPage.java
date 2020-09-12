package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class SongsPage {

    private final WebDriver driver;
    private WebDriverWait wait;
    //elementos
    @FindBy(linkText = "Songs")
    WebElement headerSongs; //

    @FindBy(css="#flash")
    WebElement mensajeBienvenida; //

    @FindBy(css="[href*='log']")
    WebElement linkLogout; //

    @FindBy(linkText="Create a new song")
    WebElement linkCreateSong; //

    @FindBy(id="songs")
    WebElement listaCanciones; //

    public SongsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    //metodos
    public void verificarSongsPage() {
        wait.until(ExpectedConditions.visibilityOf(headerSongs));
        wait.until(ExpectedConditions.visibilityOf(mensajeBienvenida));
        wait.until(ExpectedConditions.visibilityOf(linkLogout));
    }
    public void verificarMensajeBienvenida(String user) {
        wait.until(ExpectedConditions.visibilityOf(mensajeBienvenida));
        assertTrue(" El mensaje es incorrecto" + mensajeBienvenida.getText(), mensajeBienvenida.getText().contains(user));
    }
}
