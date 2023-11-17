package com.alkosto.steps;
/*
 * @(#) HomeSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.alkosto.pageObject.HomePage;
import net.thucydides.core.annotations.Step;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomeSteps {
    HomePage homePage= new HomePage();

    @Step
    public void onpenBrowser(){
        homePage.openUrl("https://www.alkosto.com/");
    }

    @Step("Click on Category ")
    public void clicCategory(){
        homePage.getDriver().findElement(homePage.getLnkCtryCompu())
                .click();
    }
}
