package StepDefinitions;

import PageObjects.IndividualCover.LumpSumCover20000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LumpSumCover20000Step extends PageObject {

    @Steps
    LumpSumCover20000 lumpSumCover20000;

    @Given("user log in SGUI  website")
    public void user_log_in_sgui_website() throws InterruptedException {
        lumpSumCover20000.OpenWebsite();
        lumpSumCover20000.loginIn("WRambau@clientele.co.za", "clientele003");
        lumpSumCover20000.ClienteleLogo();
        lumpSumCover20000.CaptureSale();
        lumpSumCover20000.LeadBasket();
        lumpSumCover20000.selectNew();
        lumpSumCover20000.LeadCheckBox();
        lumpSumCover20000.ActionSaleButton();

    }
    @When("user Select the plan option: Individual or Member and family")
    public void user_select_the_plan_option_individual_or_member_and_family() throws InterruptedException {
        lumpSumCover20000.HelpIconButton();
        lumpSumCover20000.SelectPlanTextDropdown("YA");
        lumpSumCover20000.SelectPlanOkBtn();

    }
    @Then("user Select the Date of birth of the main life assured")
    public void user_select_the_date_of_birth_of_the_main_life_assured() throws InterruptedException {
        lumpSumCover20000.GetRatesBtn();
        lumpSumCover20000.SelectPlanOption();
        lumpSumCover20000.SelectDoB("1961-06-03");

    }
    @When("user on the slider select the cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        lumpSumCover20000.selectCoverAmount();
        lumpSumCover20000.ViewRates();
        lumpSumCover20000.StartSale();
        lumpSumCover20000.handleModelPopUp();
        //Main Member details
        lumpSumCover20000.selectTittleDropdown("Mr");
        lumpSumCover20000.EnterName("Shade");
        lumpSumCover20000.EnterSurname("Mills");
        lumpSumCover20000.selectSACitizen("Yes");
        lumpSumCover20000.clickTextBox();
        lumpSumCover20000.enterID("6106036188083");
        lumpSumCover20000.confirmID("6106036188083");
        lumpSumCover20000.clickOKButton();
        //lumpSumCover20000.EnterDoB("1992-06-03");
        lumpSumCover20000.selectMonthlyIncome("Up to 3,000");
        lumpSumCover20000.selectOccupation("Sales and services");
        lumpSumCover20000.selectEduction("Matric");
        lumpSumCover20000.enterCellNum("0601234231");
        lumpSumCover20000.enterPostalAddress("Plot 30 ward 55 ");
        lumpSumCover20000.enterPostalCode("1234");
        lumpSumCover20000.clickCopyPhysical();
        lumpSumCover20000.clickValidateBtn();
        lumpSumCover20000.clickSaveMMBtn();
        //Payer Details
        lumpSumCover20000.navigatePayer();
        lumpSumCover20000.selectTittle("Miss");
        lumpSumCover20000.enterName("Joy");
        lumpSumCover20000.enterSurname("McGregor");
        lumpSumCover20000.fieldTextID();
        lumpSumCover20000.mainIDPopUp("9606035120182");
        lumpSumCover20000.confirmationID("9606035120182");
        lumpSumCover20000.clickOK();
        lumpSumCover20000.PayerRelation("Sister");
        lumpSumCover20000.selectDebit("1");
        lumpSumCover20000.selectDebiDate("01 Dec 2023");
        lumpSumCover20000.selectBank("CAPITEC BANK LTD");
        lumpSumCover20000.selectBranch("470010");
        lumpSumCover20000.selectAccType("Savings Account");
        lumpSumCover20000.enterAccNum();
        lumpSumCover20000.enterMainAcc("1234");
        lumpSumCover20000.confirmAccount("1234");
        lumpSumCover20000.OKButton();
        lumpSumCover20000.enterMobiNum("0601234230");
        lumpSumCover20000.isEmployee("No");
        lumpSumCover20000.confCheckBoxes();
        lumpSumCover20000.clickSaveBtn();

    }
    @Then("user proceed with the Cover and conclude sale")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        lumpSumCover20000.navigateBeneficiary();
        lumpSumCover20000.addBeneficiary();
        lumpSumCover20000.selectRelation("Member Estate");
        lumpSumCover20000.saveBeneficiary();
        lumpSumCover20000.navigateFICA();
        lumpSumCover20000.navigatePremium();
        lumpSumCover20000.navigateRewards();
        lumpSumCover20000.navigateSummary();
        lumpSumCover20000.debiCheck();
        lumpSumCover20000.summaryTable();

    }

}
