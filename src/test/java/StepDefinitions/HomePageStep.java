package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class HomePageStep extends PageObject {
    @Steps
    HomePage homePage;


    @Given("user opens the URL")
    public void user_opens_the_url() throws InterruptedException {
        homePage.OpenWebsite();
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button(){
        homePage.LoginButton();

    }
    @When("user enters {string}")
    public void user_enters(String username){
        homePage.Username(username);

    }
    @When("user clicks on next button")
    public void user_clicks_on_next_button(){
        homePage.NextButton();
    }
    @Then("user Input {string}")
    public void user_input(String password){
        homePage.Password(password);

    }
    @Then("user clicks on sign-in button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        homePage.SignIn();
        Thread.sleep(5000);
    }

}
