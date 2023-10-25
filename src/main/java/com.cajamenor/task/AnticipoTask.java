package com.cajamenor.task;


import com.cajamenor.models.setdata.CajaMenorLoombokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.cajamenor.userInterface.AnticipoUI.*;

public class AnticipoTask implements Task {
    private final CajaMenorLoombokData cajaMenorLoombokData;

    public AnticipoTask(CajaMenorLoombokData cajaMenorLoombokData) {
        this.cajaMenorLoombokData = cajaMenorLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ANTICIPOS),
                Click.on(BTN_SOLICITAR_ANTICIPO),
                Enter.theValue(cajaMenorLoombokData.getMotivo()).into(BTN_MOTIVO),
                Enter.theValue(cajaMenorLoombokData.getValor()).into(BTN_VALOR),
                Click.on(BTN_SOLICITAR),
                Click.on(BTN_ANTICIPOS),
                Click.on(BTN_LOGO)

        );


    }

    public static AnticipoTask on(CajaMenorLoombokData cajaMenorLoombokData) {
        return Instrumented.instanceOf(AnticipoTask.class).withProperties(cajaMenorLoombokData);
    }
}
