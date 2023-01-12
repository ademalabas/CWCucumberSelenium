package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinitions {
    @Given("Ilk feature icin cucumber indirdim")
    public void ilkFeatureIcinCucumberIndirdim() {
        System.out.println("Given Step i calisti");
    }

    @When("Senaryomu calistirdigimda")
    public void senaryomuCalistirdigimda() {
        System.out.println("When Step i calisti");
    }

    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomunCalistiginiKonsoldaGormeliyim() {
        System.out.println("Then Step i calisti");
    }
}
