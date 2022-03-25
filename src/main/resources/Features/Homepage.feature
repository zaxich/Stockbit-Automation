Feature: Stockbit Homepage

  Scenario: Check header's link
    Given launch chrome browser
    When open Stockbit homepage
    Then verify that the logo is present in homepage
    And verify link of investing
    And verify link of Pro Tools
    And verify link of Academy
    And open Stockbit homepage
    And verify link of About Us
    And verify link of Blog
    And open Stockbit homepage
    And verify link of Help
    And close browser

  Scenario: Register and Login
    Given launch chrome browser
    When open Stockbit homepage
    Then verify register button's link
    And return to Homepage
    And verify login button's link
    And close browser