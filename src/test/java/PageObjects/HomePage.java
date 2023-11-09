package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageObject {

    String Url = "https://shambawebtest.clientele.co.za/shambaweb/home";

    String LoginBtn = "//*[@id=\"navbarSupportedContent\"]/div/div/button/span";
    String UserName = "//*[@id=\"i0116\"]";

    String NextBtn = "//*[@id=\"idSIButton9\"]";

    String Password = "//*[@id=\"i0118\"]";

    String SignIn = "//*[@id=\"idSIButton9\"]";


    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }

    @Step("Clicks on LoginButton")
    public void LoginButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );

       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginBtn)));

       element.click();


    }
    @Step("Enter Username ")
    public void Username(String Username){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );

       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserName)));

       element.click();

       WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserName)));

       element1.sendKeys(Username);


    }

    @Step("Clicks on NextButton")
    public void NextButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );

       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NextBtn)));

       element.click();

    }

    @Step("Enter Password")
    public void Password(String password){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Password)));

        element.click();

       WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Password)));

       element1.sendKeys(password);


    }

    @Step("Clicks on SignIn")
    public void SignIn() throws  InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SignIn)));

        element.click();
        Thread.sleep(5000);
    }



}
