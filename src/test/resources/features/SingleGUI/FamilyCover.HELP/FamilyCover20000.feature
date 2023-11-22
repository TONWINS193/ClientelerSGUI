Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given User Log in SGUI  website.

  Scenario Outline: User capture Family sale for lump sum cover of R20000 for different age
    When User log in with valid credentials By entering, "<Username>", "<Password>"
    Then User select Plan Cover on dropdown text list, "<CoverPlan>"
    When User Select the Plan option:Member and family By selecting, "<PlanOption>"
    Then User Select the Date of Birth of the main Life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the Plan chosen..
    Then User add member details By Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User add payer details By Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then User add spouse details By Capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When User add child details By Capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then user Proceed with the Cover and conclude sale..


    Examples:
      | Username | Password     | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      |ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      | WRambau  | clientele |     YA    |   Family   | 1993-06-03 |    Mr       | Shade      | Mills         |       Yes         | 9306038944189 | 9306038944189 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       |Miss       | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    1     | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith         | Female       | 9806030543186 |Micheal   | Smith        | Male        | 1406030809188 |     Yes        |