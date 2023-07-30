package com.cucumberTest.stepsDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"com.cucumberTest.stepsDefinition"},
        plugin = {"pretty", "html:target/cucumber-report/country_info"},
        tags = "@CountryInfo",
        monochrome = true
)
public class RunCountryInfo {

}
