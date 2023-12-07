Feature:Clientele Rewards plan Functionality

  Background:
    Given user Log In SGUI   website.

  Scenario Outline: User capture Clientele Perks Cover for different age
    When User Log in with Valid Credentials by Entering, "<Username>", "<Password>"
    Then user select Plan Cover On dropdown text list, "<CoverPlan>"
    When User Add Member details by Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    Then User Add Payer details by Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then User Proceed with the Cover and Conclude Sale.


    Examples:
      | Username | Password       | CoverPlan                 |  MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee |
      | WRambau  | clientele#2023 | Clientele Perks     |       Mr       | Sandile      | Mills         |       Yes         | 9605018211182 | 9605018211182 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |Miss        | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    25     | 25 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No       |