Feature:Clientele Investment plan Functionality

  Background:
    Given user Log in SGUI   website.

  Scenario Outline: User capture Clientele Wealth Plan Cover for different age
    When User log in with Valid Credentials by entering, "<Username>", "<Password>"
    Then user select Plan Cover on dropdown text list, "<CoverPlan>"
    When User Add member details by Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    Then User Add payer details by Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    When user confirms Beneficiary, FICA and Premium Rates by capturing necessary details, "<BeneficiaryRelation>", "<IsProminentPublicOfficial>", "<IsProminentInternationalPublicOfficial>", "<PremiumRates>"
    Then user proceed with the Cover and Conclude sale.


    Examples:
      | Username | Password       | CoverPlan                 |  MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial | PremiumRates           |
      | WRambau  | clientele#2023 | Clientele Wealth Plan     |       Mr       | Shade      | Mills         |       Yes         | 9602018555189 | 9602018555189 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |Miss        | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    1     | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No       | Member Estate       |         No                |           No                           | Premium R400/ Cover R0 |