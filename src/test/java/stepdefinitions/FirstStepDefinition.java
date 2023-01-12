package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {

    @Given(": ilk feature icin cucumber indirdim")
    public void ilk_feature_icin_cucumber_indirdim() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given Step i calisti");
    }
    @When(": Senaryomu calistirdigimda")
    public void senaryomu_calistirdigimda() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When Step i calisti");

    }
    @Then(":Seneryamun calistigini konsolda gormeliyim")
    public void seneryamun_calistigini_konsolda_gormeliyim() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then Step i calisti");

    }


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
