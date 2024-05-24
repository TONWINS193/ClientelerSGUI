package PageObjects.Legal;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EnhancedExtendedLegalFamily extends PageObject {
    String Url = "https://shambawebuat.clientele.co.za/shambaweb/";


    String LoginBtn = "//button[@type='submit']//span[contains(text(),'Login')]";

    String UserName = "//input[@placeholder='Username']";


    String NextBtn = "//*[@id=\"idSIButton9\"]";

    String Password = "//input[@placeholder='Password']";


    String SignIn = "//*[@id=\"idSIButton9\"]";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/nav/div[1]/a/div/i";

    String LeadBasketFilterXpath = "(//input[@id='LeasdsBasketFilter'])[2]";

    String leadCheckBox = "(//input[@id='undefined'])[1]";

    String ActionSaleBtn = "(//i[@class='bi bi-cash-coin'])[1]";

    String LEGALProductXpath = "//img[@src='assets/Legal.png']";

    String PlanTypeDropdown = "//select[@formcontrolname=\"plan\" ]";


    String SelectPlanOkBtn = "//button[@class=\"btn btn-success\"]";

    String GetRatesBtn = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";

    String PlanOptionXpath = "//select[@formcontrolname=\"planOption\"]";
    String MainLifeDoB = "//input[@type='text']";

    String SliderBarXpath = "//span[@class='ngx-slider-span ngx-slider-bar-wrapper ngx-slider-full-bar']";

    String ViewRates = "//span[@class='title']";

    String StartSale = "//*[@id=\"bootstrap-table\"]/tbody/tr/td[9]/button[1]/span/i";

    String FAISXpath = "//button[normalize-space()='Continue']";

    String TittleXpath = "//select[@id='Title']";

    String NameXpath = "//input[@id='FirstNames']";

    String SurnameXpath = "//input[@id='Surname']";

    String SACitizenXpath = "//select[@id='IsSouthAfricanCitizen']";

    String IDNumberXpath = "//input[@id='IdentityNumber']";

    String MainInputID = "//input[@id='mainInput']";

    String ConfirmID = "//input[@id='confirmationInput']";

    String OKButton = "//span[normalize-space()='Ok']";

    String DoBXpath = "//input[@id='DateOfBirth']";

    String MonthlyIncomeXpath = "//select[@id='MonthlyIncomeRange']";

    String OccupationXpath = "//select[@id='Occupation']";

    String EducationXpath = "//select[@id='EducationLevel']";

    String CellNumberXpath = "//input[@id='MobileTelephoneNumber']";

    String PostalAddressXpath = "//*[@id=\"PostalAddressLine1\"]";

    String PostalCodeXpath = "//input[@id='PostalAddressCode']";

    String CopyPhysicalXpath = "//*[@id=\"ngb-nav-0-panel\"]/div[1]/div/div/button";

    String ValidateBtnXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[1]/div/form/div/div[2]/div[5]/div/shamba-address/div/div[2]/div[3]/div/button/span";

    String SaveMainMemberXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[2]/div/div[2]/button";

    String PayerXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[6]/div[2]";

    String PayerTittleXpath = "//select[@id='Title']";

    String PayerNameXpath = "//input[@id='FirstNames']";

    String PayerSurnameXpath = "//input[@id='Surname']";

    String PayerIDXpath = "//input[@id='IdentityNumber']";

    String MainIDXpath = "//input[@id='mainInput']";

    String ConfirmIDXpath = "//input[@id='confirmationInput']";

    String OKPopUpXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String PayerRelationXpath = "//select[@id='RelationToMember']";

    String PayerDebitXpath = "//select[@id='DebitDay']";

    String FirstDebitXpath = "//select[@id='FirstDebitDate']";

    String BankNameXpath = "//select[@id='BankName']";

    String BranchCodeXpath = "//select[@id='BankBranchCode']";

    String AcctTypeXpath = "//select[@id='BankAccountType']";

    String BankAccNumXpath = "//input[@id='BankAccountNumber']";

    String AccountXpath = "//input[@id='mainInput']";

    String ConfAccXpath = "//input[@id='confirmationInput']";

    String OKButtonXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";
    String SpouseTitleXpath = "//*[@id=\"Title\"]";

    String NamesXpath = "//*[@id=\"FirstNames\"]";

    String SurnameSXpath = "//*[@id=\"Surname\"]";

    String GenderXpath = "//*[@id=\"Gender\"]";

    String IDNumberSXpath = "//*[@id=\"IdentityNumber\"]";

    String SaveSpouse = "//button[@class='btn btn-success']";


    String MobileNumXpath = "//input[@id='MobileTelephoneNumber']";

    String EmpStatusXpath = "//select[@id='IsEmployee']";
    String EmployeeNmb = "//input[@id=\"EmployeeNumber\"]";
    String Department = "//select[@id=\"Department\"]";
    String DeductionAuthorization = "//select[@id=\"Authorised\"]";


    String ConfirmCheckBoxXpath = "(//input[@type='checkbox'])[1]";

    String CheckBox1Xpath = "(//input[@type='checkbox'])[2]";

    String SavePayerXpath = "//button[@class='btn btn-success']";

    String SpouseXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[2]/div[2]";

    String ChildXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[3]/div[2]";


    String AddChildBtn = "//span[@class=\"title\"]";

    String childName = "//input[@id=\"FirstNames\"]";

    String childSurNameXpath = "//input[@id=\"Surname\"]";

    String childGender = "//select[@id=\"Gender\"]";
    String childIDnumber = "//*[@id=\"IdentityNumber\"]";

    String ChildisStudent = "//select[@id=\"IsStudent\"]";

    String saveChildBtn = "//button[@type='button']";
    // "//*[@id=\"mat-dialog-12\"]/app-shamba-modal/div/div[2]/div/child-create/div/div[3]/div/div/button";

    String NavigateMemberPage = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[4]/div[1]";
    // "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/div[2]";

    String AddExtFamily = "//*[@id=\"pills-tabContent\"]/extended-family/div/div[2]/div/div/div/div[2]/button";
    // "(//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary'])[1]";
    String ExtTitle = "//*[@id=\"Title\"]";
    String ExtName = "//*[@id=\"FirstNames\"]";
    String ExtSurname = "//*[@id=\"Surname\"]";
    String ExtRelationship = "//*[@id=\"RelationToMember\"]";
    String PremiumFeeXpath = "//*[@id=\"PremiumFree\"]";
    String ExtIdNumber = "//*[@id=\"IdentityNumber\"]";
    String ExtGender = "//*[@id=\"Gender\"]";
    String SaveMember = "(//button[normalize-space()='Save Member'])[1]";
    String BeneficiaryXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/div[2]";

    String AddBenXpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";

    String RelationXpath = "//select[@id='Relation']";

    String SaveBenXpath = "//span[normalize-space()='Save Beneficiary']";

    String FICAXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[7]/div[2]";

    String PremiumXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[8]/div[2]";

    String RewardsXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[9]/div[2]";

    String SummaryXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[10]/div[2]";

    String ConfirmDebiCheckXpath = "//input[@type='checkbox'][1]";

    String SummaryTableXpath = "//table[@id='bootstrap-table']";
    String AllXpath = "//shamba-input[@ng-reflect-label='All']//input[@id='LeasdsBasketFilter']";
    String NavBarXpath = "//div[@class='test']//a[@id='navbarDropdown']";

    String ConvertTo = "//*[@id=\"productConversion\"]";
    //  Clientele Standard Legal Policy (Member Only)
    String BenefitsCheck = "(//input[@type='checkbox'])[1]";
    String SavePremium = "(//button[@type='button'])[1]";
    // "//*[@id="pills-tabContent"]/premium/div/div/div/div[4]/div/div/div/button"

    // //li[@class='ng-star-inserted nav-item-active']//a
    // "(//div[@class='title'])[5]";
// /html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/a
// //li[@class='ng-star-inserted nav-item-active']//div[@class='title']
    // "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/div[2]";
    // "//li[@class='ng-star-inserted nav-item-active']//a";
    // /html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/a
    // /html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/a


    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
        $(By.xpath(NavBarXpath)).click();

    }


