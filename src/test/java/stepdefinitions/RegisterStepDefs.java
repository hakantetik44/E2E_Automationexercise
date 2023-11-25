package stepdefinitions;


import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Driver.getWebDriver;
import static utils.ReusableMethods.*;


public class RegisterStepDefs {

    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(getWebDriver());
    public final Faker faker = new Faker();


    @Given("Go to home page")
    public void goToHomePage() {

        String expectedTitle = "Automation Exercise";

        assertEquals(getWebDriver().getTitle(), expectedTitle);
    }

    @When("Click on {string} button")
    public void clickOnButton(String buttonName) {
        registerPage.signupLoginButton.click();
    }

    @Then("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible(String textNewUserSignup) {
        String expectedText = "New User Signup!";
        assertTrue(registerPage.textNewUserSignup.getText().contains(expectedText));

    }


    @When("Enter name and email address")
    public void enterNameAndEmailAddress() {
        String name = faker.name().fullName();
        String email = faker.internet().emailAddress();

        registerPage.placeName.sendKeys(name);
        registerPage.placeEmailAdressSignup.sendKeys(email);


    }

    @And("Click {string} button")
    public void clickButton(String buttonSignup) {

        registerPage.btnSignup.click();


    }

    @Then("Verify that {string} is visible")
    public void verifyThatIsVisible(String ENTERACCOUNTINFORMATION) {

        assertTrue(registerPage.textEnterAccountInformation.isDisplayed());


    }

    @When("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {

        String expectedTitleSignup = "Automation Exercise - Signup";
        assertTrue(getWebDriver().getTitle().contains(expectedTitleSignup));
        if (!registerPage.titleGender.isSelected()) {
            registerPage.titleGender.click();
        }
        registerPage.placeNameSignup.clear();
        String name = faker.name().fullName();
        String password = faker.internet().password();

        registerPage.placeNameSignup.sendKeys(name);
        registerPage.placePassword.sendKeys(password);

        registerPage.DayOfBirth.click();

        int randomDay = getRandomDay();
        System.out.println("Selected random day: " + randomDay);
        registerPage.DayOfBirth.sendKeys(Integer.toString(randomDay));

        registerPage.MonthOfBirth.click();

        String randomMonth = getRandomMonth();
        System.out.println("Selected random month: " + randomMonth);
        registerPage.MonthOfBirth.sendKeys(randomMonth);

        registerPage.YearOfBirth.click();
        int randomYear = getRandomYear();
        System.out.println("Selected random year: " + randomYear);
        registerPage.YearOfBirth.sendKeys(Integer.toString(randomYear));


    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {

        registerPage.checboxNewlestter.click();


    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        registerPage.checboxPartners.click();

    }

    @And("Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
        scrollDown(getWebDriver(), 500);
        registerPage.placeFirstName.sendKeys(faker.name().firstName());
        registerPage.placeLastName.sendKeys(faker.name().lastName());
        registerPage.placeCompany.sendKeys(faker.address().streetName());
        registerPage.placeAddress.sendKeys(faker.address().streetAddress());
        registerPage.placeAdress2.sendKeys(faker.address().secondaryAddress());
        registerPage.placeState.sendKeys(faker.address().state());
        registerPage.placeCity.sendKeys(faker.address().city());
        registerPage.placeZipCode.sendKeys(faker.address().zipCode());
        registerPage.placeMobileNumber.sendKeys(faker.phoneNumber().phoneNumber());


    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {

        registerPage.btnCreateAccount.click();


    }

    @Then("Verify  that ACCOUNT CREATED! is visible.")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        assertTrue(registerPage.textAccountCreated.isDisplayed());
        System.out.println(registerPage.textAccountCreated.getText());


    }

    @When("Click button Continue")
    public void clickButtonContinue() {
        registerPage.btnContinue.click();
    }


    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        assertTrue(registerPage.btnLogged.isDisplayed());
        System.out.println(registerPage.btnLogged.getText());
    }

    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {
        registerPage.btnDelete.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        assertTrue(registerPage.textAccountDeleted.isDisplayed());
        System.out.println(registerPage.textAccountDeleted.getText());
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        registerPage.btnContinue.click();
    }
}