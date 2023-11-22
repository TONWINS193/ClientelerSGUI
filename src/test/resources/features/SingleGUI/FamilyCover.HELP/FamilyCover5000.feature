Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user log in SGUI  Website

  Scenario Outline: User capture Family sale for lump sum cover of R5000 for different age
    When user log in with valid credentials by entering, "<Username>", "<Password>"
    Then user select plan cover on dropdown text list, "<CoverPlan>"
    When user Select the plan option:Member and family by selecting, "<PlanOption>"
    Then User Select the Date of birth of the main life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen
    Then user add member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When user add payer details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then user add spouse details by capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When user add child details by capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then User proceed with the Cover and conclude sale


    Examples:
    | Username | Password     | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      |ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
    | WRambau  | clientele |     YA    |   Family   | 1993-06-03 |    Mr       | Shade      | Mills         |       Yes         | 9306037231182 | 9306037231182 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       |Miss       | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    1     | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith         | Female       | 9806032000185 |Micheal   | Smith        | Male        | 1406030809188 |     Yes        |