//        @Step("Click on Arrow Btn")
//        public void clickOnArrowButton() {
//            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(13));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NavBarXpath))).click();
//        }
//        @Step("Click on the navigation bar")
//        public void NavBar() throws InterruptedException {
//            Thread.sleep(5000);
//            $(By.xpath(NavBarXpath)).click();
//        }


    @Step("Login in using valid Credentials")
    public void loginIn(String Username, String password) {
        WebElement UN = $(By.xpath(UserName));
        UN.sendKeys(Username);
        WebElement Sur = $(By.xpath(Password));
        Sur.sendKeys(password);
        $(By.xpath(LoginBtn)).click();


    }

    @Step("Clicks on ClienteleLogo")
    public void ClienteleLogo() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(ClienteleLogoXpath)).click();


    }

    @Step("Clicks on CaptureSale")
    public void CaptureSale() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(CaptureSaleXpath)).click();

    }


    @Step("Clicks on LeadBasket")
    public void LeadBasket() throws InterruptedException {
        Thread.sleep(7000);

        $(By.xpath(LeadBasketXpath)).click();

    }
    @Step("Click on on refresh")
    public void Refresh(){
        $(By.xpath("/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/shamba-lead-basket/div/div/div/div/div/div[1]/shamba-lead-basket-filter/div/div[1]/div[2]/button")).click();
    }

    @Step("Select New on lead basket filter ")
    public void selectNew() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(LeadBasketFilterXpath)).click();

