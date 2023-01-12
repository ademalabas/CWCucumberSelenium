package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinitions {
    @Given("Kullanici amazon sitesine gider")
    public void kullaniciAmazonSitesineGider() {
    }

    @When("Kullanici amazonda {string} aratir")
    public void kullaniciAmazondaAratir(String arg0) {
    }

    @Then("Kullanici arama sonuclarinda {string} gormelidir")
    public void kullaniciAramaSonuclarindaGormelidir(String arg0) {
    }

    @And("Kullanici ekran goruntusu alir")
    public void kullaniciEkranGoruntusuAlir() {
    }

    @And("Kullanici browser i kapatir")
    public void kullaniciBrowserIKapatir() {
    }
}
