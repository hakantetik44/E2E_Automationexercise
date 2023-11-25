package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import static utils.Driver.getWebDriver;


public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(css="a[href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement textNewUserSignup;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement placeName;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement placeEmailAdressSignup;

    @FindBy(css="button[data-qa='signup-button']")
    public WebElement  btnSignup;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement textEnterAccountInformation;

    @FindBy(css = "#name")
    public WebElement placeNameSignup;

    @FindBy(css="#password")
    public WebElement placePassword;

    @FindBy(css="input[id='id_gender1']")
    public WebElement titleGender;

    @FindBy(css = "#days")
    public WebElement DayOfBirth;

    @FindBy(css = "#months")
    public WebElement MonthOfBirth;

    @FindBy(css = "#years")
    public WebElement YearOfBirth;

    @FindBy(css="#newsletter")
    public WebElement checboxNewlestter;

    @FindBy(css="#optin")
    public WebElement checboxPartners;

    @FindBy(css = "#first_name")
    public WebElement placeFirstName;

    @FindBy(css = "#last_name")
    public WebElement placeLastName;
    @FindBy(css = "#company")
    public WebElement placeCompany;

    @FindBy(css = "#address1")
    public WebElement placeAddress;

    @FindBy(css = "#address2")
    public WebElement placeAdress2;

    @FindBy(css = "#state")
    public WebElement placeState;

    @FindBy(css = "#city")
    public WebElement placeCity;

    @FindBy(css = "#zipcode")
    public WebElement placeZipCode;

    @FindBy(css = "#mobile_number")
    public WebElement placeMobileNumber;

    @FindBy(css="button[data-qa='create-account']")
    public  WebElement btnCreateAccount;

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    public WebElement textAccountCreated;

    @FindBy(css = ".btn.btn-primary")
    public  WebElement btnContinue;

    @FindBy(css = "li:nth-child(10) a:nth-child(1)")
    public WebElement btnLogged;

    @FindBy(css = "a[href='/delete_account']")
    public WebElement btnDelete;

    @FindBy(css = "h2[class='title text-center'] b")
    public WebElement textAccountDeleted;






}







