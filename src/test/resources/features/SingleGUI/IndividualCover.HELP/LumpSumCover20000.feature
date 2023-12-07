Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user log in SGUI/shamba Website

  Scenario Outline: User capture Individual sale for lump sum cover of R20000 for different age
    When User log in With valid Credentials by entering, "<Username>", "<Password>"
    Then user select Plan cover On dropdown text list, "<CoverPlan>"
    When user Select the Plan option:Member and family By selecting, "<PlanOption>"
    Then User select the Date Of birth of the main life assured, "<MemberDOB>"
    When User on the Slider select the cover amounts that are applicable to the Plan Chosen
    Then user Add member details By capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When user add payer Details by Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    When user confirms Beneficiary, FICA and Premium Rates By capturing necessary details, "<BeneficiaryRelation>", "<IsProminentPublicOfficial>", "<IsProminentInternationalPublicOfficial>"
    Then User proceed with the Cover and Conclude sale.


    Examples:
      | Username | Password       | CoverPlan | PlanOption | MemberDOB | MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial |
      | spadayachy  | Marvel_2023 | YA        | Individual | 1993-08-03|     Mr        | Shade      | Mills         |       Yes         | 9308037623186 | 9308037623186 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |    Miss    | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    1     | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        | Member Estate       |         No                |           No                           |