package com.cucumberTest.stepsDefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class CountryInfoStepDefinitions {
    private String countryCode;
    private Response response;

    @Given("I have a country code {string}")
    public void i_have_a_country_code(String countryCode) {
        this.countryCode = countryCode;
    }

    @When("I retrieve the country details")
    public void i_retrieve_the_country_details() {
        response = RestAssured.get("https://restcountries.com/v2/alpha/" + countryCode);
    }

    @Then("I should get the country name {string}")
    public void i_should_get_the_country_name(String expectedCountryName) {
        String actualCountryName = response.jsonPath().getString("name");
        assertEquals(expectedCountryName, actualCountryName);
    }

    @Then("the country capital {string}")
    public void the_country_capital(String expectedCountryCapital) {
        String actualCountryCapital = response.jsonPath().getString("capital");
        assertEquals(expectedCountryCapital, actualCountryCapital);
    }

    @Then("the country population {string}")
    public void the_country_population(String expectedCountryPopulation) {
        String actualCountryPopulation = response.jsonPath().getString("population");
        assertEquals(expectedCountryPopulation, actualCountryPopulation);
    }
}
