package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import sitios.SinatraSite;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    private SinatraSite sinatraSite;

    public LoginSteps(Hooks hooks) {
        this.sinatraSite = hooks.getSinatraSite();
    }

    @When("I log in with credentials {word} and {word}")
    public void iLoginWithValidCredentials(String user, String password) {
        sinatraSite.getHomePage().clickLogin();
        sinatraSite.getLogin().ingresarCredenciales(user, password);
    }

    @Then("I am in the Login Page")
    public void iAmInLoginPage() {

    }


    @And("I can see an error message with {string}")
    public void iCanSeeErrorMessage(String errorMessage) {
        sinatraSite.getLogin().validateErrorMessage(errorMessage);
    }
}
