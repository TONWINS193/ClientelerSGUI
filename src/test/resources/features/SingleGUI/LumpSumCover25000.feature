Feature: Clientele accident plus health event life plan Functionality

  Background:
    Given user log in Shamba  website

  Scenario: User capture Individual sale for lump sum cover of R25000 for different age
    When user Select the plan option: Individual or Member and Family
    Then user Select the Date of Birth of the main life assured
    When user on the slider select the premium cover amounts that are applicable to the plan chosen
    Then user proceed with the Cover and Conclude sale