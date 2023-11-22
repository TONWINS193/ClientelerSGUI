package StepDefinitions.IndividualCover.HELPStep;

import PageObjects.IndividualCover.HELP.LumpSumCover25000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LumpSumCover25000Step extends PageObject {

    @Steps
    LumpSumCover25000 lumpSumCover25000;


    @Given("user log in Shamba  website")
    public void user_log_in_shamba_website() throws InterruptedException {
        lumpSumCover25000.OpenWebsite();
        lumpSumCover25000.loginIn("WRambau@clientele.co.za", "clientele003");
        lumpSumCover25000.ClienteleLogo();
        lumpSumCover25000.CaptureSale();
        lumpSumCover25000.LeadBasket();
        lumpSumCover25000.selectNew();
        lumpSumCover25000.LeadCheckBox();
        lumpSumCover25000.ActionSaleButton();

    }
    @When("user Select the plan option: Individual or Member and Family")
    public void user_select_the_plan_option_individual_or_member_and_family() throws InterruptedException {
        lumpSumCover25000.HelpIconButton();
        lumpSumCover25000.SelectPlanTextDropdown("YA");
        lumpSumCover25000.SelectPlanOkBtn();

    }
    @Then("user Select the Date of Birth of the main life assured")
    public void user_select_the_date_of_birth_of_the_main_life_assured() throws InterruptedException {
        lumpSumCover25000.GetRatesBtn();
        lumpSumCover25000.SelectPlanOption();
        lumpSumCover25000.SelectDoB("1961-06-03");
    }
    @When("user on the slider select the premium cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_premium_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        lumpSumCover25000.selectCoverAmount();
        lumpSumCover25000.ViewRates();
        lumpSumCover25000.StartSale();
        lumpSumCover25000.handleModelPopUp();
        //Main Member details
        lumpSumCover25000.selectTittleDropdown("Mr");
        lumpSumCover25000.EnterName("Shade");
        lumpSumCover25000.EnterSurname("Mills");
        lumpSumCover25000.selectSACitizen("Yes");
        lumpSumCover25000.clickTextBox();
        lumpSumCover25000.enterID("6106035364081");
        lumpSumCover25000.confirmID("6106035364081");
        lumpSumCover25000.clickOKButton();
        //lumpSumCover25000.EnterDoB("1962-06-03");
        lumpSumCover25000.selectMonthlyIncome("Up to 3,000");
        lumpSumCover25000.selectOccupation("Sales and services");
        lumpSumCover25000.selectEduction("Matric");
        lumpSumCover25000.enterCellNum("0601234231");
        lumpSumCover25000.enterPostalAddress("Plot 30 ward 55 ");
        lumpSumCover25000.enterPostalCode("1234");
        lumpSumCover25000.clickCopyPhysical();
        lumpSumCover25000.clickValidateBtn();
        lumpSumCover25000.clickSaveMMBtn();
        //Payer Details
        lumpSumCover25000.navigatePayer();
        lumpSumCover25000.selectTittle("Miss");
        lumpSumCover25000.enterName("Joy");
        lumpSumCover25000.enterSurname("McGregor");
        lumpSumCover25000.fieldTextID();
        lumpSumCover25000.mainIDPopUp("9606035120182");
        lumpSumCover25000.confirmationID("9606035120182");
        lumpSumCover25000.clickOK();
        lumpSumCover25000.PayerRelation("Sister");
        lumpSumCover25000.selectDebit("1");
        lumpSumCover25000.selectDebiDate("01 Dec 2023");
        lumpSumCover25000.selectBank("CAPITEC BANK LTD");
        lumpSumCover25000.selectBranch("470010");
        lumpSumCover25000.selectAccType("Savings Account");
        lumpSumCover25000.enterAccNum();
        lumpSumCover25000.enterMainAcc("1234");
        lumpSumCover25000.confirmAccount("1234");
        lumpSumCover25000.OKButton();
        lumpSumCover25000.enterMobiNum("0601234230");
        lumpSumCover25000.isEmployee("No");
        lumpSumCover25000.confCheckBoxes();
        lumpSumCover25000.clickSaveBtn();

    }
    @Then("user proceed with the Cover and Conclude sale")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        lumpSumCover25000.navigateBeneficiary();
        lumpSumCover25000.addBeneficiary();
        lumpSumCover25000.selectRelation("Member Estate");
        lumpSumCover25000.saveBeneficiary();
        lumpSumCover25000.navigateFICA();
        lumpSumCover25000.navigatePremium();
        lumpSumCover25000.navigateRewards();
        lumpSumCover25000.navigateSummary();
        lumpSumCover25000.debiCheck();
        lumpSumCover25000.summaryTable();

    }
}