// AllXpath
        // $(By.xpath(LeadBasketFilterXpath)).click();
    }

    @Step("Select a lead to action a sale")
    public void LeadCheckBox() throws InterruptedException {
        Thread.sleep(5000);

        WebElement checkbox = $(By.xpath(leadCheckBox));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }


    }

    @Step("Click on Action sale Button")
    public void ActionSaleButton() throws InterruptedException {
        Thread.sleep(5000);

        WebElement startSale = $(By.xpath(ActionSaleBtn));

        if (!startSale.isSelected()) {
            startSale.click();
        }


    }


    @Step("Click on Help Icon Button")
    public void legalIconButton() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(LEGALProductXpath)).click();
    }

    @Step("Click on Select Plan Text Dropdown and select Life Plan")
    public void SelectPlanTextDropdown(String SelectPlan) throws InterruptedException {
        Thread.sleep(5000);

        WebElement dropdown = $(By.xpath(PlanTypeDropdown));
        Select selectObject = new Select(dropdown);

        selectObject.selectByVisibleText(SelectPlan);

    }

    @Step("Click on Ok Button to proceed")
    public void SelectPlanOkBtn() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(SelectPlanOkBtn)).click();

    }

    @Step("Click on Get Rates Button")
    public void GetRatesBtn() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(GetRatesBtn)).click();
    }


    @Step("Click on Plan Option and select Cover")
    public void SelectPlanOptionII(String PlanOPss) throws InterruptedException {
        Thread.sleep(5000);
//
//        WebElement dropdown = $(By.xpath(PlanOptionXpath));
//        Select selectObject = new Select(dropdown);
//        selectObject.selectByVisibleText("Family");

        WebElement dropdownOpp = $(By.xpath(PlanOptionXpath));
        Select selectObject = new Select(dropdownOpp);
        selectObject.selectByVisibleText(PlanOPss);

    }

    @Step("Click on Main life DoB text field and select dates")
    public void SelectDoB(String mainLifeDOB) throws InterruptedException {
        Thread.sleep(5000);

        WebElement DoB = $(By.xpath(MainLifeDoB));

        DoB.click();

        DoB.sendKeys(mainLifeDOB + Keys.ENTER);

    }

    @Step("Select cover amount of R15000 on the slider bar")
    public void selectCoverAmount() throws InterruptedException {
        Thread.sleep(7000);

        // $(By.xpath(SliderBarXpath)).click();

        WebElement sliderPointer = $(By.xpath("//body[1]/shamba-root[1]/shamba-layout[1]/div[1]/div[2]/sale[1]/div[1]/div[2]/div[1]/app-sale-capture[1]/div[1]/div[1]/div[1]/div[1]/div[2]/quote-create[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ngx-slider[1]/span[12]/span[2]/ngx-slider-tooltip-wrapper[1]/div[1]"));
        sliderPointer.click();
        // 1 = "(//span[@aria-label='ngx-slider'])[1]"
//  550 000 = //body[1]/shamba-root[1]/shamba-layout[1]/div[1]/div[2]/sale[1]/div[1]/div[2]/div[1]/app-sale-capture[1]/div[1]/div[1]/div[1]/div[1]/div[2]/quote-create[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ngx-slider[1]/span[12]/span[2]/ngx-slider-tooltip-wrapper[1]/div[1]
        // 605 000 = //body[1]/shamba-root[1]/shamba-layout[1]/div[1]/div[2]/sale[1]/div[1]/div[2]/div[1]/app-sale-capture[1]/div[1]/div[1]/div[1]/div[1]/div[2]/quote-create[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ngx-slider[1]/span[12]/span[3]/ngx-slider-tooltip-wrapper[1]/div[1]
    }

    @Step("Click on view button to proceed with quotes")
    public void ViewRates() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(ViewRates)).click();
    }

    @Step("Click on Start Sale Button")
    public void StartSale() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(StartSale)).click();

    }

    @Step("Click continue or cancel button on FAIS Disclosure PopUp Link")
    public void handleModelPopUp() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FAISXpath)));

        element.click();


    }

    @Step("Select Tittle type from dropdown")
    public void selectTittleDropdown(String Tittle) throws InterruptedException {
        Thread.sleep(3000);

        WebElement dropdown = $(By.xpath(TittleXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Tittle);
    }

    @Step("Enter Name(s) on input field text")
    public void EnterName(String Name) {

        WebElement fieldText = $(By.xpath(NameXpath));
        fieldText.click();
        fieldText.sendKeys(Name);

    }

    @Step("Enter Surname on input field text")
    public void EnterSurname(String Surname) {
        WebElement fieldText = $(By.xpath(SurnameXpath));
        fieldText.click();
        fieldText.sendKeys(Surname);
    }

    @Step("Select South African Citizen dropdown field")
    public void selectSACitizen(String SouthAfricanCitizen) {
        WebElement dropdown = $(By.xpath(SACitizenXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByVisibleText(SouthAfricanCitizen);
    }

    @Step("Click on ID text box")
    public void clickTextBox() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement fieldText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(IDNumberXpath)));
        fieldText.click();


    }

    @Step("Click on ID Number MainInput PopUp ")
    public void enterID(String IDNumber1) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement mainIDPopUP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainInputID)));
        mainIDPopUP.click();
        mainIDPopUP.sendKeys(IDNumber1);

    }

    @Step("Click on confirm ID Number PopUp")
    public void confirmID(String IDNumber2) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement confirmInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmID)));
        confirmInput.click();
        confirmInput.sendKeys(IDNumber2);

    }

    @Step("Click on OKButton")
    public void clickOKButton() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement OKBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OKButton)));
        OKBtn.click();

    }

    @Step("Enter Date of Birth on input field text")
    public void EnterDoB(String DateOfBirth) {
        WebElement fieldText = $(By.xpath(DoBXpath));
        fieldText.click();
        fieldText.sendKeys(DateOfBirth);

    }

    @Step("Select monthly income from dropdown")
    public void selectMonthlyIncome(String MonthlyIncome) {
        WebElement dropdown = $(By.xpath(MonthlyIncomeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(MonthlyIncome);

    }

    @Step("Select Occupation from dropdown")
    public void selectOccupation(String Occupation) {
        WebElement dropdown = $(By.xpath(OccupationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Occupation);

    }


    @Step("Select Education from dropdown")
    public void selectEduction(String Education) throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropdown = $(By.xpath(EducationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Education);
    }

    @Step("Enter Cell Number on field text ")
    public void enterCellNum(String CellNumber) {

        WebElement MobileNum = $(By.xpath(CellNumberXpath));

        MobileNum.click();
        MobileNum.sendKeys(CellNumber);


    }

    @Step("Enter Postal Address on field text")
    public void enterPostalAddress(String PostalAddress) {

        WebElement element = $(By.xpath(PostalAddressXpath));

        element.click();
        element.sendKeys(PostalAddress);
    }

    @Step("Enter Postal Code on field text")
    public void enterPostalCode(String PostalCode) {

        WebElement element = $(By.xpath(PostalCodeXpath));

        element.click();
        element.sendKeys(PostalCode);

    }

    @Step("Click on Copy to Physical")
    public void clickCopyPhysical() {

        WebElement element = $(By.xpath(CopyPhysicalXpath));

        element.click();
    }

    @Step("Click on Validate button")
    public void clickValidateBtn() throws InterruptedException {
        Thread.sleep(3000);

        WebElement element = $(By.xpath(ValidateBtnXpath));

        element.click();

    }

    @Step("Click on Save Main Member button")
    public void clickSaveMMBtn() {

        WebElement button = $(By.xpath(SaveMainMemberXpath));

        button.click();
    }

    @Step("Navigate Payer page")
    public void navigatePayer() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(PayerXpath)).click();
    }

    @Step("Select Tittle from dropdown")
    public void selectTittle(String PayerTitle) {
        WebElement tittleDropdown = $(By.xpath(PayerTittleXpath));
        Select selectObject = new Select(tittleDropdown);

        selectObject.selectByValue(PayerTitle);

    }

    @Step("Enter Name on field text")
    public void enterName(String PayerName) {
        WebElement fieldText = $(By.xpath(PayerNameXpath));
        fieldText.click();
        fieldText.sendKeys(PayerName);

    }

    @Step("Enter Surname on field text")
    public void enterSurname(String PayerSurname) {
        WebElement fieldText = $(By.xpath(PayerSurnameXpath));
        fieldText.click();
        fieldText.sendKeys(PayerSurname);

    }

    @Step("Click on Payer ID text field")
    public void fieldTextID() {
        WebElement fieldText = $(By.xpath(PayerIDXpath));
        fieldText.click();
    }

    @Step("Enter ID on MainInput PopUp")
    public void mainIDPopUp(String PayerID1) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement mainID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainIDXpath)));
        mainID.click();
        mainID.sendKeys(PayerID1);

    }

    @Step("Enter Confirmation of ID on PopUp field text")
    public void confirmationID(String PayerID2) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement confirmID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmIDXpath)));
        confirmID.click();
        confirmID.sendKeys(PayerID2);
    }

    @Step("Click  OK button to capture ID")
    public void clickOK() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(OKPopUpXpath)).click();
    }

    @Step("Select the Relationship from dropdown list")
    public void PayerRelation(String Relationship) {
        WebElement dropdown = $(By.xpath(PayerRelationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Relationship);
    }

    @Step("Select Debit day from dropdown list")
    public void selectDebit(String DebitDay) {
        WebElement dropdown = $(By.xpath(PayerDebitXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(DebitDay);
    }

    @Step("Select Debit date from dropdown list")
    public void selectDebiDate(String DebitDate) throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropdown = $(By.xpath(FirstDebitXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(DebitDate);
    }

    @Step("Select Bank Name from dropdown list")
    public void selectBank(String BankName) {
        WebElement dropdown = $(By.xpath(BankNameXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(BankName);
    }

    @Step("Select Branch Code from dropdown ")
    public void selectBranch(String BranchCode) {
        WebElement dropdown = $(By.xpath(BranchCodeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(BranchCode);

    }

    @Step("Select Account Type from dropdown")
    public void selectAccType(String AccountType) {
        WebElement dropdown = $(By.xpath(AcctTypeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(AccountType);

    }

    @Step("Click Account Number on the text field")
    public void enterAccNum() {
        WebElement element = $(By.xpath(BankAccNumXpath));
        element.click();


    }

    @Step("Enter Account Number on Main text field")
    public void enterMainAcc(String AccountNumber1) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement mainAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AccountXpath)));
        mainAcc.click();
        mainAcc.sendKeys(AccountNumber1);

    }

    @Step("Enter Confirmation of Account number on the text field")
    public void confirmAccount(String AccountNumber2) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement mainAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfAccXpath)));
        mainAcc.click();
        mainAcc.sendKeys(AccountNumber2);

    }

    @Step("Click OK button for Account number to be captured on the text field")
    public void OKButton() {
        $(By.xpath(OKButtonXpath)).click();

    }


    @Step("Select the spouse title")
    public void SpouseTitle(String SpouseTitle) {
        WebElement St = $(By.xpath(SpouseTitleXpath));
        selectFromDropdown(St, SpouseTitle);

    }

    @Step("Enter spouse name")
    public void SpouseName(String SpouseName) {
        $(By.xpath(NamesXpath)).sendKeys(SpouseName);
    }

    @Step("enter spouse surname")
    public void spouseSurname(String spouseSurname) {
        $(By.xpath(SurnameSXpath)).sendKeys(spouseSurname);
    }


    @Step("select spouse gender")
    public void SelectSpouseGender(String SpouseGender) {
        Select product = new Select(getDriver().findElement(By.xpath(GenderXpath)));
        product.selectByValue(SpouseGender);


    }

    @Step("Enter ID number")
    public void SpouseIDNumber(String SpouseIDNumber) {
        $(By.xpath(IDNumberSXpath)).sendKeys(SpouseIDNumber);
    }


    @Step("Save Spouse ")
    public void SaveSpouse() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(SaveSpouse)).click();
    }


    @Step("Navigate Child")
    public void NavigateChild() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(ChildXpath)).click();
    }


    @Step("Enter child name")
    public void EnterChildName(String ChildName) {
        $(By.xpath(childName)).sendKeys(ChildName);


    }

    @Step("Add a child ")
    public void addChild() {
        $(By.xpath(AddChildBtn)).click();
    }

    @Step("Enter a child surname")
    public void childSurname(String childSurname) {
        $(By.xpath(childSurNameXpath)).sendKeys(childSurname);
    }


    @Step("Select gender for a child")
    public void childGen(String ChildGender) {
        WebElement Cg = $(By.xpath(childGender));
        selectFromDropdown(Cg, ChildGender);


    }


    @Step("Enter child ID Number")
    public void ChildIDNumber(String ChildIDNumber) {
        $(By.xpath(childIDnumber)).sendKeys(ChildIDNumber);
    }


    @Step("select whether child is a student or not")
    public void ChildIsStudent(String ChildIsStudent) {
        WebElement Cs = $(By.xpath(ChildisStudent));
        selectFromDropdown(Cs, ChildIsStudent);


    }

    @Step("Save child details")
    public void SAVEChild() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(saveChildBtn)).click();
    }

    @Step("Navigate Extended Member page ")
    public void NavExtMemberPage() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
