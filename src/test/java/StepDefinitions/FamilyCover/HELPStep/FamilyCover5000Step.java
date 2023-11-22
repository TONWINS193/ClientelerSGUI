package StepDefinitions.FamilyCover.HELPStep;

import PageObjects.FamilyCover.HELP.FamilyCover5000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class FamilyCover5000Step extends PageObject {

    @Steps
    FamilyCover5000 familyCover5000;


    @Given("user log in SGUI  Website")
    public void user_log_in_sgui_website() throws InterruptedException {
        familyCover5000.OpenWebsite();


    }

    @When("user log in with valid credentials by entering, {string}, {string}")
    public void user_log_in_with_valid_credentials_by_entering(String string, String string2) throws InterruptedException {
        familyCover5000.clickArrowButton();
        familyCover5000.PopUpLogin(string, string2);
        familyCover5000.LoginButton();
        familyCover5000.ClienteleLogo();
        familyCover5000.CaptureSale();
        familyCover5000.LeadBasket();
        familyCover5000.selectNew();
        familyCover5000.LeadCheckBox();
        familyCover5000.ActionSaleButton();
    }

    @Then("user select plan cover on dropdown text list, {string}")
    public void user_select_plan_cover_on_dropdown_text_list(String string) throws InterruptedException {
        familyCover5000.HelpIconButton();
        familyCover5000.SelectPlanTextDropdown(string);
        familyCover5000.SelectPlanOkBtn();

    }


    @When("user Select the plan option:Member and family by selecting, {string}")
    public void user_select_the_plan_option_member_and_family_by_selecting(String string) throws InterruptedException {
        familyCover5000.GetRatesBtn();
        familyCover5000.SelectPlanOption(string);

    }

    @Then("User Select the Date of birth of the main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        familyCover5000.SelectDoB(string);
    }

    @When("User on the slider select the cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        familyCover5000.ViewRates();
        familyCover5000.StartSale();
        familyCover5000.handleModelPopUp();

    }

    @Then("user add member details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws InterruptedException {
        familyCover5000.selectTittleDropdown(string);
        familyCover5000.EnterName(string2);
        familyCover5000.EnterSurname(string3);
        familyCover5000.selectSACitizen(string4);
        familyCover5000.clickTextBox();
        familyCover5000.enterID(string5);
        familyCover5000.confirmID(string6);
        familyCover5000.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        familyCover5000.selectMonthlyIncome(string7);
        familyCover5000.selectOccupation(string8);
        familyCover5000.selectEduction(string9);
        familyCover5000.enterCellNum(string10);
        familyCover5000.enterPostalAddress(string11);
        familyCover5000.enterPostalCode(string12);
        familyCover5000.clickCopyPhysical();
        familyCover5000.clickValidateBtn();
        familyCover5000.clickSaveMMBtn();
    }


    @When("user add payer details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) throws InterruptedException {
        familyCover5000.navigatePayer();
        familyCover5000.selectTittle(string);
        familyCover5000.enterName(string2);
        familyCover5000.enterSurname(string3);
        familyCover5000.fieldTextID();
        familyCover5000.mainIDPopUp(string4);
        familyCover5000.confirmationID(string5);
        familyCover5000.clickOK();
        familyCover5000.PayerRelation(string6);
        familyCover5000.selectDebit(string7);
        familyCover5000.selectDebiDate(string8);
        familyCover5000.selectBank(string9);
        familyCover5000.selectBranch(string10);
        familyCover5000.selectAccType(string11);
        familyCover5000.enterAccNum();
        familyCover5000.enterMainAcc(string12);
        familyCover5000.confirmAccount(string13);
        familyCover5000.OKButton();
        familyCover5000.enterMobiNum(string14);
        familyCover5000.isEmployee(string15);
        familyCover5000.confCheckBoxes();
        familyCover5000.clickSaveBtn();

    }

    @Then("user add spouse details by capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_spouse_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover5000.navigateSpouse();
        familyCover5000.spouseTitle(string);
        familyCover5000.spouseName(string2);
        familyCover5000.spouseSurName(string3);
        familyCover5000.spouseGender(string4);
        familyCover5000.spouseID(string5);


    }

    @When("user add child details by capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_child_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        familyCover5000.navigateChild();
        familyCover5000.clickTab();
        familyCover5000.enterChildName(string);
        familyCover5000.enterChildSurname(string2);
        familyCover5000.selectGender(string3);
        familyCover5000.enterChildID(string4);
        familyCover5000.ChildIsStudent(string5);
    }
    @Then("User proceed with the Cover and conclude sale")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        familyCover5000.navigateBeneficiary();
        familyCover5000.addBeneficiary();
        familyCover5000.selectRelation("Member Estate");
        familyCover5000.saveBeneficiary();
        familyCover5000.navigateFICA();
        familyCover5000.navigatePremium();
        familyCover5000.navigateRewards();
        familyCover5000.navigateSummary();
        familyCover5000.debiCheck();
        familyCover5000.summaryTable();

    }


}
