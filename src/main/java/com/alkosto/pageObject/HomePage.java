package com.alkosto.pageObject;
/*
 * @(#) HomePage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */

public class HomePage extends PageObject {
    private final By lnkCtryCompu= By.xpath("//a[@title='Computadores']");

    private final By txtBusqueda= By.xpath("//input[@id=\"js-site-search-input\"]");
    private final  By btnBusqueda= By.xpath("//button[@class='ais-SearchBox-submit js-algolia-search-button btn']/i");

    public By getLnkCtryCompu() {
        return lnkCtryCompu;
    }

    public By getTxtBusqueda() {
        return txtBusqueda;
    }

    public By getBtnBusqueda() {
        return btnBusqueda;
    }
}
