Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user log in SGUI  website

  Scenario: User capture Individual sale for lump sum cover of R20000 for different age
    When user Select the plan option: Individual or Member and family
    Then user Select the Date of birth of the main life assured
    When user on the slider select the cover amounts that are applicable to the plan chosen
    Then user proceed with the Cover and conclude sale