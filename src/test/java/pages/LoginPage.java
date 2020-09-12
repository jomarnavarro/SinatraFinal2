package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class LoginPage {
    private final WebDriver driver;
    //elementos
    @FindBy(css="#username")
    WebElement campoUsuario;

    @FindBy(css="#password")
    WebElement campoPassword;

    @FindBy(css="[value='Log In']")
    WebElement botonLogin;

    @FindBy(css=".flash")
    WebElement errorMessageElement;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //metodos
    public void ingresarCredenciales(String user, String password) {
        campoUsuario.sendKeys(user);
        campoPassword.sendKeys(password);
        botonLogin.click();
    }

    public void validateErrorMessage(String errorMessage) {
        String actualErrorMessage = errorMessageElement.getText();
        assertTrue(errorMessageElement.getText().equals(errorMessage));
    }
}
