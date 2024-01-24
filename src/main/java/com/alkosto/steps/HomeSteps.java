package com.alkosto.steps;
/*
 * @(#) HomeSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.alkosto.pageObject.HomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

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

    @Step
    public void busqueda(){
        homePage.getDriver().findElement(
                homePage.getTxtBusqueda()
        ).sendKeys("celulares", Keys.ENTER);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.getDriver().findElement(
                homePage.getBtnBusqueda()
        ).click();
    }
}
