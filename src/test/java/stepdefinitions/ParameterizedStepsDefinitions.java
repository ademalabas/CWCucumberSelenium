package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;


public class ParameterizedStepsDefinitions {


    @When("Kullanici {string} arattiginda")
    public void kullaniciArattiginda(String key) {

        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);

    }

    @Then("Kullanici title da {string} gormelidir")
    public void kullaniciTitleDaGormelidir(String key) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));

    }


    @Given("Ilk sayi {int}")
    public void ilkSayi(int arg0) {
    }

    @And("Ikinci sayi {int}")
    public void ikinciSayi(int arg0) {
    }

    @When("Bu sayilari + operatorune sokarsam")
    public void buSayilariOperatoruneSokarsam() {
    }

    @Then("sonuc {int} olmalidir")
    public void sonucOlmalidir(int arg0) {
    }

    @Given("Ismim {string}")
    public void ismim(String arg0) {
    }
}
