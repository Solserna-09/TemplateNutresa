package com.cajamenor.stepsDefinitions;


import com.cajamenor.driver.CustomChromeDriver;
import com.cajamenor.interaction.NavigateTo;
import com.cajamenor.models.setdata.CajaMenorLoombokData;
import com.cajamenor.question.ElementoPresente;
import com.cajamenor.task.AnticipoTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.cajamenor.userInterface.AnticipoUI.BTN_LOGO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CajaMenorStepDefinition {

    private Actor testActor;

    @Managed
    WebDriver driver;

    @Before
    public void setStage() {
        WebDriverManager.chromedriver().setup();
        CustomChromeDriver customDriver = new CustomChromeDriver();
        customDriver.initializeDriver();
        driver = customDriver.getDriver();
        testActor = Actor.named("Test").can(BrowseTheWeb.with(driver));
    }

    @Given("Ingreso a la web {string}")
    public void ingresoALaWeb(String url) {
        testActor.attemptsTo(NavigateTo.someUrl(url));
    }

    @When("Me este registrando")
    public void meEsteRegistrando(DataTable table) {
        testActor.wasAbleTo(
                AnticipoTask.on(CajaMenorLoombokData.setData(table).get(0))

        );


    }

    @Then("Quiero validar que este dentro")
    public void quieroValidarQueEsteDentro() {
        testActor.should(
                seeThat("el logo está presente",
                        ElementoPresente.en(BTN_LOGO)
                )
        );
    }
}