package com.alkosto.stepDefinitions;
/*
 * @(#) AddProductStepDef.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.alkosto.steps.HomeSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class AddProductStepDef {

    @Steps
    HomeSteps homeSteps;

    @Given("User open browser Alkosto.com")
    public void userOpenBrowserAlkostoCom() {
        homeSteps.onpenBrowser();

    }
    @When("User choose a category and subcategory")
    public void userChooseACategoryAndSubcategory() {
       // homeSteps.clicCategory();

    }
    @When("user user choose product")
    public void userUserChooseProduct() {
        homeSteps.busqueda();

    }
    @Then("User can view a message successfully")
    public void userCanViewAMessageSuccessfully() {

    }

}
