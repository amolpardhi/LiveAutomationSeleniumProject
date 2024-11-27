package pages.RegisterPage;

import base.BasePage;
import genericCodes.EmailWithTimeStamp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;

public class TC_RF_001 extends BasePage {

    //locators to RegisterPage
    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement MyAccount;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(),'Register')]")
    private WebElement Register;

    //locators of Register Filed
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement FirstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement LastName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement E_Mail;

    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement Telephone;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='confirm']")
    private WebElement confirmPassword;

    @FindBy(xpath = "//input[@name='agree']")
    private WebElement agreePolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    public WebElement actualText;

    public TC_RF_001() {
        PageFactory.initElements(driver, this);
    }

    public void RegisterClick(){
        MyAccount.click();
        Register.click();
    }

    public  void RegisterWithMandatoryFields(){
        FirstName.sendKeys("Amol");
        LastName.sendKeys("Pardhi");
        E_Mail.sendKeys(EmailWithTimeStamp.genericEmail());
        Telephone.sendKeys("1234567890");
        password.sendKeys("12345");
        confirmPassword.sendKeys("12345");
        agreePolicy.click();
        continueButton.click();
    }
}