//        WebElement Nm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NavigateMemberPage)));
//        Nm.click();
        Thread.sleep(5000);
        $(By.xpath(NavigateMemberPage)).click();
    }

    @Step("Add a Extended Member  ")
    public void addExtFamily() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement Ae = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddExtFamily)));
        Ae.click();
    }


    @Step("Select the Extended member  title")
    public void ExtendedTitle(String ExtMemberTitle) {
        WebElement Ex = $(By.xpath(ExtTitle));
        selectFromDropdown(Ex, ExtMemberTitle);

    }

    @Step("Enter Extended member name")
    public void ExtMemName(String ExtMmemberName) {
        $(By.xpath(ExtName)).sendKeys(ExtMmemberName);
    }


    @Step("enter Extended member surname")
    public void ExtMemSurname(String ExtMmemberSurname) {
        $(By.xpath(ExtSurname)).sendKeys(ExtMmemberSurname);
    }


    @Step("select Extended member gender")
    public void SelectExtendedmemberGender(String ExtMmemberGender) {
        Select product = new Select(getDriver().findElement(By.xpath(ExtGender)));
        product.selectByValue(ExtMmemberGender);


    }

    @Step("Enter ExtMmemberID number")
    public void ExtMmemberIDNumber(String ExtMmemberIDNumber) {
        $(By.xpath(ExtIdNumber)).sendKeys(ExtMmemberIDNumber);
    }


    @Step("Save Member ")
    public void SaveMember() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(SaveMember)).click();
    }

    @Step("select Extended member Relationship")
    public void SelectExtendedmemberRelationship(String ExtMmemberRelationship) {
        Select product = new Select(getDriver().findElement(By.xpath(ExtRelationship)));
        product.selectByValue(ExtMmemberRelationship);
    }


    @Step("Add a Extended Member  ")
    public void addExtFamilyII() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
