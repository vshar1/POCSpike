package com.googleapi.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import com.googleapi.actions.ServiceActions;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ServiceStepdefs {

    @Steps
    ServiceActions serviceActions;

    @Given("^The user have access to the service$")
    public void theUserHaveAccessToTheService() throws Throwable {
        // TODO
    }

    @And("^user access the service endpoint$")
    public void userAccessTheServiceEndpoint() throws Throwable {
        serviceActions.requestBasicHealthCheck();
    }

    @Then("^user get the success response code$")
    public void userGetTheSuccessResponseCode() throws Throwable {
        assertThat("Verify Status code for service is 200 ", serviceActions.getStatusCode(), equalTo(200));

    }
}
