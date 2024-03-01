Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user log in SGUI Website

  Scenario Outline: User capture Individual sale for lump sum cover of R15000 for different age
    When user log in with valid Credentials by entering
    Then user select Plan cover on dropdown text list, "<CoverPlan>"
    When user Select the Plan option:Member and family by selecting, "<PlanOption>"
    Then User select the Date of birth of the main life assured, "<MemberDOB>"
    When User on the Slider select the cover amounts that are applicable to the plan chosen
    Then user Add member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When user add payer details by Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    When user confirms Beneficiary, FICA and Premium Rates by capturing necessary details, "<BeneficiaryRelation>", "<IsProminentPublicOfficial>", "<IsProminentInternationalPublicOfficial>"
    Then User proceed with the Cover and conclude sale.


    Examples:
      | CoverPlan | PlanOption | MemberDOB | MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial |
      | YF        | Individual | 1991-04-09|     Mr        | Shakes      | Mills         |       Yes         | 8206118093082 | 8206118093082 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |    Miss    | Joy       | McGregor     | 8806061211183 | 8806061211183  | Sister        |    15     | 15 Mar 2024 | ABSA BANK | 632005     | Savings Account | 1234          | 1234           | 0601234230   |       No        | Member Estate       |         No                |           No                           |
