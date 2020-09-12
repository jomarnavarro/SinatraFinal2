package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import hooks.Hooks;
import sitios.SinatraSite;

public class SongsSteps {
    private SinatraSite sinatraSite;

    public SongsSteps(Hooks hooks) {
        this.sinatraSite = hooks.getSinatraSite();
    }

    @Then("I am in the Songs Page")
    public void iAmInSongsPage() {
        sinatraSite.getSongs().verificarSongsPage();


    }

    @And("I can see a welcome message with {word}")
    public void iCanSeeWelcomeMessage(String user) {
        sinatraSite.getSongs().verificarMensajeBienvenida(user);

    }
}