//        WebElement Ab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddExtFamily)));
//        Ab.click();
        Thread.sleep(5000);
        $(By.xpath(AddExtFamily)).click();
    }


    @Step("Select the Extended member  title")
    public void ExtendedTitleII(String ExtMemberTitleII) {
        WebElement Ex = $(By.xpath(ExtTitle));
        selectFromDropdown(Ex, ExtMemberTitleII);

    }

    @Step("Enter Extended member name")
    public void ExtMemNameII(String ExtMmemberNameII) {
        $(By.xpath(ExtName)).sendKeys(ExtMmemberNameII);
    }


    @Step("enter Extended member surname")
    public void ExtMemSurnameII(String ExtMmemberSurnameII) {
        $(By.xpath(ExtSurname)).sendKeys(ExtMmemberSurnameII);
    }


    @Step("select Extended member gender")
    public void SelectExtendedmemberGenderII(String ExtMmemberGenderII) {
        Select product = new Select(getDriver().findElement(By.xpath(ExtGender)));
        product.selectByValue(ExtMmemberGenderII);


    }

    @Step("Enter ExtMmemberID number")
    public void ExtMmemberIDNumberII(String ExtMmemberIDNumberII) {
        $(By.xpath(ExtIdNumber)).sendKeys(ExtMmemberIDNumberII);
    }


    @Step("Save Member ")
    public void SaveMemberII() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(SaveMember)).click();
    }

    @Step("select Extended member Relationship")
    public void SelectExtendedmemberRelationshipII(String ExtMmemberRelationshipII) {
        Select product = new Select(getDriver().findElement(By.xpath(ExtRelationship)));
        product.selectByValue(ExtMmemberRelationshipII);
    }


    @Step("Select premium fee")
    public void PremiumFeeII(String PreFeeII) {
        Select product = new Select(getDriver().findElement(By.xpath(PremiumFeeXpath)));
        product.selectByValue(PreFeeII);
    }


    @Step("Select premium fee")
    public void PremiumFee(String PreFee) {
        Select product = new Select(getDriver().findElement(By.xpath(PremiumFeeXpath)));
        product.selectByValue(PreFee);
    }

    @Step("Add a Extended Member  ")
    public void addExtFamilyIII() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
