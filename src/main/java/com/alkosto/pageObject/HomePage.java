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
@Data
public class HomePage extends PageObject {
    private final By lnkCtryCompu= By.xpath("//a[@title='Computadores']");

}
