package com.cajamenor.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class AnticipoUI {

    public static final Target BTN_ANTICIPOS= Target.the("boton anticipos").locatedBy("//button[text()='Aceptar']");

    public static final Target BTN_SOLICITAR_ANTICIPO= Target.the("boton anticipos").locatedBy("//span[text()='Solicitar Anticipo']");

    public static final Target BTN_MOTIVO= Target.the("boton anticipos").locatedBy("//input[@name='reason']");

    public static final Target BTN_VALOR= Target.the("boton anticipos").locatedBy("//input[@name='value']");

    public static final Target BTN_SOLICITAR= Target.the("boton anticipos").locatedBy("//span[text()='Solicitar']");

    public static final Target BTN_LOGO= Target.the("boton anticipos").locatedBy("//img[@class='header-logo']");



}