//        WebElement Ac = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddExtFamily)));
//        Ac.click();
        Thread.sleep(5000);
        $(By.xpath(AddExtFamily)).click();
    }


    @Step("Select the Extended member  title")
    public void ExtendedTitleIII(String ExtMemberTitleIII) {
        WebElement Ex = $(By.xpath(ExtTitle));
        selectFromDropdown(Ex, ExtMemberTitleIII);

    }

    @Step("Enter Extended member name")
    public void ExtMemNameIII(String ExtMmemberNameIII) {
        $(By.xpath(ExtName)).sendKeys(ExtMmemberNameIII);
    }


    @Step("enter Extended member surname")
    public void ExtMemSurnameIII(String ExtMmemberSurnameIII) {
        $(By.xpath(ExtSurname)).sendKeys(ExtMmemberSurnameIII);
    }


    @Step("select Extended member gender")
    public void SelectExtendedmemberGenderIII(String ExtMmemberGenderIII) {
        Select product = new Select(getDriver().findElement(By.xpath(ExtGender)));
        product.selectByValue(ExtMmemberGenderIII);


    }

    @Step("Enter ExtMmemberID number")
    public void ExtMmemberIDNumberIII(String ExtMmemberIDNumberIII) {
        $(By.xpath(ExtIdNumber)).sendKeys(ExtMmemberIDNumberIII);
    }


    @Step("Save Member ")
    public void SaveMemberIII() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(SaveMember)).click();
    }

    @Step("select Extended member Relationship")
    public void SelectExtendedmemberRelationshipIII(String ExtMmemberRelationshipIII) {
        Select product = new Select(getDriver().findElement(By.xpath(ExtRelationship)));
        product.selectByValue(ExtMmemberRelationshipIII);
    }


    @Step("Select premium fee")
    public void PremiumFeeIII(String PreFeeIII) {
        Select product = new Select(getDriver().findElement(By.xpath(PremiumFeeXpath)));
        product.selectByValue(PreFeeIII);
    }


    @Step("Add a Extended Member  ")
    public void addExtFamily4() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
