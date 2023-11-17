Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user opens SGUI or shamba  website


  Scenario Outline: User capture Individual sale for lump sum cover of R15000 for different age
    And Login in using valid Credentials, "<Username>" and "<Password>"
    When user Select the plan option: Individual or member and family
    Then user Select the date of birth of the main life assured
    When user On the slider select the cover amounts that are applicable to the plan chosen
    Then user proceed with the cover and conclude sale

    Examples:
    | Username | Password
    | WRambau  | clientele00
