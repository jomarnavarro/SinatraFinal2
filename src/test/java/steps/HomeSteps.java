package steps;

import cucumber.api.java.en.Given;
import hooks.Hooks;
import sitios.SinatraSite;

public class HomeSteps {

    private SinatraSite sinatraSite;

    public HomeSteps(Hooks hooks) {
        this.sinatraSite = hooks.getSinatraSite();
    }
    @Given("I navigate to the home page")
    public void iNavigateHomePage() {
        sinatraSite.getHomePage().navegarSition("https://evening-bastion-49392.herokuapp.com/");
    }
}
