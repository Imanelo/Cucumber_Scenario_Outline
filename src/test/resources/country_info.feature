@CountryInfo
Feature: Country Information
  Scenario Outline: Get Country Details by Country Code
    Given I have a country code "<countryCode>"
    When I retrieve the country details
    Then I should get the country name "<countryName>"
    And the country capital "<countryCapital>"
    And the country population "<countryPopulation>"

    Examples:
      | countryCode | countryName | countryCapital | countryPopulation |
      | DE          | Germany     | Berlin         | 83240525          |
      | FR          | France      | Paris          | 67391582          |
      | GB          | United Kingdom of Great Britain and Northern Ireland | London       | 67215293          |