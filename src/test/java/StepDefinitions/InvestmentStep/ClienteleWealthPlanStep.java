package StepDefinitions.InvestmentStep;

import PageObjects.Investment.ClienteleWealthPlan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class ClienteleWealthPlanStep extends PageObject {

    @Steps
    ClienteleWealthPlan clienteleWealthPlan;

    @Given("user Log in SGUI   website.")
    public void user_log_in_sgui_website() throws InterruptedException {
        clienteleWealthPlan.OpenWebsite();
    }
    @When("User log in with Valid Credentials by entering, {string}, {string}")
    public void user_log_in_with_valid_credentials_by_entering(String string, String string2) throws InterruptedException {
        clienteleWealthPlan.clickArrowButton();
        clienteleWealthPlan.PopUpLogin(string, string2);
        clienteleWealthPlan.LoginButton();
        clienteleWealthPlan.ClienteleLogo();
        clienteleWealthPlan.CaptureSale();
        clienteleWealthPlan.LeadBasket();
        clienteleWealthPlan.selectNew();
        clienteleWealthPlan.LeadCheckBox();
        clienteleWealthPlan.ActionSaleButton();

    }
    @Then("user select Plan Cover on dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        clienteleWealthPlan.InvestmentTab();
        clienteleWealthPlan.SelectPlanTextDropdown(string);
        clienteleWealthPlan.SelectPlanOkBtn();
        clienteleWealthPlan.GetRatesBtn();
        clienteleWealthPlan.StartSalePopUp();
        clienteleWealthPlan.handleModelPopUp();

    }
    @When("User Add member details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        clienteleWealthPlan.selectTittleDropdown(string);
        clienteleWealthPlan.EnterName(string2);
        clienteleWealthPlan.EnterSurname(string3);
        clienteleWealthPlan.selectSACitizen(string4);
        clienteleWealthPlan.clickTextBox();
        clienteleWealthPlan.enterID(string5);
        clienteleWealthPlan.confirmID(string6);
        clienteleWealthPlan.clickOKButton();
        clienteleWealthPlan.selectMonthlyIncome(string7);
        clienteleWealthPlan.selectOccupation(string8);
        clienteleWealthPlan.selectEduction(string9);
        clienteleWealthPlan.enterCellNum(string10);
        clienteleWealthPlan.enterPostalAddress(string11);
        clienteleWealthPlan.enterPostalCode(string12);
        clienteleWealthPlan.clickCopyPhysical();
        clienteleWealthPlan.clickValidateBtn();
        clienteleWealthPlan.clickSaveMMBtn();

    }
    @Then("User Add payer details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        clienteleWealthPlan.navigatePayer();
        clienteleWealthPlan.selectTittle(string);
        clienteleWealthPlan.enterName(string2);
        clienteleWealthPlan.enterSurname(string3);
        clienteleWealthPlan.fieldTextID();
        clienteleWealthPlan.mainIDPopUp(string4);
        clienteleWealthPlan.confirmationID(string5);
        clienteleWealthPlan.clickOK();
        clienteleWealthPlan.PayerRelation(string6);
        clienteleWealthPlan.selectDebit(string7);
        clienteleWealthPlan.selectDebiDate(string8);
        clienteleWealthPlan.selectBank(string9);
        clienteleWealthPlan.selectBranch(string10);
        clienteleWealthPlan.selectAccType(string11);
        clienteleWealthPlan.enterAccNum();
        clienteleWealthPlan.enterMainAcc(string12);
        clienteleWealthPlan.confirmAccount(string13);
        clienteleWealthPlan.OKButton();
        clienteleWealthPlan.enterMobiNum(string14);
        clienteleWealthPlan.isEmployee(string15);
        clienteleWealthPlan.confCheckBoxes();
        clienteleWealthPlan.clickSaveBtn();

    }

    @When("user confirms Beneficiary, FICA and Premium Rates by capturing necessary details, {string}, {string}, {string}, {string}")
    public void user_confirms_beneficiary_fica_and_premium_rates_by_capturing_necessary_details(String string, String string2, String string3, String string4) throws InterruptedException {
        clienteleWealthPlan.navigateBeneficiary();
        clienteleWealthPlan.addBeneficiary();
        clienteleWealthPlan.selectRelation(string);
        clienteleWealthPlan.saveBeneficiary();
        clienteleWealthPlan.navigateFICA(string2, string3);
        clienteleWealthPlan.navigatePremium(string4);
    }
    @Then("user proceed with the Cover and Conclude sale.")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        clienteleWealthPlan.navigateRewards();
        clienteleWealthPlan.navigateSummary();
        clienteleWealthPlan.debiCheck();
        clienteleWealthPlan.summaryTable();


    }


}