//        WebElement Ad = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddExtFamily)));
//        Ad.click();
        Thread.sleep(5000);
        $(By.xpath(AddExtFamily)).click();
    }


    @Step("Select the Extended member  title")
    public void ExtendedTitle4(String ExtMemberTitle4) {
        WebElement Ex = $(By.xpath(ExtTitle));
        selectFromDropdown(Ex, ExtMemberTitle4);

    }


    @Step("Enter Extended member name")
    public void ExtMemName4(String ExtMmemberName4) {
        $(By.xpath(ExtName)).sendKeys(ExtMmemberName4);
    }


    @Step("enter Extended member surname")
    public void ExtMemSurname4(String ExtMmemberSurname4) {
        $(By.xpath(ExtSurname)).sendKeys(ExtMmemberSurname4);
    }


    @Step("select Extended member gender")
    public void SelectExtendedmemberGender4(String ExtMmemberGender4) {
        Select product = new Select(getDriver().findElement(By.xpath(ExtGender)));
        product.selectByValue(ExtMmemberGender4);


    }

    @Step("Enter ExtMmemberID number")
    public void ExtMmemberIDNumber4(String ExtMmemberIDNumber4) {
        $(By.xpath(ExtIdNumber)).sendKeys(ExtMmemberIDNumber4);
    }


    @Step("Save Member ")
    public void SaveMember4() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(SaveMember)).click();
    }

    @Step("select Extended member Relationship")
    public void SelectExtendedmemberRelationship4(String ExtMmemberRelationship4) {
        Select product = new Select(getDriver().findElement(By.xpath(ExtRelationship)));
        product.selectByValue(ExtMmemberRelationship4);
    }


    @Step("Select premium fee")
    public void PremiumFee4(String PreFee4) {
        Select product = new Select(getDriver().findElement(By.xpath(PremiumFeeXpath)));
        product.selectByValue(PreFee4);
    }

    @Step("Enter Mobile Number on the text field")
    public void enterMobiNum(String MobileNumber) {
        WebElement element = $(By.xpath(MobileNumXpath));
        element.click();
        element.sendKeys(MobileNumber);

    }

    @Step("Select if Payer is employee from dropdown")
    public void isEmployee(String IsEmployee) {
        WebElement dropdown = $(By.xpath(EmpStatusXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(IsEmployee);

    }

    @Step("Enter employee number")
    public void EmployeeNmb(String EmployeeNmber) {
        WebElement element = $(By.xpath(EmployeeNmb));
        element.click();
        element.sendKeys(EmployeeNmber);
    }

    @Step("Select Department")
    public void Department(String EmpDepartment) {
        WebElement dropdown = $(By.xpath(Department));
        Select selectObject = new Select(dropdown);

        selectObject.selectByVisibleText(EmpDepartment);
    }

    @Step("Deduction Authorised")
    public void SelectDeductionAuth(String Deduction) {
        WebElement dropdown = $(By.xpath(DeductionAuthorization));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Deduction);
    }

    @Step("Select All checkboxes for confirmations of a Payer ")
    public void confCheckBoxes() {
        WebElement checkbox = $(By.xpath(ConfirmCheckBoxXpath));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        WebElement checkbox1 = $(By.xpath(CheckBox1Xpath));

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

    }

    @Step("Click on Save Payer Button")
    public void clickSaveBtn() {
        WebElement button = $(By.xpath(SavePayerXpath));
        button.click();

    }

    @Step("Navigate to Spouse Page")
    public void navigateSpouse() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(SpouseXpath)).click();
    }


    @Step("Navigate to Beneficiary Page")
    public void navigateBeneficiary() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(BeneficiaryXpath)).click();

    }

    @Step("Click on Add Beneficiary button")
    public void addBeneficiary() {

        $(By.xpath(AddBenXpath)).click();

    }

    @Step("Select Member Estate from Relationship dropdown")
    public void selectRelation(String BeneficiaryRelationship) {
        WebElement dropdown = $(By.xpath(RelationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(BeneficiaryRelationship);
    }

    @Step("Click Save Beneficiary Button")
    public void saveBeneficiary() throws InterruptedException {

        $(By.xpath(SaveBenXpath)).click();
        Thread.sleep(5000);

        WebElement PopUp = $(By.xpath("//button[@type='button']"));
        PopUp.click();

    }

    @Step("Navigate to FICA Page")
    public void navigateFICA() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(FICAXpath)).click();

        WebElement isProminentPublicOfficial = $(By.xpath("//select[@id='IsProminentPublicOfficial']"));
        Select selectObject = new Select(isProminentPublicOfficial);
        selectObject.selectByValue("No");

        WebElement isProminentInternationalPublicOfficial = $(By.xpath("//select[@id='IsProminentInternationalPublicOfficial']"));
        Select selectObject1 = new Select(isProminentInternationalPublicOfficial);
        selectObject1.selectByValue("No");

        $(By.xpath("//span[@class='title']")).click();

    }

    @Step("Navigate to Premium Page")
    public void navigatePremium() throws InterruptedException {
        Thread.sleep(4000);

        $(By.xpath(PremiumXpath)).click();

    }

    @Step("Convert Product")
    public void ConvertDropdown(String Convert) throws InterruptedException {
        Thread.sleep(5000);

        WebElement convert = $(By.xpath(ConvertTo));
        Select selectObject = new Select(convert);

        selectObject.selectByVisibleText(Convert);
    }

    //    @Step("Checkbox click")
