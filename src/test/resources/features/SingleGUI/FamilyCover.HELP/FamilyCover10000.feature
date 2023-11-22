Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user Log in SGUI  website

  Scenario Outline: User capture Family sale for lump sum cover of R10000 for different age
    When User log in with valid credentials by entering, "<Username>", "<Password>"
    Then User select plan cover on dropdown text list, "<CoverPlan>"
    When User Select the plan option:Member and family by selecting, "<PlanOption>"
    Then user Select the Date of birth of the main life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen.
    Then User add member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User add payer details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then User add spouse details by capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When User add child details by capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then user proceed with the Cover and conclude sale.


    Examples:
      | Username | Password     | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      |ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      | WRambau  | clientele |     YA    |   Family   | 1993-06-03 |    Mr       | Shade      | Mills         |       Yes         | 7006039911086 | 7006039911086 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       |Miss       | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    1     | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith         | Female       | 7006035228089 |Micheal   | Smith        | Male        | 1406030809188 |     Yes        |
      | WRambau  | clientele |     YA    |   Family   | 1993-06-03 |    Mr       | jacob      | smith         |       Yes         | 4206037075081 | 4206037075081 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       |Miss       | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    1     | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith         | Female       | 5806032760089 |Micheal   | Smith        | Male        | 1406030809188 |     Yes        |