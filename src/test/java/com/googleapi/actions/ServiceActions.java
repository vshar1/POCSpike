package com.googleapi.actions;

import com.googleapi.utils.Constants;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ServiceActions {

	public Response response;

	@Step
	public void requestBasicHealthCheck() throws Exception {
		response = SerenityRest.given()
				   .when()
                   .get(Constants.LOCAL_SERVICE_ENDPOINTS);
  	}

	@Step
	public int getStatusCode() throws Exception {
		return response.then().extract().statusCode();
	}

	@Step
	public String getContentType() throws Exception {
		return response.then().extract().contentType();
	}

}