//    public void permissionObtained() {
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        WebElement PO = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BenefitsCheck)));
//        PO.click();
//    }
    @Step("Save Premium")
    public void SavePremium() {
        $(By.xpath(SavePremium)).click();
    }


    @Step("Navigate to Rewards Page")
    public void navigateRewards() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(RewardsXpath)).click();

//        WebElement checkbox = $(By.xpath("(//input[@type='checkbox'])[1]"));
//
//        if (!checkbox.isSelected()) {
//            checkbox.click();
//        }

        WebElement savePremium = $(By.xpath("//span[@class='title']"));
        savePremium.click();

    }

    @Step("Navigate to Summary Page")
    public void navigateSummary()throws InterruptedException {
        Thread.sleep(10000);

        $(By.xpath(SummaryXpath)).click();

        $(By.xpath("//*[@id=\"pills-tabContent\"]/accept-sale/div/div[3]/div/div/div/button")).click();

        $(By.xpath("//input[@type='checkbox']")).click();

        $(By.xpath("//button[contains(text(),'Conclude Sale')]")).click();

        Thread.sleep(5000);


        if (isPopupPresent()) {
            $(By.xpath("//button[normalize-space()='Yes']")).click();
        } else {
            System.out.println("No popup detected. proceeding without clicking");
        }

    }

    private boolean isPopupPresent() throws InterruptedException {
        try {
            return $(By.xpath("//button[normalize-space()='Yes']")).isVisible();

        } catch (Exception e) {
            return false;
        }


    }




    @Step("Debi-check page")
    public void debiCheck()throws InterruptedException{
        Thread.sleep(20000);


        $(By.xpath(ConfirmDebiCheckXpath)).click();
        Thread.sleep(2000);


        $(By.xpath("(//button[@type='button'])[1]")).click();





    }
    @Step("Second sale")
    public void SecondSaleIiII(){
        $(By.xpath("//button[normalize-space()='Yes']")).click();
    }

    @Step("View summary table page")
    public void summaryTable()throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));

        WebElement bootstrap = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SummaryTableXpath)));
        bootstrap.click();





    }


}
