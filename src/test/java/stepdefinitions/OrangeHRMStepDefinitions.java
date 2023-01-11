package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import utilities.Driver;

public class OrangeHRMStepDefinitions {


    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {
        //Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

    }

    @When("kullanici valid credentials girer")
    public void kullanicivalidCredentialsGirer(DataTable table) {

     String usernamr  =table.cell(1,0);
      String password =table.cell(1,1);



    }

    @When("kullanici invalid credentials girer")
    public void kullaniciinvalidCredentialsGirer(DataTable table) {




    }


}
