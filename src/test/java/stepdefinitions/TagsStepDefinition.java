package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
    @Given(":Smoke test icin kazirliklar yapildi")
    public void smokeTestIcinKazirliklarYapildi() {
    }

    @When(": Smoke test calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("Smoke test calisti");
    }

    @Then(": Smoke test basarili olmali")
    public void smokeTestBasariliOlmali() {
    }

    @Given(":Regression test icin kazirliklar yapildi")
    public void regressionTestIcinKazirliklarYapildi() {
    }

    @When(": Regression test calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("Regression test calisti");
    }


    @Then(": Regression test basarili olmali")
    public void regressionTestBasariliOlmali() {
    }
}
