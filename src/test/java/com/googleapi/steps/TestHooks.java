package com.googleapi.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import net.thucydides.core.steps.StepEventBus;

public class TestHooks {

    static Scenario scenario;
    @Before
    public void setup() {
        System.out.println("   ====================================================================");
        System.out.println("   ========================== EXECUTING HOOKS =========================");
        System.out.println("   ==================================================================== \n");
    }

    @After
    public void report(Scenario scenario){
        System.out.println("   ======================= scenario =========================================");
    }

    /*@After("@status=passed")
    public void reportAsSuccess(Scenario scenario){
        System.out.println("   ======================= scenario status=passed =========================================");

    }*/
}
